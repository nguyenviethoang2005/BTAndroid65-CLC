package th.nguyenviethoang.th_currency_converter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUsd;
    TextView txtVnd;
    Button btnConvert;

    // Hard-code tỷ giá
    final double RATE = 25000.0; // 1 USD = 25,000 VND

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsd = findViewById(R.id.edtUsd);
        txtVnd = findViewById(R.id.txtVnd);
        btnConvert = findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usdStr = edtUsd.getText().toString().trim();

                if (usdStr.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập số USD!", Toast.LENGTH_SHORT).show();
                    return;
                }

                double usd = Double.parseDouble(usdStr);
                double vnd = usd * RATE;
                txtVnd.setText(String.format("%,.0f VND", vnd));
            }
        });
    }
}
