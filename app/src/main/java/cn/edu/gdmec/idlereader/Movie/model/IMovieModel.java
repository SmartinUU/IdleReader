package cn.edu.gdmec.idlereader.Movie.model;


public interface IMovieModel {
    void loadMovie(String type, String in_theaters, IMovieLoadListener iMovieLoadListener);
}
