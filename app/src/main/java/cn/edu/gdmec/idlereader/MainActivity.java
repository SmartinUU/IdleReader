package cn.edu.gdmec.idlereader;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import cn.edu.gdmec.idlereader.adapter.MyFragmentAdapter;
import cn.edu.gdmec.idlereader.fragment.MovieFragment;
import cn.edu.gdmec.idlereader.fragment.NewsFragment;
import cn.edu.gdmec.idlereader.fragment.VideoFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {

    private View view_status;
    private ImageView iv_title_news;
    private ImageView iv_title_movie;
    private ImageView iv_title_video;
    private Toolbar toolbars;
    private ViewPager vp_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initContentFragment();
    }

    private void initView() {
        view_status = (View) findViewById(R.id.view_status);
        iv_title_news = (ImageView) findViewById(R.id.iv_title_news);
        iv_title_movie = (ImageView) findViewById(R.id.iv_title_movie);
        iv_title_video = (ImageView) findViewById(R.id.iv_title_video);
        toolbars = (Toolbar) findViewById(R.id.toolbars);
        vp_content = (ViewPager) findViewById(R.id.vp_content);
        iv_title_news.setOnClickListener(this);
        iv_title_movie.setOnClickListener(this);
        iv_title_video.setOnClickListener(this);
    }

    private void initContentFragment() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new NewsFragment());
        fragments.add(new MovieFragment());
        fragments.add(new VideoFragment());
        MyFragmentAdapter adapter = new MyFragmentAdapter(getSupportFragmentManager(), fragments);
        vp_content.setAdapter(adapter);
        vp_content.setOffscreenPageLimit(2);   //预加载
        vp_content.addOnPageChangeListener(this);
        setCurrentItem(0);
    }

    /**
     * 用来设置toolbar图标点击状态
     *
     * @param i
     */
    public void setCurrentItem(int i) {
        vp_content.setCurrentItem(i);
        iv_title_news.setSelected(false);
        iv_title_movie.setSelected(false);
        iv_title_video.setSelected(false);
        switch (i) {
            case 0:
                iv_title_news.setSelected(true);
                break;
            case 1:
                iv_title_movie.setSelected(true);
                break;
            case 2:
                iv_title_video.setSelected(true);
                break;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_title_news:
                if (vp_content.getCurrentItem() != 0) {
                    setCurrentItem(0);
                }
                break;
            case R.id.iv_title_movie:
                if (vp_content.getCurrentItem() != 1) {
                    setCurrentItem(1);
                }
                break;
            case R.id.iv_title_video:
                if (vp_content.getCurrentItem() != 2) {
                    setCurrentItem(2);
                }
                break;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        setCurrentItem(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}

