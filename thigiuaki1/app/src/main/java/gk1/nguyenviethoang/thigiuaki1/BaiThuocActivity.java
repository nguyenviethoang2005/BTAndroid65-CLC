package gk1.nguyenviethoang.thigiuaki1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class BaiThuocActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_thuoc);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewBaiThuoc);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<BaiThuoc> list = new ArrayList<>();
        list.add(new BaiThuoc("Bài thuốc trị cảm cúm", "10 phút", R.drawable.ic_medicine));
        list.add(new BaiThuoc("Bài thuốc giảm ho", "15 phút", R.drawable.ic_herbal_bottle));
        list.add(new BaiThuoc("Bài thuốc trị đau đầu", "12 phút", R.drawable.ic_pill));

        BaiThuocAdapter adapter = new BaiThuocAdapter(this, list);
        recyclerView.setAdapter(adapter);
    }
}
