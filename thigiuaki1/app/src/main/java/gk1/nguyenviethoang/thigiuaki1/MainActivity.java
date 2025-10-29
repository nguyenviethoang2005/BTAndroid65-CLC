package gk1.nguyenviethoang.thigiuaki;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBMI = findViewById(R.id.btnBMI);
        Button btnMonAn = findViewById(R.id.btnMonAn);
        Button btnBaiThuoc = findViewById(R.id.btnBaiThuoc);
        Button btnGioiThieu = findViewById(R.id.btnGioiThieu);

        btnBMI.setOnClickListener(v -> startActivity(new Intent(this, BMIActivity.class)));
        btnMonAn.setOnClickListener(v -> startActivity(new Intent(this, MonAnActivity.class)));
        btnBaiThuoc.setOnClickListener(v -> startActivity(new Intent(this, BaiThuocActivity.class)));
        btnGioiThieu.setOnClickListener(v -> startActivity(new Intent(this, GioiThieuActivity.class)));
    }
}
