package gk1.nguyenviethoang.thigiuaki;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GioiThieuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gioi_thieu);

        TextView txt = findViewById(R.id.txtInfo);
        txt.setText("Ứng dụng thi giữa kỳ – Nguyễn Viết Hoàng\nMSSV: ...\nLớp: 65CNTT-CLC");
    }
}
