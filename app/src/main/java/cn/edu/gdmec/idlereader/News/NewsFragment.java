package cn.edu.gdmec.idlereader.News;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import cn.edu.gdmec.idlereader.R;
import cn.edu.gdmec.idlereader.MyFragmentAdapter;

/**
 * Created by apple on 18/6/15.
 */

public class NewsFragment extends Fragment {
    public static final int NEWS_TYPE_TOP = 0;
    public static final int NEWS_TYPE_NBA = 1;
    public static final int NEWS_TYPE_JOKES = 2;
    private List<Fragment> fragments = new ArrayList<>();
    private List<String> fragmentTitles = new ArrayList<>();
    private TabLayout tl_news;
    private ViewPager vp_news;

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fg_news, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tl_news = view.findViewById(R.id.tl_news);
        vp_news = view.findViewById(R.id.vp_news);
        setViewPager();
        vp_news.setOffscreenPageLimit(2);
        //viewpager和TabLayout绑定
        tl_news.setupWithViewPager(vp_news);
    }

    private void setViewPager() {
        fragments.add(NewsListFragment.newInstance(NEWS_TYPE_TOP));
        fragments.add(NewsListFragment.newInstance(NEWS_TYPE_NBA));
        fragments.add(NewsListFragment.newInstance(NEWS_TYPE_JOKES));
        fragmentTitles.add("头条");
        fragmentTitles.add("NBA");
        fragmentTitles.add("笑话");
        MyFragmentAdapter adapter = new MyFragmentAdapter(getChildFragmentManager(), fragments, fragmentTitles);
        vp_news.setAdapter(adapter);
    }
}
