package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView splashAnimation;
    Button covidButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        covidButton = findViewById(R.id.covidButton);
        splashAnimation = findViewById(R.id.splashAnimation);


        covidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                covidButton.setVisibility(View.INVISIBLE);
                splashAnimation.setVisibility(View.VISIBLE);

                Thread thread = new Thread(){
                    @Override
                    public void run() {
                        try {
                        sleep(650);
                        }catch (Exception e){
                            e.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, Detail_activity.class);
                            startActivity(intent);
                            finish();
                        }
                    }
                };thread.start();
            }
        });

    }
}