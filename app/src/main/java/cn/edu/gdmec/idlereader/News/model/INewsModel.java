package cn.edu.gdmec.idlereader.News.model;

public interface INewsModel {
    void loadNews(String hostType,
                  int startPage,
                  String id,
                  INewsLoadListener iNewsLoadListener);
}
