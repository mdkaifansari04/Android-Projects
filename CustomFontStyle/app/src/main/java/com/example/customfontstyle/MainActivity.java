package com.example.customfontstyle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextView tvEnglish, tvHindi, tvUrdu;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvEnglish = findViewById(R.id.tvEnglish);
//        tvHindi = findViewById(R.id.tvHindi);
        tvUrdu = findViewById(R.id.tvUrdu);

//        Typeface tfHindi = Typeface.createFromAsset(getAssets(), "fonts/hindi.ttf");
//        tvHindi.setTypeface(tfHindi);
        Typeface tfEnglish = Typeface.createFromAsset(getAssets(), "fonts/english.ttf");
        tvEnglish.setTypeface(tfEnglish);
        Typeface tfUrdu = Typeface.createFromAsset(getAssets(), "fonts/urdu.ttf");
        tvUrdu.setTypeface(tfUrdu);



        findViewById(R.id.exitBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setIcon(R.drawable.baseline_warning_24)
                        .setTitle("Exit")
                        .setMessage("Are you sure, You want to exit")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                            }
                        })
                        .setNeutralButton("Help", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "Press yes to exit", Toast.LENGTH_SHORT).show();
                            }
                        }).show();
            }
        });



        dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.activity_dialog);
        Objects.requireNonNull(dialog.getWindow()).setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);


        Button info = dialog.findViewById(R.id.infoBtn);
        Button done = dialog.findViewById(R.id.doneBtn);


       info.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "Payement Completed", Toast.LENGTH_SHORT).show();
               dialog.dismiss();
           }
       });

       done.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               dialog.dismiss();
           }
       });


        findViewById(R.id.payBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });

    }
}