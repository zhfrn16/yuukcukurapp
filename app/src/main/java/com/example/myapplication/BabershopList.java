package com.example.myapplication;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BabershopList extends AppCompatActivity implements BabershopAdapter.OnBarberHolderClickListener{

    RecyclerView rvBaber;
    BabershopAdapter babershopAdapter;
    ArrayList<Babershop> babershopArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listbaber);

        GetData();

        rvBaber = findViewById(R.id.rvBaber);

        babershopAdapter = new BabershopAdapter(babershopArrayList);
        babershopAdapter.setListener(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(BabershopList.this);

        rvBaber.setLayoutManager(layoutManager);
        rvBaber.setAdapter(babershopAdapter);
    }

    public void GetData(){
        babershopArrayList = new ArrayList<>();
        babershopArrayList.add(new Babershop("Lion Babershop", "Open"));
        babershopArrayList.add(new Babershop("Metal Babershop", "Open"));
        babershopArrayList.add(new Babershop("Wolf Babershop", "Open"));
        babershopArrayList.add(new Babershop("Mafia Babershop", "Open"));
        babershopArrayList.add(new Babershop("Viper Babershop", "Open"));
        babershopArrayList.add(new Babershop("Saitama Babershop", "Open"));
        babershopArrayList.add(new Babershop("Spartan Babershop", "Open"));
        babershopArrayList.add(new Babershop("Zeus Babershop", "Open"));
        babershopArrayList.add(new Babershop("Hades Babershop", "Close"));
        babershopArrayList.add(new Babershop("King Babershop", "Open"));
    }

    @Override
    public void onClick() {

        Toast.makeText(rvBaber.getContext(), "berhasil",
                Toast.LENGTH_SHORT).show();
    }

//    public void BabershopList(View view) {
//        Intent mainIntent = new Intent(getBaseContext(), BabershopList.class);
//        startActivity(mainIntent);
//    }



}