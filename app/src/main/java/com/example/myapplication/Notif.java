package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

public class Notif extends AppCompatActivity {
    private Button btnTrigger;

    @SuppressLint("UnspecifiedImmutableFlag")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.tokennotif);
        btnTrigger = findViewById(R.id.btn_trigger);

        btnTrigger.setOnClickListener(view -> {
            FirebaseMessaging.getInstance().getToken()
                    .addOnCompleteListener(new OnCompleteListener<String>() {
                        @Override
                        public void onComplete(@NonNull Task<String> task) {
                            if (!task.isSuccessful()) {
                                Log.w("FCM", "Fetching FCM registration token failed", task.getException());
                                return;
                            }

                            // Get new FCM registration token
                            String token = task.getResult();

                            // Log and toast

                            Log.d("FCM", token);
                            Toast.makeText(Notif.this, token, Toast.LENGTH_SHORT).show();
                        }
                    });

        });
    }
}
