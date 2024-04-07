package com.example.broadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView sharedImage = findViewById(R.id.sharedImage);

        Intent intent = getIntent();
        String intentType = intent.getType();
        String action = intent.getAction();

        if(Intent.ACTION_SEND.equals(action) && intentType != null){
            sharedImage.setImageURI(intent.getParcelableExtra(Intent.EXTRA_STREAM));
        }

    }
}