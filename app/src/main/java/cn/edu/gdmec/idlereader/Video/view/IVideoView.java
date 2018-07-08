package cn.edu.gdmec.idlereader.Video.view;

import java.util.List;

import cn.edu.gdmec.idlereader.Bean.TodayContentBean;

public interface IVideoView {
    void showVideo(List<TodayContentBean> todayContentBeans, List<String> videoList);

    void hideDialog();

    void showDialog();

    void showErrorMsg(Throwable throwable);
}