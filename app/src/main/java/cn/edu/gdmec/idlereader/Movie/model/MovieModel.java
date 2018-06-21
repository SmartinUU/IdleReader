package cn.edu.gdmec.idlereader.Movie.model;

import cn.edu.gdmec.idlereader.Bean.MovieBean;
import cn.edu.gdmec.idlereader.Http.Api;
import cn.edu.gdmec.idlereader.Http.RetrofitHelper;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieModel implements IMovieModel {

    @Override
    public void loadNews(String type, String in_theaters, final IMovieLoadListener iMovieLoadListener) {
        RetrofitHelper retrofitHelper = new RetrofitHelper(Api.MOVIE_HOST);
        retrofitHelper.getMovie(type, in_theaters).enqueue(new Callback<MovieBean>() {
            @Override
            public void onResponse(Call<MovieBean> call, Response<MovieBean> response) {
                iMovieLoadListener.success(response.body());
            }

            @Override
            public void onFailure(Call<MovieBean> call, Throwable t) {
                iMovieLoadListener.fail(t.toString());
            }
        });
    }
}
