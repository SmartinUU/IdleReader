package cn.edu.gdmec.idlereader.Movie.model;

import cn.edu.gdmec.idlereader.Bean.MovieBean;
import cn.edu.gdmec.idlereader.Http.Api;
import cn.edu.gdmec.idlereader.Http.RetrofitHelper;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MovieModel implements IMovieModel {
    @Override
    public void loadMovie(String total, final IMovieLoadListener iMovieLoadListener) {
        RetrofitHelper retrofitHelper = new RetrofitHelper(Api.MOVIE_HOST);
        retrofitHelper.getMovie(total)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<MovieBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        iMovieLoadListener.fail(e.toString());
                    }

                    @Override
                    public void onNext(MovieBean movieBean) {
                        iMovieLoadListener.success(movieBean);
                    }
                });

    }

    /* retrofitHelper.getMovie(total).enqueue(new Callback<MovieBean>() {
         @Override
         public void onResponse(Call<MovieBean> call, Response<MovieBean> response) {
             iMovieLoadListener.success(response.body());
         }

         @Override
         public void onFailure(Call<MovieBean> call, Throwable t) {
             iMovieLoadListener.fail(t.toString());
         }
     });*/

}
