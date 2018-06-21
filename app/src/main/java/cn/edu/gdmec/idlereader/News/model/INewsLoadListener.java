package cn.edu.gdmec.idlereader.News.model;

import cn.edu.gdmec.idlereader.Bean.NewsBean;

public interface INewsLoadListener {
    void success(NewsBean newsBean);

    void fail(String error);
}
