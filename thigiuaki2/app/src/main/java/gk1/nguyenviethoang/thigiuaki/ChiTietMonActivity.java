package gk1.nguyenviethoang.thigiuaki;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChiTietMonActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_mon);

        TextView tv = findViewById(R.id.txtMonAn);
        String tenMon = getIntent().getStringExtra("mon");
        tv.setText("Chi tiết món ăn: " + tenMon);
    }
}
