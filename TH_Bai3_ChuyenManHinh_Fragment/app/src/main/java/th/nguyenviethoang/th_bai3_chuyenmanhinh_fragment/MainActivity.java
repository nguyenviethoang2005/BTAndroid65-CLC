package th.nguyenviethoang.th_bai3_chuyenmanhinh_fragment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnEnglish, btnMath, btnCoding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnglish = findViewById(R.id.btnEnglish);
        btnMath = findViewById(R.id.btnMath);
        btnCoding = findViewById(R.id.btnCoding);

        btnEnglish.setOnClickListener(v -> {
            Intent i = new Intent(this, EnglishActivity.class);
            startActivity(i);
        });

        btnMath.setOnClickListener(v -> {
            Intent i = new Intent(this, MathActivity.class);
            startActivity(i);
        });

        btnCoding.setOnClickListener(v -> {
            Intent i = new Intent(this, CodingActivity.class);
            startActivity(i);
        });
    }
}
