package cn.edu.gdmec.idlereader.Movie.view;

import cn.edu.gdmec.idlereader.Bean.MovieBean;

public interface IMovieView {
    void showMovie(MovieBean movieBean);

    void hideDialog();

    void showDialog();

    void showErrorMsg(String error);
}
