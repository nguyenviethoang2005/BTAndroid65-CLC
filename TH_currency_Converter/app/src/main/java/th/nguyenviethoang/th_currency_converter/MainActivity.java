package th.nguyenviethoang.th_currency_converter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    EditText etFromAmount, etToAmount;
    Spinner spinnerFrom, spinnerTo;
    ImageView ivFromFlag, ivToFlag;
    ImageButton btnSwap;
    Button btnConvert;

    String[] currencyCodes = {"USD", "INR", "EUR", "GBP", "JPY", "VND"};
    int[] flagIcons = {
            R.drawable.flag_us,
            R.drawable.flag_in,
            R.drawable.flag_eu,
            R.drawable.flag_gb,
            R.drawable.flag_jp,
            R.drawable.flag_vn
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFromAmount = findViewById(R.id.etFromAmount);
        etToAmount = findViewById(R.id.etToAmount);
        spinnerFrom = findViewById(R.id.spinnerFrom);
        spinnerTo = findViewById(R.id.spinnerTo);
        ivFromFlag = findViewById(R.id.ivFromFlag);
        ivToFlag = findViewById(R.id.ivToFlag);
        btnConvert = findViewById(R.id.btnConvert);
        btnSwap = findViewById(R.id.btnSwap);

        CurrencyAdapter adapter = new CurrencyAdapter();
        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);

        spinnerFrom.setSelection(0); // USD
        spinnerTo.setSelection(1);   // INR

        spinnerFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, android.view.View view, int position, long id) {
                ivFromFlag.setImageResource(flagIcons[position]);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        spinnerTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, android.view.View view, int position, long id) {
                ivToFlag.setImageResource(flagIcons[position]);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        // Convert
        btnConvert.setOnClickListener(v -> {
            String amountStr = etFromAmount.getText().toString();
            if (!amountStr.isEmpty()) {
                double amount = Double.parseDouble(amountStr);
                double rate = getMockRate(spinnerFrom.getSelectedItemPosition(), spinnerTo.getSelectedItemPosition());
                double converted = amount * rate;
                etToAmount.setText(String.format("%.2f", converted));
            } else {
                Toast.makeText(this, "Enter amount", Toast.LENGTH_SHORT).show();
            }
        });

        // Swap
        btnSwap.setOnClickListener(v -> {
            int fromPos = spinnerFrom.getSelectedItemPosition();
            int toPos = spinnerTo.getSelectedItemPosition();

            spinnerFrom.setSelection(toPos);
            spinnerTo.setSelection(fromPos);

            String fromText = etFromAmount.getText().toString();
            etFromAmount.setText(etToAmount.getText().toString());
            etToAmount.setText(fromText);
        });
    }

    // Mock exchange rate (tỉ giá mẫu)
    private double getMockRate(int from, int to) {
        if (from == to) return 1.0;
        double[][] mockRates = {
                // USD, INR, EUR, GBP, JPY, VND
                {1, 83.1, 0.92, 0.79, 149.5, 25400},
                {0.012, 1, 0.011, 0.0095, 1.8, 305},
                {1.09, 91.1, 1, 0.86, 162, 27600},
                {1.26, 105.1, 1.17, 1, 188, 32000},
                {0.0067, 0.56, 0.0062, 0.0053, 1, 170},
                {0.000039, 0.0033, 0.000036, 0.000031, 0.0059, 1}
        };
        return mockRates[from][to];
    }

    // Adapter hiển thị cờ + mã tiền
    class CurrencyAdapter extends BaseAdapter {
        @Override
        public int getCount() { return currencyCodes.length; }
        @Override
        public Object getItem(int position) { return currencyCodes[position]; }
        @Override
        public long getItemId(int position) { return position; }

        @Override
        public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.spinner_item_with_flag, parent, false);
            }
            ImageView ivFlag = convertView.findViewById(R.id.ivFlag);
            TextView tvCode = convertView.findViewById(R.id.tvCurrencyCode);

            ivFlag.setImageResource(flagIcons[position]);
            tvCode.setText(currencyCodes[position]);
            return convertView;
        }
    }
}
