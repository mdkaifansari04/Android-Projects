package com.example.onclickmethods;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvBtn1, tvBtn2, tvBtn3, tvBtn4, tvBtn5, tvBtn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBtn1 = findViewById(R.id.tvBtn1);
        tvBtn2 = findViewById(R.id.tvBtn2);
        tvBtn3 = findViewById(R.id.tvBtn3);
        tvBtn4 = findViewById(R.id.tvBtn4);
        tvBtn5 = findViewById(R.id.tvBtn5);
        tvBtn6 = findViewById(R.id.tvBtn6);

        tvBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,   "This is btn 1", Toast.LENGTH_SHORT).show();
            }
        });
        
        tvBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is btn 2", Toast.LENGTH_SHORT).show();
            }
        });

        tvBtn3.setOnClickListener(this);
        tvBtn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tvBtn3) {
            Toast.makeText(this, "This is button 3", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.tvBtn4) {
            Toast.makeText(this, "This is button 4", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Id not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void showButton4(View view) {
        Toast.makeText(this, "This is button 5", Toast.LENGTH_SHORT).show();
    }

    public void showButton5(View view) {
        Toast.makeText(this, "This is button 6", Toast.LENGTH_LONG).show();
    }
}