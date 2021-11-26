package com.example.myapplication;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ScheduleMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule);
    }


    public void scheduleMenu(View view) {
        Intent mainIntent = new Intent(getBaseContext(), TreatmentMenu.class);
        startActivity(mainIntent);
    }

    public void scheduleMenu2(View view) {
        Intent mainIntent = new Intent(getBaseContext(), TreatmentMenu.class);
        startActivity(mainIntent);
    }

    public void scheduleMenu3(View view) {
        Intent mainIntent = new Intent(getBaseContext(), TreatmentMenu.class);
        startActivity(mainIntent);
    }
}