package cn.edu.gdmec.idlereader.Movie.presenter;

import android.widget.ImageView;

import cn.edu.gdmec.idlereader.Bean.MovieBean;
import cn.edu.gdmec.idlereader.Bean.NewsBean;
import cn.edu.gdmec.idlereader.Http.Api;
import cn.edu.gdmec.idlereader.Movie.model.IMovieLoadListener;
import cn.edu.gdmec.idlereader.Movie.model.IMovieModel;
import cn.edu.gdmec.idlereader.Movie.model.MovieModel;
import cn.edu.gdmec.idlereader.Movie.view.IMovieView;
import cn.edu.gdmec.idlereader.News.NewsFragment;

public class MoviePresenter implements IMoviePresenter, IMovieLoadListener {
    private IMovieModel iMovieModel;
    private IMovieView iMovieView;

    public MoviePresenter(IMovieView iMovieView) {
        this.iMovieModel = new MovieModel();
        this.iMovieView = iMovieView;
    }

    @Override
    public void success(MovieBean movieBean) {
        iMovieView.hideDialog();
        if (movieBean != null) {
            iMovieView.showMovie(movieBean);
        }
    }

    @Override
    public void fail(String error) {
        iMovieView.hideDialog();
        iMovieView.showErrorMsg(error);
    }

    @Override
    public void loadMovie(String type, String in_theaters) {
        iMovieModel.loadMovie(type, in_theaters, this);
    }
}
