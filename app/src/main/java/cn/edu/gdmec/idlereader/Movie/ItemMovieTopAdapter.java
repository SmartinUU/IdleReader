package cn.edu.gdmec.idlereader.Movie;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import cn.edu.gdmec.idlereader.ADetailActivity;
import cn.edu.gdmec.idlereader.Bean.MovieBean;
import cn.edu.gdmec.idlereader.R;

public class ItemMovieTopAdapter extends RecyclerView.Adapter<ItemMovieTopAdapter.ViewHolder> {
    private List<MovieBean.SubjectsBean> objects = new ArrayList<>();
    private Context context;

    public ItemMovieTopAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<MovieBean.SubjectsBean> objects) {
        this.objects = objects;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items_movie_top, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MovieBean.SubjectsBean bean = objects.get(position);
        if (bean == null) {
            return;
        }
        Glide.with(context)
                .load(bean.getImages().getSmall())
                .into(holder.iv_movie_top);
        holder.tv_movie_top_title.setText(bean.getTitle());
        holder.li_movie_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ADetailActivity.class);
                intent.putExtra("url",bean.getAlt());
                intent.putExtra("title", bean.getTitle());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return objects.size();
    }

    protected class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout li_movie_top;
        private ImageView iv_movie_top;
        private TextView tv_movie_top_title;

        public ViewHolder(View view) {
            super(view);
            li_movie_top = view.findViewById(R.id.li_movie_top);
            iv_movie_top = view.findViewById(R.id.iv_movie_top);
            tv_movie_top_title = view.findViewById(R.id.tv_movie_top_title);
        }
    }
}
