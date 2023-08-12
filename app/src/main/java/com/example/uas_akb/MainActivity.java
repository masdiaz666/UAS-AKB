package com.example.uas_akb;
//10120199 - DIAZ YASIR ALMAROGI - IF5

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private FirebaseUser firebaseUser;
    private TextView textname;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textname = findViewById(R.id.name);
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        if (firebaseUser.getDisplayName()!=null) {
            textname.setText(firebaseUser.getDisplayName());
        }else {
            textname.setText("Login gagal");
        }
    }
}