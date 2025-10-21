package th.nguyenviethoang.th_bai3_chuyenmanhinh_fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;

public class FragmentAdapter extends FragmentStateAdapter {
    private final List<Fragment> fragmentList;

    public FragmentAdapter(@NonNull FragmentActivity fa, List<Fragment> list) {
        super(fa);
        fragmentList = list;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getItemCount() {
        return fragmentList.size();
    }
}
