package cn.edu.gdmec.idlereader.News.presenter;

import cn.edu.gdmec.idlereader.Bean.NewsBean;
import cn.edu.gdmec.idlereader.Http.Api;
import cn.edu.gdmec.idlereader.News.NewsFragment;
import cn.edu.gdmec.idlereader.News.model.INewsLoadListener;
import cn.edu.gdmec.idlereader.News.model.INewsModel;
import cn.edu.gdmec.idlereader.News.model.NewsModel;
import cn.edu.gdmec.idlereader.News.view.INewsView;

public class NewsPresenter implements INewsPresenter, INewsLoadListener {
    private INewsModel iNewsModel;
    private INewsView iNewsView;

    public NewsPresenter( INewsView iNewsView) {
        this.iNewsModel = new NewsModel();
        this.iNewsView = iNewsView;
    }

    @Override
    public void success(NewsBean newsBean) {
        iNewsView.hideDialog();
        if (newsBean != null) {
            iNewsView.showNews(newsBean);
        }
    }

    @Override
    public void fail(String error) {
        iNewsView.hideDialog();
        iNewsView.showErrorMsg(error);
    }

    @Override
    public void loadNews(int type, int startPage) {
        iNewsView.showDialog();
        switch (type) {
            case NewsFragment.NEWS_TYPE_TOP:
                iNewsModel.loadNews("headline", startPage, Api.HEADLINE_ID, this);
                break;
            case NewsFragment.NEWS_TYPE_NBA:
                iNewsModel.loadNews("list", startPage, Api.NBA_ID, this);
                break;
            case NewsFragment.NEWS_TYPE_JOKES:
                iNewsModel.loadNews("list", startPage, Api.JOKE_ID, this);
                break;
        }
    }
}
