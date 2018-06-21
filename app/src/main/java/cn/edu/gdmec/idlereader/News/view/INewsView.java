package cn.edu.gdmec.idlereader.News.view;

import cn.edu.gdmec.idlereader.Bean.NewsBean;

public interface INewsView {
    void showNews(NewsBean newsBean);

    void hideDialog();

    void showDialog();

    void showErrorMsg(String error);
}
