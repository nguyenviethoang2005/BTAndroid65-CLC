package gk1.nguyenviethoang.thigiuaki;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity {
    EditText edtWeight, edtHeight;
    TextView txtResult;
    Button btnTinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        edtWeight = findViewById(R.id.edtWeight);
        edtHeight = findViewById(R.id.edtHeight);
        txtResult = findViewById(R.id.txtResult);
        btnTinh = findViewById(R.id.btnTinh);

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double w = Double.parseDouble(edtWeight.getText().toString());
                double h = Double.parseDouble(edtHeight.getText().toString()) / 100;
                double bmi = w / (h * h);

                String status;
                if (bmi < 18.5) status = "Gầy";
                else if (bmi < 25) status = "Bình thường";
                else if (bmi < 30) status = "Thừa cân";
                else status = "Béo phì";

                txtResult.setText(String.format("BMI: %.2f - %s", bmi, status));
            }
        });
    }
}
