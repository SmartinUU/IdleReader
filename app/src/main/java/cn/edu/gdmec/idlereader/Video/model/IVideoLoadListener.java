package cn.edu.gdmec.idlereader.Video.model;

import java.util.List;

import cn.edu.gdmec.idlereader.Bean.TodayContentBean;
import cn.edu.gdmec.idlereader.Bean.VideoUrlBean;

public interface IVideoLoadListener {
    void videoUrlSuccess(List<VideoUrlBean> videoUrlBeans, List<TodayContentBean> contentBeans);

    void fail(Throwable throwable);
}
