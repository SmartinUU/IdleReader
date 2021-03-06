package cn.edu.gdmec.idlereader.Video.model;

import java.util.ArrayList;
import java.util.List;

import cn.edu.gdmec.idlereader.Bean.TodayBean;
import cn.edu.gdmec.idlereader.Bean.TodayContentBean;
import cn.edu.gdmec.idlereader.Bean.VideoUrlBean;
import cn.edu.gdmec.idlereader.Http.Api;
import cn.edu.gdmec.idlereader.Http.RetrofitHelper;
import cn.edu.gdmec.idlereader.Video.presenter.VideoPresenter;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class VideoModel implements IVideoModel {
    final
    @Override
    public void loadVideo(String category, final IVideoLoadListener iVideoLoadListener) {
        final List<VideoUrlBean> videoUrlBeanList = new ArrayList<>();
        final List<TodayContentBean> contentBeans = new ArrayList<>();
        final RetrofitHelper retrofitHelper = new RetrofitHelper(Api.TODAY_HOST);
        retrofitHelper.getToday(category)
                .flatMap(new Func1<TodayBean, Observable<VideoUrlBean>>() {
                    @Override
                    public Observable<VideoUrlBean> call(TodayBean todayBean) {
                        return Observable.from(todayBean.getData())
                                .flatMap(new Func1<TodayBean.DataBean, Observable<VideoUrlBean>>() {
                                    @Override
                                    public Observable<VideoUrlBean> call(TodayBean.DataBean dataBean) {
                                        String content = dataBean.getContent();
                                        TodayContentBean contentBean = VideoPresenter.getTodayContentBean(content);
                                        contentBeans.add(contentBean);
                                        String api = VideoPresenter.getVideoContentApi(contentBean.getVideo_id());
                                        return retrofitHelper.getVideoUrl(api);
                                    }
                                });
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<VideoUrlBean>() {
                    @Override
                    public void onCompleted() {
                        iVideoLoadListener.videoUrlSuccess(videoUrlBeanList, contentBeans);
                    }

                    @Override
                    public void onError(Throwable e) {
                        iVideoLoadListener.fail(e);
                    }

                    @Override
                    public void onNext(VideoUrlBean videoUrlBean) {
                        videoUrlBeanList.add(videoUrlBean);
                    }
                });
    }
}
