package cn.edu.gdmec.idlereader.News;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import cn.edu.gdmec.idlereader.Bean.NewsBean;
import cn.edu.gdmec.idlereader.News.presenter.NewsPresenter;
import cn.edu.gdmec.idlereader.News.view.INewsView;
import cn.edu.gdmec.idlereader.R;

public class NewsListFragment extends Fragment implements INewsView {
    private int type;
    private TextView tv_news;
    private NewsPresenter presenter;
    private SwipeRefreshLayout srl_news;

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
        srl_news = view.findViewById(R.id.srl_news);
        srl_news.setColorSchemeColors(Color.parseColor("#ffce3d3a"));
        presenter = new NewsPresenter(this);
        srl_news.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                presenter.loadNews(type, 0);
            }
        });
    }

    @Override
    public void showNews(final NewsBean newsBean) {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                switch (type) {
                    case NewsFragment.NEWS_TYPE_TOP:
                        tv_news.setText(newsBean.getTop().get(0).getTitle() + " "
                                + newsBean.getTop().get(0).getMtime());
                        break;
                    case NewsFragment.NEWS_TYPE_NBA:
                        tv_news.setText(newsBean.getNba().get(0).getTitle() + " "
                                + newsBean.getNba().get(0).getMtime());
                        break;
                    case NewsFragment.NEWS_TYPE_JOKES:
                        tv_news.setText(newsBean.getJoke().get(0).getTitle() + " "
                                + newsBean.getJoke().get(0).getMtime());
                        break;

                }
            }
        });
    }

    @Override
    public void hideDialog() {
        srl_news.setRefreshing(false);
    }

    @Override
    public void showDialog() {
        srl_news.setRefreshing(true);
    }

    @Override
    public void showErrorMsg(String error) {
        tv_news.setText("加载失败：" + error);
    }
}
