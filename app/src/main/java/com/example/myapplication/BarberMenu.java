package com.example.myapplication;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class BarberMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilihcapster);
    }

    public void barberMenu(View view) {
        Intent mainIntent = new Intent(getBaseContext(), ScheduleMenu.class);
        startActivity(mainIntent);
    }

    public void barberMenu2(View view) {
        Intent mainIntent = new Intent(getBaseContext(), ScheduleMenu.class);
        startActivity(mainIntent);
    }

    public void barberMenu3(View view) {
        Intent mainIntent = new Intent(getBaseContext(), ScheduleMenu.class);
        startActivity(mainIntent);
    }
}