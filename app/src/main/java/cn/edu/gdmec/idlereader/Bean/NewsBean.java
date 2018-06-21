package cn.edu.gdmec.idlereader.Bean;

import java.util.List;

public class NewsBean {
    //头条
    private List<Bean> T1348647909107;
    //nba
    private List<Bean> T1348649145984;
    //笑话
    private List<Bean> T1350383429665;

    public List<Bean> getTop() {
        return T1348647909107;
    }

    public NewsBean setT1348647909107(List<Bean> t1348647909107) {
        T1348647909107 = t1348647909107;
        return this;
    }

    public List<Bean> getNba() {
        return T1348649145984;
    }

    public NewsBean setT1348649145984(List<Bean> t1348649145984) {
        T1348649145984 = t1348649145984;
        return this;
    }

    public List<Bean> getJoke() {
        return T1350383429665;
    }

    public NewsBean setT1350383429665(List<Bean> t1350383429665) {
        T1350383429665 = t1350383429665;
        return this;
    }

    //下面的类之前是T1348649145984Bean
    public static class Bean {
        /**
         * template : normal1
         * skipID : 00AO0001|2294407
         * lmodify : 2018-06-21 11:41:40
         * postid : PHOT260K7000100A
         * source : 视觉中国
         * title : 马其顿正式更名为"北马其顿共和国"
         * mtime : 2018-06-21 11:41:40
         * hasImg : 1
         * topic_background : http://img2.cache.netease.com/m/newsapp/reading/cover1/C1348646712614.jpg
         * digest :
         * photosetID : 00AO0001|2294407
         * boardid : photoview_bbs
         * alias : Top News
         * hasAD : 1
         * imgsrc : http://cms-bucket.nosdn.127.net/2018/06/21/14d72d45faa24524aeea88558d904537.jpeg
         * ptime : 2018-06-21 09:12:26
         * daynum : 17703
         * hasHead : 1
         * imgType : 1
         * order : 1
         * editor : []
         * votecount : 9
         * hasCover : false
         * docid : 9IG74V5H00963VRO_DKQIP1SMbjjikeupdateDoc
         * tname : 头条
         * priority : 555
         * ads : [{"subtitle":"","skipType":"photoset","skipID":"00AP0001|2294400","tag":"photoset","title":"暴雨袭击福州 市民骑车回家如水中行舟","imgsrc":"bigimg","url":"00AP0001|2294400"},{"subtitle":"","skipType":"photoset","skipID":"00AP0001|2294398","tag":"photoset","title":"\u201c8D魔幻重庆\u201d现穿楼人工运河","imgsrc":"bigimg","url":"00AP0001|2294398"},{"subtitle":"","skipType":"photoset","skipID":"00AP0001|2294397","tag":"photoset","title":"鄱阳湖结束禁渔期 渔船集中出湖捕捞","imgsrc":"bigimg","url":"00AP0001|2294397"},{"subtitle":"","skipType":"photoset","skipID":"00AO0001|2294395","tag":"photoset","title":"梅根出席皇家赛马会 与哈里\"撒狗粮\"","imgsrc":"bigimg","url":"00AO0001|2294395"},{"subtitle":"","skipType":"photoset","skipID":"00AP0001|2294379","tag":"photoset","title":"醉汉倒路边现金散一地 念叨:输球了","imgsrc":"bigimg","url":"00AP0001|2294379"}]
         * ename : androidnews
         * replyCount : 15
         * imgsum : 3
         * hasIcon : false
         * skipType : photoset
         * cid : C1348646712614
         * url_3w : http://news.163.com/18/0621/11/DKQRCHQ4000189FH.html
         * url : http://3g.163.com/news/18/0621/11/DKQRCHQ4000189FH.html
         * ltitle : 从浙江实践到中国答卷：习近平引领“赶考”路
         * subtitle :
         * pixel : 1080*548
         */

        private String template;
        private String skipID;
        private String lmodify;
        private String postid;
        private String source;
        private String title;
        private String mtime;
        private int hasImg;
        private String topic_background;
        private String digest;
        private String photosetID;
        private String boardid;
        private String alias;
        private int hasAD;
        private String imgsrc;
        private String ptime;
        private String daynum;
        private int hasHead;
        private int imgType;
        private int order;
        private int votecount;
        private boolean hasCover;
        private String docid;
        private String tname;
        private int priority;
        private String ename;
        private int replyCount;
        private int imgsum;
        private boolean hasIcon;
        private String skipType;
        private String cid;
        private String url_3w;
        private String url;
        private String ltitle;
        private String subtitle;
        private String pixel;
        private List<?> editor;
        private List<AdsBean> ads;

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public String getSkipID() {
            return skipID;
        }

        public void setSkipID(String skipID) {
            this.skipID = skipID;
        }

        public String getLmodify() {
            return lmodify;
        }

        public void setLmodify(String lmodify) {
            this.lmodify = lmodify;
        }

        public String getPostid() {
            return postid;
        }

        public void setPostid(String postid) {
            this.postid = postid;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getMtime() {
            return mtime;
        }

        public void setMtime(String mtime) {
            this.mtime = mtime;
        }

        public int getHasImg() {
            return hasImg;
        }

        public void setHasImg(int hasImg) {
            this.hasImg = hasImg;
        }

        public String getTopic_background() {
            return topic_background;
        }

        public void setTopic_background(String topic_background) {
            this.topic_background = topic_background;
        }

        public String getDigest() {
            return digest;
        }

        public void setDigest(String digest) {
            this.digest = digest;
        }

        public String getPhotosetID() {
            return photosetID;
        }

        public void setPhotosetID(String photosetID) {
            this.photosetID = photosetID;
        }

        public String getBoardid() {
            return boardid;
        }

        public void setBoardid(String boardid) {
            this.boardid = boardid;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public int getHasAD() {
            return hasAD;
        }

        public void setHasAD(int hasAD) {
            this.hasAD = hasAD;
        }

        public String getImgsrc() {
            return imgsrc;
        }

        public void setImgsrc(String imgsrc) {
            this.imgsrc = imgsrc;
        }

        public String getPtime() {
            return ptime;
        }

        public void setPtime(String ptime) {
            this.ptime = ptime;
        }

        public String getDaynum() {
            return daynum;
        }

        public void setDaynum(String daynum) {
            this.daynum = daynum;
        }

        public int getHasHead() {
            return hasHead;
        }

        public void setHasHead(int hasHead) {
            this.hasHead = hasHead;
        }

        public int getImgType() {
            return imgType;
        }

        public void setImgType(int imgType) {
            this.imgType = imgType;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public int getVotecount() {
            return votecount;
        }

        public void setVotecount(int votecount) {
            this.votecount = votecount;
        }

        public boolean isHasCover() {
            return hasCover;
        }

        public void setHasCover(boolean hasCover) {
            this.hasCover = hasCover;
        }

        public String getDocid() {
            return docid;
        }

        public void setDocid(String docid) {
            this.docid = docid;
        }

        public String getTname() {
            return tname;
        }

        public void setTname(String tname) {
            this.tname = tname;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public String getEname() {
            return ename;
        }

        public void setEname(String ename) {
            this.ename = ename;
        }

        public int getReplyCount() {
            return replyCount;
        }

        public void setReplyCount(int replyCount) {
            this.replyCount = replyCount;
        }

        public int getImgsum() {
            return imgsum;
        }

        public void setImgsum(int imgsum) {
            this.imgsum = imgsum;
        }

        public boolean isHasIcon() {
            return hasIcon;
        }

        public void setHasIcon(boolean hasIcon) {
            this.hasIcon = hasIcon;
        }

        public String getSkipType() {
            return skipType;
        }

        public void setSkipType(String skipType) {
            this.skipType = skipType;
        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getUrl_3w() {
            return url_3w;
        }

        public void setUrl_3w(String url_3w) {
            this.url_3w = url_3w;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getLtitle() {
            return ltitle;
        }

        public void setLtitle(String ltitle) {
            this.ltitle = ltitle;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getPixel() {
            return pixel;
        }

        public void setPixel(String pixel) {
            this.pixel = pixel;
        }

        public List<?> getEditor() {
            return editor;
        }

        public void setEditor(List<?> editor) {
            this.editor = editor;
        }

        public List<AdsBean> getAds() {
            return ads;
        }

        public void setAds(List<AdsBean> ads) {
            this.ads = ads;
        }

        public static class AdsBean {
            /**
             * subtitle :
             * skipType : photoset
             * skipID : 00AP0001|2294400
             * tag : photoset
             * title : 暴雨袭击福州 市民骑车回家如水中行舟
             * imgsrc : bigimg
             * url : 00AP0001|2294400
             */

            private String subtitle;
            private String skipType;
            private String skipID;
            private String tag;
            private String title;
            private String imgsrc;
            private String url;

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public String getSkipType() {
                return skipType;
            }

            public void setSkipType(String skipType) {
                this.skipType = skipType;
            }

            public String getSkipID() {
                return skipID;
            }

            public void setSkipID(String skipID) {
                this.skipID = skipID;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImgsrc() {
                return imgsrc;
            }

            public void setImgsrc(String imgsrc) {
                this.imgsrc = imgsrc;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}