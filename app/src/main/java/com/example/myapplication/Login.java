package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    EditText editTextUsername,editTextPassword;
    String email,pass;
    String cekemail,cekPass1;
    Button buttonlogin;
//    private Config config;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonlogin = findViewById(R.id.buttonlogin);
        mAuth = FirebaseAuth.getInstance();
        buttonlogin.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                cekemail = editTextUsername.getText().toString();
                cekPass1 = editTextPassword.getText().toString();

                if (cekemail.equals("admin") && cekPass1.equals("12345")) {
                    Intent mainIntent = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(mainIntent);
                    Toast.makeText(Login.this,"Login Berhasil",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Login.this,"Username atau Password Salah",Toast.LENGTH_SHORT).show();
                    editTextUsername.setText("");
                    editTextPassword.setText("");
                }

            }
        });
        //sign up  intent
        TextView Signup2 = (TextView) findViewById(R.id.textregister);
        Signup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Login.this, Signup.class);
                Login.this.startActivity(intent2);

            }
        });}

//    public void progressLogin(Boolean active){
//        EditText editUsername = findViewById(R.id.editTextUsername);
//        EditText editPassword = findViewById(R.id.editTextPassword);
//        Button buttonLogin = findViewById(R.id.buttonlogin);
//        ProgressBar progressBar = findViewById(R.id.progressbar2);
//
//        if(active){
//            editUsername.setEnabled(false);
//            editPassword.setEnabled(false);
//            buttonLogin.setEnabled(false);
//            progressBar.setVisibility(View.VISIBLE);
//        }
//        else{
//            editUsername.setEnabled(true);
//            editPassword.setEnabled(true);
//            buttonLogin.setEnabled(true);
//            progressBar.setVisibility(View.GONE);
//        }
//    }

}