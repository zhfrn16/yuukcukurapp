package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }



    public void menuBarber(View view) {
        //Toast.makeText(this, "Loading", Toast.LENGTH_SHORT).show();
        Intent mainIntent = new Intent(getBaseContext(), BarberMenu.class);
        startActivity(mainIntent);
    }
    public void BabershopListclick(View view) {
        Intent mainIntent = new Intent(getBaseContext(), BabershopList.class);
        startActivity(mainIntent);
    }

    public void checkLogin(View view) {
    }


    public void signup(View view) {
        Intent intent2 = new Intent(getBaseContext(), Signup.class);
        startActivity(intent2);
    }
}
