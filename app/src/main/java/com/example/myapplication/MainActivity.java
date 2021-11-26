package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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





}
