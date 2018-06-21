package cn.edu.gdmec.idlereader.Movie.model;

import cn.edu.gdmec.idlereader.News.model.INewsLoadListener;

public interface IMovieModel {
    void loadNews(String type, String in_theaters, IMovieLoadListener iMovieLoadListener);
}
