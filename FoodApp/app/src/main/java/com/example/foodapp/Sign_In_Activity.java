package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sign_In_Activity extends AppCompatActivity {
    TextView linkToSignUp, loginButton;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        linkToSignUp = findViewById(R.id.linkToSignup);
         loginButton= findViewById(R.id.loginButton);

        linkToSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_In_Activity.this, Sign_Up_Activity.class);
                startActivity(intent);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(Sign_In_Activity.this, MainActivity.class);
               startActivity(intent);
            }
        });
    }
}