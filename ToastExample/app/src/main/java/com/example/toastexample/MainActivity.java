package com.example.toastexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button byDefault, singleGravity , multipleGravity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        byDefault = findViewById(R.id.byDefault);
        singleGravity = findViewById(R.id.singleGravity);
        multipleGravity= findViewById(R.id.multipleGravity);

        byDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is default toast", Toast.LENGTH_LONG).show();
            }
        });
        singleGravity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this , "This is the gravity toast", Toast.LENGTH_LONG);
              toast.setGravity(Gravity.CENTER, 0, 0);
              toast.show();
            }
        });
        multipleGravity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Toast toast = Toast.makeText(MainActivity.this, "This is muliple gravity  toast", Toast.LENGTH_LONG);
              toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 10, 90);
              toast.show();
            }
        });
    }
}