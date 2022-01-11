package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Rest.ApiClient;
import com.example.myapplication.Rest.ApiInterface;

import java.util.List;

import Model.GetBarber;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BabershopList extends AppCompatActivity {

    RecyclerView rvBaber;
    BabershopAdapter babershopAdapter;

    private ApiInterface apiInterface;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listbaber);



        //Retrofit Recycler View

        rvBaber = findViewById(R.id.rvBaber);
        rvBaber.setHasFixedSize(true);

        layoutManager = new GridLayoutManager(this, 1);

        rvBaber.setLayoutManager(layoutManager);
        callRetrofit();

    }

    private void callRetrofit() {
        //membuat object retrofit
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

        Call<List<GetBarber>> call = apiInterface.getBarber();

        call.enqueue(new Callback<List<GetBarber>>() {
            @Override
            public void onResponse(Call<List<GetBarber>> call, Response<List<GetBarber>> response) {

                if (response.isSuccessful()){
                    List<GetBarber> get = response.body();
                    babershopAdapter = new BabershopAdapter(BabershopList.this,get);
                    rvBaber.setAdapter(babershopAdapter);

                }
            }

            @Override
            public void onFailure(Call<List<GetBarber>> call, Throwable t) {

            }


        });

    }




}