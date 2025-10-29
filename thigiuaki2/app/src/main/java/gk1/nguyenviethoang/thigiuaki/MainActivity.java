package gk1.nguyenviethoang.thigiuaki;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnBMI, btnMonAn, btnBaiThuoc, btnGioiThieu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBMI = findViewById(R.id.btnBMI);
        btnMonAn = findViewById(R.id.btnMonAn);
        btnBaiThuoc = findViewById(R.id.btnBaiThuoc);
        btnGioiThieu = findViewById(R.id.btnGioiThieu);

        btnBMI.setOnClickListener(v -> startActivity(new Intent(this, BMIActivity.class)));
        btnMonAn.setOnClickListener(v -> startActivity(new Intent(this, MonAnActivity.class)));
        btnBaiThuoc.setOnClickListener(v -> startActivity(new Intent(this, BaiThuocActivity.class)));
        btnGioiThieu.setOnClickListener(v -> startActivity(new Intent(this, GioiThieuActivity.class)));
    }
}
