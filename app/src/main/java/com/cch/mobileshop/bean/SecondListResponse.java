package com.cch.mobileshop.bean;

import java.util.List;

public class SecondListResponse {


    /**
     * status : 0
     * msg : 加载子分类成功
     * data : [{"cat_id":4,"name":"茶饮料","parent_id":1,"cat_path":"0,1,2","goods_count":20,"sort":1,"type_id":4,"list_show":0,"image":"http://192.168.0.104:8080/MobileShop/img/goods/2.jpg","creatime":1473306900000,"modifytime":1473405141000,"briefGoodsType":{"type_id":4,"name":"饮料","params":"{\"产地\":\"\",\"净含量\":\"\",\"保质期\":\"\",\"口味\":\"\"}"}},{"cat_id":2,"name":"果蔬饮料","parent_id":1,"cat_path":"0,1,1","goods_count":3,"sort":0,"type_id":4,"list_show":0,"image":"http://192.168.0.104:8080/MobileShop/img/goods/1.jpg","creatime":1473306627000,"modifytime":1473306627000,"briefGoodsType":{"type_id":4,"name":"饮料","params":"{\"产地\":\"\",\"净含量\":\"\",\"保质期\":\"\",\"口味\":\"\"}"}},{"cat_id":62,"name":"牛奶","parent_id":1,"cat_path":"0,1,3","goods_count":0,"sort":0,"type_id":4,"list_show":0,"image":"http://192.168.0.104:8080/MobileShop/img/goods/5.jpg","creatime":1484276821000,"modifytime":1484276821000,"briefGoodsType":{"type_id":4,"name":"饮料","params":"{\"产地\":\"\",\"净含量\":\"\",\"保质期\":\"\",\"口味\":\"\"}"}}]
     */

    private int status;
    private String msg;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * cat_id : 4
         * name : 茶饮料
         * parent_id : 1
         * cat_path : 0,1,2
         * goods_count : 20
         * sort : 1
         * type_id : 4
         * list_show : 0
         * image : http://192.168.0.104:8080/MobileShop/img/goods/2.jpg
         * creatime : 1473306900000
         * modifytime : 1473405141000
         * briefGoodsType : {"type_id":4,"name":"饮料","params":"{\"产地\":\"\",\"净含量\":\"\",\"保质期\":\"\",\"口味\":\"\"}"}
         */

        private int cat_id;
        private String name;
        private int parent_id;
        private String cat_path;
        private int goods_count;
        private int sort;
        private int type_id;
        private int list_show;
        private String image;
        private long creatime;
        private long modifytime;
        private BriefGoodsTypeBean briefGoodsType;

        public int getCat_id() {
            return cat_id;
        }

        public void setCat_id(int cat_id) {
            this.cat_id = cat_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getParent_id() {
            return parent_id;
        }

        public void setParent_id(int parent_id) {
            this.parent_id = parent_id;
        }

        public String getCat_path() {
            return cat_path;
        }

        public void setCat_path(String cat_path) {
            this.cat_path = cat_path;
        }

        public int getGoods_count() {
            return goods_count;
        }

        public void setGoods_count(int goods_count) {
            this.goods_count = goods_count;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public int getType_id() {
            return type_id;
        }

        public void setType_id(int type_id) {
            this.type_id = type_id;
        }

        public int getList_show() {
            return list_show;
        }

        public void setList_show(int list_show) {
            this.list_show = list_show;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public long getCreatime() {
            return creatime;
        }

        public void setCreatime(long creatime) {
            this.creatime = creatime;
        }

        public long getModifytime() {
            return modifytime;
        }

        public void setModifytime(long modifytime) {
            this.modifytime = modifytime;
        }

        public BriefGoodsTypeBean getBriefGoodsType() {
            return briefGoodsType;
        }

        public void setBriefGoodsType(BriefGoodsTypeBean briefGoodsType) {
            this.briefGoodsType = briefGoodsType;
        }

        public static class BriefGoodsTypeBean {
            /**
             * type_id : 4
             * name : 饮料
             * params : {"产地":"","净含量":"","保质期":"","口味":""}
             */

            private int type_id;
            private String name;
            private String params;

            public int getType_id() {
                return type_id;
            }

            public void setType_id(int type_id) {
                this.type_id = type_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getParams() {
                return params;
            }

            public void setParams(String params) {
                this.params = params;
            }
        }
    }
}
