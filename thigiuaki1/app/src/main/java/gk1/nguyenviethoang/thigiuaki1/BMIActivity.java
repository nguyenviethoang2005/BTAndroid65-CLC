package gk1.nguyenviethoang.thigiuaki;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class BMIActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        EditText edtWeight = findViewById(R.id.edtWeight);
        EditText edtHeight = findViewById(R.id.edtHeight);
        Button btnTinh = findViewById(R.id.btnTinh);
        TextView txtKetQua = findViewById(R.id.txtKetQua);

        btnTinh.setOnClickListener(v -> {
            double weight = Double.parseDouble(edtWeight.getText().toString());
            double height = Double.parseDouble(edtHeight.getText().toString()) / 100;
            double bmi = weight / (height * height);

            String kq;
            if (bmi < 18.5) kq = "Gầy";
            else if (bmi < 25) kq = "Bình thường";
            else if (bmi < 30) kq = "Thừa cân";
            else kq = "Béo phì";

            txtKetQua.setText("BMI = " + String.format("%.1f", bmi) + " (" + kq + ")");
        });
    }
}
