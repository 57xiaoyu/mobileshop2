package com.cch.mobileshop.bean;

import java.util.List;

public class FenLeiDingjiResponse {

    /**
     * status : 0
     * msg : 加载顶级分类成功
     * data : [{"cat_id":1,"name":"饮料","parent_id":0,"cat_path":"0,1","goods_count":28,"sort":5,"type_id":4,"list_show":0,"image":"","creatime":1473306495000,"modifytime":1473306495000,"briefGoodsType":{"type_id":4,"name":"饮料","params":"{\"产地\":\"\",\"净含量\":\"\",\"保质期\":\"\",\"口味\":\"\"}"}},{"cat_id":5,"name":"酒水","parent_id":0,"cat_path":"0,2","goods_count":16,"sort":0,"type_id":5,"list_show":0,"image":"","creatime":1477357645000,"modifytime":1477357645000,"briefGoodsType":{"type_id":5,"name":"酒水","params":"{\"产地\":\"\",\"储存方法\":\"\",\"品种\":\"\",\"净含量\":\"\",\"保质期\":\"\",\"配料\":\"\"}"}},{"cat_id":9,"name":"服装","parent_id":0,"cat_path":"0,3","goods_count":1,"sort":0,"type_id":7,"list_show":0,"image":"","creatime":1477366261000,"modifytime":1477366261000,"briefGoodsType":{"type_id":7,"name":"女装","params":"{\"袖长\":\"\",\"流行元素\":\"\",\"风格\":\"\",\"衣长\":\"\"}"}},{"cat_id":28,"name":"洗护用品","parent_id":0,"cat_path":"0,5","goods_count":0,"sort":0,"type_id":27,"list_show":0,"image":"","creatime":1484275499000,"modifytime":1484275499000,"briefGoodsType":{"type_id":27,"name":" 洗护用品","params":"{\"产地\":\"\",\"功效\":\"\",\"适用人群\":\"\",\"净含量\":\"\",\"保质期\":\"\"}"}},{"cat_id":29,"name":"美妆","parent_id":0,"cat_path":"0,6","goods_count":2,"sort":0,"type_id":22,"list_show":0,"image":"","creatime":1484275508000,"modifytime":1484275508000,"briefGoodsType":{"type_id":22,"name":"化妆品","params":"{\"产地\":\"\",\"功效\":\"\",\"保质期\":\"\",\"适合肤质\":\"\",\"规格类型\":\"\"}"}},{"cat_id":35,"name":"珠宝首饰","parent_id":0,"cat_path":"0,10","goods_count":0,"sort":0,"type_id":23,"list_show":0,"image":"","creatime":1484275690000,"modifytime":1484275690000,"briefGoodsType":{"type_id":23,"name":"珠宝","params":"{\"产地\":\"\",\"重量\":\"\",\"贵重金属成分\":\"\",\"售后服务\":\"\",\"款式\":\"\"}"}},{"cat_id":36,"name":"鞋","parent_id":0,"cat_path":"0,10","goods_count":0,"sort":0,"type_id":24,"list_show":0,"image":"","creatime":1484276190000,"modifytime":1484276190000,"briefGoodsType":{"type_id":24,"name":"鞋","params":"{\"产地\":\"\",\"适合对象\":\"\",\"材质\":\"\",\"鞋跟\":\"\",\"款式\":\"\"}"}},{"cat_id":37,"name":"包","parent_id":0,"cat_path":"0,10","goods_count":0,"sort":0,"type_id":28,"list_show":0,"image":"","creatime":1484276209000,"modifytime":1484276209000,"briefGoodsType":{"type_id":28,"name":"包","params":"{\"产地\":\"\",\"颜色\":\"\",\"材质\":\"\",\"适用人群\":\"\",\"款式\":\"\"}"}},{"cat_id":50,"name":"电子产品","parent_id":0,"cat_path":"0,7","goods_count":0,"sort":0,"type_id":25,"list_show":0,"image":"","creatime":1484276497000,"modifytime":1484276497000,"briefGoodsType":{"type_id":25,"name":"电子产品","params":"{\"机身颜色\":\"\",\"品牌\":\"\",\"型号\":\"\",\"规格\":\"\",\"证书编号\":\"\"}"}}]
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
         * cat_id : 1
         * name : 饮料
         * parent_id : 0
         * cat_path : 0,1
         * goods_count : 28
         * sort : 5
         * type_id : 4
         * list_show : 0
         * image :
         * creatime : 1473306495000
         * modifytime : 1473306495000
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
