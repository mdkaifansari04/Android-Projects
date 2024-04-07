package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.window.SplashScreen;

public class Splash_Screen_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                sleep(4000);
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(Splash_Screen_Activity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };thread.start();
    }
}