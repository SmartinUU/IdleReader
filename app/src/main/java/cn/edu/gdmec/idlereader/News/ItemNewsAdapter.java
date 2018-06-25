package cn.edu.gdmec.idlereader.News;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import cn.edu.gdmec.idlereader.Bean.NewsBean;
import cn.edu.gdmec.idlereader.R;

public class ItemNewsAdapter extends RecyclerView.Adapter<ItemNewsAdapter.ItemNewsHolder> {
    /**
     * 这里传入泛型数组的不是NewsBean，而是NewsBean。Bean
     */
    private List<NewsBean.Bean> objects = new ArrayList<>();
    private Context context;

    public ItemNewsAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<NewsBean.Bean> objects) {
        this.objects = objects;
    }

    @NonNull
    @Override
    public ItemNewsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent, false);
        return new ItemNewsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemNewsHolder holder, int position) {
        NewsBean.Bean bean = objects.get(position);
        if (bean == null) {
            return;
        }
        //Glide,这是谷歌推荐的图片加载库，加载速度快，引用也很简单。只需下面3行代码就能用。
        Glide.with(context)
                .load(bean.getImgsrc())
                .into(holder.ivNewsImg);
        if (position == 0) {
            //第一个item不显示新闻描述
            holder.tvNewsTitle.setText("图片" + bean.getTitle());
            holder.tvNewsDigest.setVisibility(View.GONE);
        } else {
            holder.tvNewsTitle.setText(bean.getTitle());
            holder.tvNewsDigest.setText(bean.getMtime() + ":" + bean.getDigest());
        }
    }

    @Override
    public int getItemCount() {
        return objects.size();
    }

    protected class ItemNewsHolder extends RecyclerView.ViewHolder {
        private ImageView ivNewsImg;
        private TextView tvNewsTitle;
        private TextView tvNewsDigest;

        public ItemNewsHolder(View itemView) {
            super(itemView);
            ivNewsImg = itemView.findViewById(R.id.iv_news_img);
            tvNewsTitle = itemView.findViewById(R.id.tv_news_title);
            tvNewsDigest = itemView.findViewById(R.id.tv_news_digest);
        }
    }
}
