package com.example.fontstyle;

        import androidx.appcompat.app.AppCompatActivity;

        import android.annotation.SuppressLint;
        import android.graphics.Typeface;
        import android.os.Bundle;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvEnglish, tvHindi, tvUrdu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvUrdu = findViewById(R.id.tvUrdu);
        tvEnglish = findViewById(R.id.tvEnglish);
        tvHindi = findViewById(R.id.tvHindi);

        Typeface hindiFont = Typeface.createFromAsset(getAssets(), "fonts/hindi.ttf");

    }
}