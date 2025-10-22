package th.nguyenviethoang.th_bai2_basicgui_bmi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtWeight, edtHeight;
    Button btnCalculate;
    TextView tvResult;
    CheckBox chkAsian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtWeight = findViewById(R.id.edtWeight);
        edtHeight = findViewById(R.id.edtHeight);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvResult = findViewById(R.id.tvResult);
        chkAsian = findViewById(R.id.chkAsian);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String w = edtWeight.getText().toString().trim();
                String h = edtHeight.getText().toString().trim();

                if (w.isEmpty() || h.isEmpty()) {
                    tvResult.setText("⚠️ Vui lòng nhập đầy đủ cân nặng và chiều cao!");
                    return;
                }

                double weight = Double.parseDouble(w);
                double height = Double.parseDouble(h);
                double bmi = weight / (height * height);

                boolean isAsian = chkAsian.isChecked();
                String result;

                if (isAsian) {
                    // Chuẩn châu Á (ngưỡng thấp hơn)
                    if (bmi < 18.5) result = "Gầy";
                    else if (bmi < 23) result = "Bình thường";
                    else if (bmi < 27.5) result = "Thừa cân";
                    else result = "Béo phì";
                } else {
                    // Chuẩn WHO toàn cầu
                    if (bmi < 18.5) result = "Gầy";
                    else if (bmi < 24.9) result = "Bình thường";
                    else if (bmi < 29.9) result = "Thừa cân";
                    else result = "Béo phì";
                }

                tvResult.setText(String.format("BMI: %.2f\nKết luận: %s (%s)",
                        bmi, result, isAsian ? "Chuẩn Châu Á" : "Chuẩn Quốc tế"));
            }
        });
    }
}
