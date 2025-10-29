package gk1.nguyenviethoang.thigiuaki;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ChiTietMonActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_mon);

        TextView txt = findViewById(R.id.txtChiTietMon);
        String tenMon = getIntent().getStringExtra("tenMon");
        txt.setText("Chi tiết của " + tenMon);
    }
}
