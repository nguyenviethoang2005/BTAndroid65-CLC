package gk1.nguyenviethoang.thigiuaki;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MonAnActivity extends AppCompatActivity {
    ListView listView;
    String[] monAn = {"Phở bò", "Bún chả", "Cơm tấm", "Gỏi cuốn", "Hủ tiếu"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_an);

        listView = findViewById(R.id.listMonAn);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, monAn);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MonAnActivity.this, ChiTietMonActivity.class);
                intent.putExtra("mon", monAn[position]);
                startActivity(intent);
            }
        });
    }
}
