package net.youlvke.yanyuke.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/2/13 0013.
 */
public class WinningBean {
    /**
     * code : 1
     * count : 1
     * data : [{"announcedDate":"2017-02-20 18:05:00","count":2,"countdown":-2516854,"crowdFundingPercent":100,"goodsId":1,"goodsinfo":{"coverPic":[{"addTime":"2016-01-01 00:00:00","goodsId":1,"pictureId":1,"pictureShape":0,"pictureType":1001,"pictureUrl":"http://sqdb-goods.oss-cn-hangzhou.aliyuncs.com/214812542_41.jpg","pictureins":"黄焖鸡米饭"}],"goodsArea":"桐庐县","goodsCategory":1,"goodsCity":"杭州市","goodsDescription":"楼兰红酒传承千楼兰古文化但是但是大多都是大三大四的撒旦撒旦是的是的撒打算","goodsFlag":0,"goodsId":1,"goodsName":"楼兰红酒750ML","goodsNewFlag":0,"goodsPrice":50,"goodsProvince":"浙江省","goodsSequenceNum":50,"goodsState":1,"goodsUid":"63651621","userId":1},"periodsId":0,"releaseDate":"2017-01-30 00:00:00","salesCount":100,"sequenceId":14,"sequenceState":2,"stockCount":0,"totalCount":100,"userId":1,"winningNumber":"63651621"}]
     * message : 获取成功
     */

    private int code;
    private int count;
    private String message;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * announcedDate : 2017-02-20 18:05:00
         * count : 2
         * countdown : -2516854
         * crowdFundingPercent : 100
         * goodsId : 1
         * goodsinfo : {"coverPic":[{"addTime":"2016-01-01 00:00:00","goodsId":1,"pictureId":1,"pictureShape":0,"pictureType":1001,"pictureUrl":"http://sqdb-goods.oss-cn-hangzhou.aliyuncs.com/214812542_41.jpg","pictureins":"黄焖鸡米饭"}],"goodsArea":"桐庐县","goodsCategory":1,"goodsCity":"杭州市","goodsDescription":"楼兰红酒传承千楼兰古文化但是但是大多都是大三大四的撒旦撒旦是的是的撒打算","goodsFlag":0,"goodsId":1,"goodsName":"楼兰红酒750ML","goodsNewFlag":0,"goodsPrice":50,"goodsProvince":"浙江省","goodsSequenceNum":50,"goodsState":1,"goodsUid":"63651621","userId":1}
         * periodsId : 0
         * releaseDate : 2017-01-30 00:00:00
         * salesCount : 100
         * sequenceId : 14
         * sequenceState : 2
         * stockCount : 0
         * totalCount : 100
         * userId : 1
         * winningNumber : 63651621
         */

        private String announcedDate;
        private int count;
        private int countdown;
        private int crowdFundingPercent;
        private long goodsId;
        private GoodsinfoBean goodsinfo;
        private long periodsId;
        private String releaseDate;
        private int salesCount;
        private long sequenceId;
        private int sequenceState;
        private int stockCount;
        private int totalCount;
        private long userId;
        private String winningNumber;

        public String getAnnouncedDate() {
            return announcedDate;
        }

        public void setAnnouncedDate(String announcedDate) {
            this.announcedDate = announcedDate;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getCountdown() {
            return countdown;
        }

        public void setCountdown(int countdown) {
            this.countdown = countdown;
        }

        public int getCrowdFundingPercent() {
            return crowdFundingPercent;
        }

        public void setCrowdFundingPercent(int crowdFundingPercent) {
            this.crowdFundingPercent = crowdFundingPercent;
        }

        public long getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(long goodsId) {
            this.goodsId = goodsId;
        }

        public GoodsinfoBean getGoodsinfo() {
            return goodsinfo;
        }

        public void setGoodsinfo(GoodsinfoBean goodsinfo) {
            this.goodsinfo = goodsinfo;
        }

        public long getPeriodsId() {
            return periodsId;
        }

        public void setPeriodsId(long periodsId) {
            this.periodsId = periodsId;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        public int getSalesCount() {
            return salesCount;
        }

        public void setSalesCount(int salesCount) {
            this.salesCount = salesCount;
        }

        public long getSequenceId() {
            return sequenceId;
        }

        public void setSequenceId(long sequenceId) {
            this.sequenceId = sequenceId;
        }

        public int getSequenceState() {
            return sequenceState;
        }

        public void setSequenceState(int sequenceState) {
            this.sequenceState = sequenceState;
        }

        public int getStockCount() {
            return stockCount;
        }

        public void setStockCount(int stockCount) {
            this.stockCount = stockCount;
        }

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }

        public String getWinningNumber() {
            return winningNumber;
        }

        public void setWinningNumber(String winningNumber) {
            this.winningNumber = winningNumber;
        }

        public static class GoodsinfoBean {
            /**
             * coverPic : [{"addTime":"2016-01-01 00:00:00","goodsId":1,"pictureId":1,"pictureShape":0,"pictureType":1001,"pictureUrl":"http://sqdb-goods.oss-cn-hangzhou.aliyuncs.com/214812542_41.jpg","pictureins":"黄焖鸡米饭"}]
             * goodsArea : 桐庐县
             * goodsCategory : 1
             * goodsCity : 杭州市
             * goodsDescription : 楼兰红酒传承千楼兰古文化但是但是大多都是大三大四的撒旦撒旦是的是的撒打算
             * goodsFlag : 0
             * goodsId : 1
             * goodsName : 楼兰红酒750ML
             * goodsNewFlag : 0
             * goodsPrice : 50
             * goodsProvince : 浙江省
             * goodsSequenceNum : 50
             * goodsState : 1
             * goodsUid : 63651621
             * userId : 1
             */

            private String goodsArea;
            private int goodsCategory;
            private String goodsCity;
            private String goodsDescription;
            private int goodsFlag;
            private long goodsId;
            private String goodsName;
            private int goodsNewFlag;
            private int goodsPrice;
            private String goodsProvince;
            private int goodsSequenceNum;
            private int goodsState;
            private String goodsUid;
            private long userId;
            private List<CoverPicBean> coverPic;

            public String getGoodsArea() {
                return goodsArea;
            }

            public void setGoodsArea(String goodsArea) {
                this.goodsArea = goodsArea;
            }

            public int getGoodsCategory() {
                return goodsCategory;
            }

            public void setGoodsCategory(int goodsCategory) {
                this.goodsCategory = goodsCategory;
            }

            public String getGoodsCity() {
                return goodsCity;
            }

            public void setGoodsCity(String goodsCity) {
                this.goodsCity = goodsCity;
            }

            public String getGoodsDescription() {
                return goodsDescription;
            }

            public void setGoodsDescription(String goodsDescription) {
                this.goodsDescription = goodsDescription;
            }

            public int getGoodsFlag() {
                return goodsFlag;
            }

            public void setGoodsFlag(int goodsFlag) {
                this.goodsFlag = goodsFlag;
            }

            public long getGoodsId() {
                return goodsId;
            }

            public void setGoodsId(long goodsId) {
                this.goodsId = goodsId;
            }

            public String getGoodsName() {
                return goodsName;
            }

            public void setGoodsName(String goodsName) {
                this.goodsName = goodsName;
            }

            public int getGoodsNewFlag() {
                return goodsNewFlag;
            }

            public void setGoodsNewFlag(int goodsNewFlag) {
                this.goodsNewFlag = goodsNewFlag;
            }

            public int getGoodsPrice() {
                return goodsPrice;
            }

            public void setGoodsPrice(int goodsPrice) {
                this.goodsPrice = goodsPrice;
            }

            public String getGoodsProvince() {
                return goodsProvince;
            }

            public void setGoodsProvince(String goodsProvince) {
                this.goodsProvince = goodsProvince;
            }

            public int getGoodsSequenceNum() {
                return goodsSequenceNum;
            }

            public void setGoodsSequenceNum(int goodsSequenceNum) {
                this.goodsSequenceNum = goodsSequenceNum;
            }

            public int getGoodsState() {
                return goodsState;
            }

            public void setGoodsState(int goodsState) {
                this.goodsState = goodsState;
            }

            public String getGoodsUid() {
                return goodsUid;
            }

            public void setGoodsUid(String goodsUid) {
                this.goodsUid = goodsUid;
            }

            public long getUserId() {
                return userId;
            }

            public void setUserId(long userId) {
                this.userId = userId;
            }

            public List<CoverPicBean> getCoverPic() {
                return coverPic;
            }

            public void setCoverPic(List<CoverPicBean> coverPic) {
                this.coverPic = coverPic;
            }

            public static class CoverPicBean {
                /**
                 * addTime : 2016-01-01 00:00:00
                 * goodsId : 1
                 * pictureId : 1
                 * pictureShape : 0
                 * pictureType : 1001
                 * pictureUrl : http://sqdb-goods.oss-cn-hangzhou.aliyuncs.com/214812542_41.jpg
                 * pictureins : 黄焖鸡米饭
                 */

                private String addTime;
                private long goodsId;
                private long pictureId;
                private int pictureShape;
                private int pictureType;
                private String pictureUrl;
                private String pictureins;

                public String getAddTime() {
                    return addTime;
                }

                public void setAddTime(String addTime) {
                    this.addTime = addTime;
                }

                public long getGoodsId() {
                    return goodsId;
                }

                public void setGoodsId(long goodsId) {
                    this.goodsId = goodsId;
                }

                public long getPictureId() {
                    return pictureId;
                }

                public void setPictureId(long pictureId) {
                    this.pictureId = pictureId;
                }

                public int getPictureShape() {
                    return pictureShape;
                }

                public void setPictureShape(int pictureShape) {
                    this.pictureShape = pictureShape;
                }

                public int getPictureType() {
                    return pictureType;
                }

                public void setPictureType(int pictureType) {
                    this.pictureType = pictureType;
                }

                public String getPictureUrl() {
                    return pictureUrl;
                }

                public void setPictureUrl(String pictureUrl) {
                    this.pictureUrl = pictureUrl;
                }

                public String getPictureins() {
                    return pictureins;
                }

                public void setPictureins(String pictureins) {
                    this.pictureins = pictureins;
                }
            }
        }
    }
}
