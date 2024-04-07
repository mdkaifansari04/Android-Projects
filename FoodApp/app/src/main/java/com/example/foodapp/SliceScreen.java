package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.window.SplashScreen;

public class SliceScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slice_screen);

        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                }catch (Exception e){
                    System.out.println("System exception"+ e);
                }
                finally {
                    Intent intent = new Intent(SliceScreen.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        }; thread.start();
    }
}