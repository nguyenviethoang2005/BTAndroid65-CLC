package gk1.nguyenviethoang.thigiuaki;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class GioiThieuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gioi_thieu);

        TextView txt = findViewById(R.id.txtThongTin);
        txt.setText("Ứng dụng được thực hiện bởi Nguyễn Viết Hoàng - Lớp 65CNTT-CLC\nGiảng viên: Thầy Mai Cường Thọ");
    }
}
