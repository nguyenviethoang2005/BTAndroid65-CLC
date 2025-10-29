package gk1.nguyenviethoang.thigiuaki;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class BaiThuocActivity extends AppCompatActivity {
    String[] dsThuoc = {"Bài thuốc 1", "Bài thuốc 2", "Bài thuốc 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_thuoc);

        ListView lv = findViewById(R.id.lvBaiThuoc);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dsThuoc);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener((a, v, pos, id) -> {
            Intent i = new Intent(this, ChiTietBaiActivity.class);
            i.putExtra("tenBai", dsThuoc[pos]);
            startActivity(i);
        });
    }
}
