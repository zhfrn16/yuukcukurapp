package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class Signup extends AppCompatActivity {
    Button SignUp;
    EditText username,mobilephone,email,password, password2;
    String  name,phone,mail,pass,pass2;
    String cekUsername,cekMobilephone,cekEmail,cekPass1,cekPass2;
    String userID;
    Boolean samePass;
    FirebaseAuth mAuth;
    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        username = findViewById(R.id.Username);
        password = findViewById(R.id.Password1);
        password2 = findViewById(R.id.Password2);
        SignUp = findViewById(R.id.buttondaftar);
        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();

//        SignUp.setOnClickListener(new View.OnClickListener() {
//
//
//            public void onClick(View view) {
//                Intent mainIntent = new Intent(getBaseContext(), Login.class);
//                startActivity(mainIntent);
//            }


//            awal signup coba

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(getBaseContext(), Login.class);
                startActivity(mainIntent);
                Toast.makeText(Signup.this, "Daftar Berhasil", Toast.LENGTH_SHORT).show();
            }
        });
    }
//            akhir signup coba


//                cekUsername = username.getText().toString();
//                cekMobilephone = mobilephone.getText().toString();
//                cekEmail = email.getText().toString();
//                cekPass1 = password.getText().toString();
//                cekPass2 = password2.getText().toString();
//                samePass = cekPass1.equals(cekPass2);
//
//                if(cekUsername.isEmpty()){
//                    Toast.makeText(Signup.this, "Registry failed, please fill username",
//                            Toast.LENGTH_SHORT).show();
//                }else if(cekEmail.isEmpty() || cekPass1.isEmpty() || cekPass2.isEmpty()){
//                    Toast.makeText(Signup.this, "Registry failed, please fill email and password",
//                            Toast.LENGTH_SHORT).show();
//                }
//                else if (samePass){
//                    Register();
//
//                }else{
//                    Toast.makeText(Signup.this, "Registry failed, please check your password again",
//                            Toast.LENGTH_SHORT).show();
//                }


//        }
//        });
//
//    }

//    private void Register() {
//        name = username.getText().toString();
//        mail = email.getText().toString();
//        pass = password.getText().toString();
//        pass2 = password2.getText().toString();
//        mAuth.createUserWithEmailAndPassword(mail, pass2)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//                            Toast.makeText(Signup.this, "Registry Success",
//                                    Toast.LENGTH_SHORT).show();
//                            userID = mAuth.getCurrentUser().getUid();
//                            DocumentReference documentReference = db.collection("users").document(userID);
//                            Map<String,Object> user = new HashMap<>();
//                            user.put("fName",name);
//                            user.put("phone",phone);
//                            user.put("email",mail);
//                            documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
//                                @Override
//                                public void onSuccess(Void aVoid) {
//                                    Log.d(TAG,"onSuccess: user Profile is created for "+userID);
//                                }
//                            }).addOnFailureListener(new OnFailureListener() {
//                                @Override
//                                public void onFailure(@NonNull Exception e) {
//                                    Log.w(TAG, "onFailure: " + e.toString());
//                                }
//                            });
//
//                            Intent intent2 = new Intent(Signup.this, Login.class);
//                            Signup.this.startActivity(intent2);
//                        } else {
//                            // If sign in fails, display a message to the user.
//                            Toast.makeText(Signup.this, "Registry Failed",
//                                    Toast.LENGTH_SHORT).show();
//
//                        }
//
//                        // ...
//                    }
//                });
//    }
}
