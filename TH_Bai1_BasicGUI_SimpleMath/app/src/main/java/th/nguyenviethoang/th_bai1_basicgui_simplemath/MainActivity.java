package th.nguyenviethoang.th_bai1_basicgui_simplemath;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    EditText edtA, edtB;
    Spinner spnPhepToan;
    Button btnTinh;
    TextView txtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        spnPhepToan = findViewById(R.id.spnPhepToan);
        btnTinh = findViewById(R.id.btnTinh);
        txtKetQua = findViewById(R.id.txtKetQua);

        // Khởi tạo danh sách phép toán
        String[] phepToan = {"+", "-", "*", "/"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, phepToan);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnPhepToan.setAdapter(adapter);

        btnTinh.setOnClickListener(v -> tinhToan());
    }

    private void tinhToan() {
        try {
            double a = Double.parseDouble(edtA.getText().toString());
            double b = Double.parseDouble(edtB.getText().toString());
            String pt = spnPhepToan.getSelectedItem().toString();

            double kq;

            switch (pt) {
                case "+": kq = a + b; break;
                case "-": kq = a - b; break;
                case "*": kq = a * b; break;
                case "/":
                    if (b == 0) {
                        Toast.makeText(this, "Không thể chia cho 0", Toast.LENGTH_SHORT).show();
                        txtKetQua.setText("Kết quả: Không xác định");
                        return;
                    } else {
                        kq = a / b;
                    }
                    break;
                default:
                    kq = 0;
            }

            // Nếu là số nguyên thì bỏ .0
            String hienThi;
            if (kq == (long) kq) {
                hienThi = String.format("%d", (long) kq);
            } else {
                hienThi = String.format("%.4f", kq);
            }

            txtKetQua.setText("Kết quả: " + hienThi);

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Vui lòng nhập số hợp lệ!", Toast.LENGTH_SHORT).show();
        }
    }
}
