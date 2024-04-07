package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFirstValue, etSecondValue;
    TextView tvAns ;

    Button add, subtract , divide, multiply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.enFirstValue);
        etSecondValue = findViewById(R.id.enSecondValue);

        tvAns = findViewById(R.id.tvAnswer);
        add = findViewById(R.id.btnAdd);
        subtract =findViewById(R.id.btnSubtract);
        multiply= findViewById(R.id.btnMultiply);
        divide= findViewById(R.id.btnDivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, answer;
                String ans;
                firstValue= Integer.parseInt(etFirstValue.getText().toString());
                secondValue= Integer.parseInt(etSecondValue.getText().toString());
                System.out.println("Test1 : " + firstValue + "Second: " + secondValue);
                answer = (firstValue + secondValue);
                ans = String.valueOf(answer);
                tvAns.setText(ans);
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, answer;
                String ans;
                firstValue= Integer.parseInt(etFirstValue.getText().toString());
                secondValue= Integer.parseInt(etSecondValue.getText().toString());
                System.out.println("Test1 : " + firstValue + "Second: " + secondValue);
                answer = (firstValue - secondValue);
                ans = String.valueOf(answer);
                tvAns.setText(ans);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, answer;
                String ans;
                firstValue= Integer.parseInt(etFirstValue.getText().toString());
                secondValue= Integer.parseInt(etSecondValue.getText().toString());
                System.out.println("Test1 : " + firstValue + "Second: " + secondValue);
                answer = (firstValue * secondValue);
                ans = String.valueOf(answer);
                tvAns.setText(ans);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, answer;
                String ans;
                firstValue= Integer.parseInt(etFirstValue.getText().toString());
                secondValue= Integer.parseInt(etSecondValue.getText().toString());
                System.out.println("Test1 : " + firstValue + "Second: " + secondValue);
                answer = (firstValue / secondValue);
                ans = String.valueOf(answer);
                tvAns.setText(ans);
            }
        });
    }

}