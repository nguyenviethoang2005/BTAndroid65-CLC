package gk1.nguyenviethoang.thigiuaki;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ChiTietBaiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_bai);

        TextView txt = findViewById(R.id.txtChiTietBai);
        String tenBai = getIntent().getStringExtra("tenBai");
        txt.setText("Chi tiết của " + tenBai);
    }
}
