package cn.edu.gdmec.idlereader.Movie.model;

import cn.edu.gdmec.idlereader.Bean.MovieBean;

public interface IMovieLoadListener {
    void success(MovieBean movieBean);

    void fail(String error);
}
