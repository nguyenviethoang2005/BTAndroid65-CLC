package th.nguyenviethoang.th_bai3_chuyenmanhinh_fragment;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;

public class MathActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        ViewPager2 viewPager = findViewById(R.id.viewPagerMath);

        List<androidx.fragment.app.Fragment> fragments = new ArrayList<>();
        fragments.add(new MathFragment1());
        fragments.add(new MathFragment2());

        FragmentAdapter adapter = new FragmentAdapter(this, fragments);
        viewPager.setAdapter(adapter);
    }
}
