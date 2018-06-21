package cn.edu.gdmec.idlereader.Movie;

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

import cn.edu.gdmec.idlereader.Bean.MovieBean;
import cn.edu.gdmec.idlereader.Movie.presenter.MoviePresenter;
import cn.edu.gdmec.idlereader.Movie.view.IMovieView;
import cn.edu.gdmec.idlereader.News.presenter.NewsPresenter;
import cn.edu.gdmec.idlereader.R;

/**
 * Created by apple on 18/6/15.
 */

public class MovieFragment extends Fragment implements IMovieView{
    private TextView tv_news;
    private MoviePresenter presenter;
    private SwipeRefreshLayout srl_movie;
    private TextView tv_movie;
    private SwipeRefreshLayout srl_news;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fg_movie, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tv_movie = view.findViewById(R.id.tv_movie);
        srl_movie = view.findViewById(R.id.srl_movie);
        srl_movie.setColorSchemeColors(Color.parseColor("#ffce3d3a"));
        presenter = new MoviePresenter(this);
        srl_news.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
              presenter.loadMovie("movie","in_theaters");
            }
        });

    }

    @Override
    public void showMovie(MovieBean movieBean) {

    }

    @Override
    public void hideDialog() {

    }

    @Override
    public void showDialog() {

    }

    @Override
    public void showErrorMsg(String error) {

    }
}
