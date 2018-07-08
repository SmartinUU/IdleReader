package cn.edu.gdmec.idlereader.Movie;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import cn.edu.gdmec.idlereader.Bean.MovieBean;
import cn.edu.gdmec.idlereader.Movie.presenter.MoviePresenter;
import cn.edu.gdmec.idlereader.Movie.view.IMovieView;
import cn.edu.gdmec.idlereader.News.presenter.NewsPresenter;
import cn.edu.gdmec.idlereader.R;

/**
 * Created by apple on 18/6/15.
 */

public class MovieFragment extends Fragment implements IMovieView {
    private MoviePresenter presenter;
    private SwipeRefreshLayout srl_movie;
    private RecyclerView rv_movie_on;
    private ItemMovieOnAdapter movieOnAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fg_movie, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        srl_movie = view.findViewById(R.id.srl_movie);
        srl_movie.setColorSchemeColors(Color.parseColor("#ffce3d3a"));
        presenter = new MoviePresenter(this);
        srl_movie.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                presenter.loadMovie("in_theaters");
            }
        });
        rv_movie_on = view.findViewById(R.id.rv_movie_on);
        movieOnAdapter = new ItemMovieOnAdapter(getActivity());
    }

    @Override
    public void showMovie(final MovieBean movieBean) {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                movieOnAdapter.setData(movieBean.getSubjects());
                rv_movie_on.setLayoutManager(new LinearLayoutManager(getActivity()));
                rv_movie_on.setAdapter(movieOnAdapter);
            }
        });
    }

    @Override
    public void hideDialog() {
        srl_movie.setRefreshing(false);
    }

    @Override
    public void showDialog() {
        srl_movie.setRefreshing(true);
    }

    @Override
    public void showErrorMsg(String error) {
        Toast.makeText(getContext(), "加载出错:" + error, Toast.LENGTH_SHORT).show();
    }
}