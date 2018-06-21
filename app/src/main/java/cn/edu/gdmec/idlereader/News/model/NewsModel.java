package cn.edu.gdmec.idlereader.News.model;

import cn.edu.gdmec.idlereader.Bean.NewsBean;
import cn.edu.gdmec.idlereader.Http.Api;
import cn.edu.gdmec.idlereader.Http.RetrofitHelper;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsModel implements INewsModel {
    @Override
    public void loadNews(String hostType, int startPage, String id, final INewsLoadListener iNewsLoadListener) {
        RetrofitHelper retrofitHelper = new RetrofitHelper(Api.NEWS_HOST);
        retrofitHelper.getNews(hostType, id, startPage).enqueue(new Callback<NewsBean>() {
            @Override
            public void onResponse(Call<NewsBean> call, Response<NewsBean> response) {
                iNewsLoadListener.success(response.body());
            }

            @Override
            public void onFailure(Call<NewsBean> call, Throwable t) {
                iNewsLoadListener.fail(t.toString());
            }
        });
    }
}
