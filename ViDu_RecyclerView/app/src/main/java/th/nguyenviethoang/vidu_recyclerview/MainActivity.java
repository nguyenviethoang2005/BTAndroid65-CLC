package th.nguyenviethoang.vidu_recyclerview;


import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recycleViewDatas;
    RecyclerView recyclerViewLandscape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recycleViewDatas = getDataForRecycleView();
        recyclerViewLandscape = findViewById(R.id.recyLand);

//        RecyclerView.LayoutManager layoutGrid = new LinearLayoutManager(this);
//        recyclerViewLandscape.setLayoutManager(layoutGrid);

//        RecyclerView.LayoutManager layoutGrid = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        recyclerViewLandscape.setLayoutManager(layoutGrid);

        RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this, 2);
        recyclerViewLandscape.setLayoutManager(layoutGrid);

        landScapeAdapter = new LandScapeAdapter(this, recycleViewDatas);
        recyclerViewLandscape.setAdapter(landScapeAdapter);
    }

    ArrayList<LandScape> getDataForRecycleView() {
        ArrayList<LandScape> dsDuLieu = new ArrayList<>();
        dsDuLieu.add(new LandScape("effel", "Tháp Effel"));
        dsDuLieu.add(new LandScape("effel", "Cung điện Buckingham"));
        return dsDuLieu;
    }
}
