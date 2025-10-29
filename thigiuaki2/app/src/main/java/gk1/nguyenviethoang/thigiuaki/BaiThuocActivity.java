package gk1.nguyenviethoang.thigiuaki;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BaiThuocActivity extends AppCompatActivity {
    ListView listView;
    String[] baiThuoc = {"Trị ho", "Giảm đau đầu", "Thanh nhiệt", "Tăng sức đề kháng"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_thuoc);

        listView = findViewById(R.id.listBaiThuoc);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, baiThuoc);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(this, ChiTietBaiActivity.class);
            intent.putExtra("bai", baiThuoc[position]);
            startActivity(intent);
        });
    }
}
