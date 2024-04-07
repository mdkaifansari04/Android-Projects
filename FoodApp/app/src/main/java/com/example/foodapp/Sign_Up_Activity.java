package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sign_Up_Activity extends AppCompatActivity {

    TextView linkToLogin, registerButton ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        linkToLogin = findViewById(R.id.linkToLogin);
        registerButton = findViewById(R.id.registerButton);

        linkToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_Up_Activity.this, Sign_Up_Activity.class);
                startActivity(intent);
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerButton = findViewById(R.id.linkToSignup);
                Intent intent = new Intent(Sign_Up_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}