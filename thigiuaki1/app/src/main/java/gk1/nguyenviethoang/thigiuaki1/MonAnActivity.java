package gk1.nguyenviethoang.thigiuaki;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MonAnActivity extends AppCompatActivity {
    String[] dsMon = {"Món ăn 1", "Món ăn 2", "Món ăn 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_an);

        ListView listView = findViewById(R.id.lvMonAn);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dsMon);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent i = new Intent(this, ChiTietMonActivity.class);
            i.putExtra("tenMon", dsMon[position]);
            startActivity(i);
        });
    }
}
