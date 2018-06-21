package cn.edu.gdmec.idlereader.News.model;

public interface INewsModel {
    void loadNews(String hostType,
                  String id,
                  int startPage,
                  INewsLoadListener iNewsLoadListener);
}
