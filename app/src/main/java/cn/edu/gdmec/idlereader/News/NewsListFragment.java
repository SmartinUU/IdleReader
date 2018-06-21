package cn.edu.gdmec.idlereader.News;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import cn.edu.gdmec.idlereader.R;

public class NewsListFragment extends Fragment {
    private int type;
    private TextView tv_news;

    public static NewsListFragment newInstance(int type) {
        Bundle args = new Bundle();
        NewsListFragment fragment = new NewsListFragment();
        args.putInt("type", type);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fg_news_list, null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        type = getArguments().getInt("type");
        tv_news = view.findViewById(R.id.tv_news);
        switch (type) {
            case NewsFragment.NEWS_TYPE_TOP:
                tv_news.setText("top");
                break;
            case NewsFragment.NEWS_TYPE_NBA:
                tv_news.setText("NEWS_TYPE_NBA");
                break;
            case NewsFragment.NEWS_TYPE_JOKES:
                tv_news.setText("NEWS_TYPE_JOKES");
                break;
        }
    }
}
