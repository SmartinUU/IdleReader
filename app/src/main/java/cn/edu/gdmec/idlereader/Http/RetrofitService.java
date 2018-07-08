package cn.edu.gdmec.idlereader.Http;


import cn.edu.gdmec.idlereader.Bean.MovieBean;
import cn.edu.gdmec.idlereader.Bean.NewsBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface RetrofitService {
    //retrofit本身就有url拼接功能，需要改变的参数也可以用{}来达到占位的效果。
    //http://c.m.163.com/nc/article/headline/T1348647909107/0-20.html
    @GET("nc/article/{type}/{id}/{startPage}-20.html")
    Observable<NewsBean> getNews(@Path("type") String type,
                                 @Path("id") String id,
                                 @Path("startPage") int startPage);

    //https://api.douban.com/v2/movie/in_theaters
    //https://api.douban.com/v2/movie/top250
    //可能1 v2前少了/
    @GET("v2/movie/{total}")
    Observable<MovieBean> getMovie(@Path("total") String total);
}
