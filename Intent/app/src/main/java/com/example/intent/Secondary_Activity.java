package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Secondary_Activity extends AppCompatActivity {

    TextView t1, t2;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        t1 = findViewById(R.id.textFIrst);
        t2 = findViewById(R.id.textSecond);

        Intent intent = getIntent();
        String data = intent.getStringExtra("data");

        t1.setText("This is an application build by "+ data);
        t2.setText("Welcome "+ data + "👋");


    }
}