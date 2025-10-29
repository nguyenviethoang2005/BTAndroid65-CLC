package gk1.nguyenviethoang.thigiuaki1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BaiThuocAdapter extends RecyclerView.Adapter<BaiThuocAdapter.ViewHolder> {
    private Context context;
    private List<BaiThuoc> baiThuocList;

    public BaiThuocAdapter(Context context, List<BaiThuoc> baiThuocList) {
        this.context = context;
        this.baiThuocList = baiThuocList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_bai_thuoc, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        BaiThuoc baiThuoc = baiThuocList.get(position);
        holder.tvTenBaiThuoc.setText(baiThuoc.getTen());
        holder.tvThoiGian.setText("Thời gian: " + baiThuoc.getThoiGian());
        holder.imgBaiThuoc.setImageResource(baiThuoc.getAnh());
    }

    @Override
    public int getItemCount() {
        return baiThuocList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgBaiThuoc;
        TextView tvTenBaiThuoc, tvThoiGian;

        public ViewHolder(View itemView) {
            super(itemView);
            imgBaiThuoc = itemView.findViewById(R.id.imgBaiThuoc);
            tvTenBaiThuoc = itemView.findViewById(R.id.tvTenBaiThuoc);
            tvThoiGian = itemView.findViewById(R.id.tvThoiGian);
        }
    }
}
