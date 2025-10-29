package gk1.nguyenviethoang.thigiuaki;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChiTietBaiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_bai);

        TextView tv = findViewById(R.id.txtBaiThuoc);
        String tenBai = getIntent().getStringExtra("bai");
        tv.setText("Chi tiết bài thuốc: " + tenBai);
    }
}
