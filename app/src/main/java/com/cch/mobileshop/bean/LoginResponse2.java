package com.cch.mobileshop.bean;

public class LoginResponse2 {

    /**
     * status : 0
     * msg : 登录成功
     * data : {"member_id":34,"uname":"test123","password":"ICy5YqxZB1uWSwcVLSNLcA==","email":"test123@qq.com","sex":0,"mobile":"","regtime":1479861190000,"lastlogin":null,"image":"","memberAddresses":null}
     */

    private int status;
    private String msg;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * member_id : 34
         * uname : test123
         * password : ICy5YqxZB1uWSwcVLSNLcA==
         * email : test123@qq.com
         * sex : 0
         * mobile :
         * regtime : 1479861190000
         * lastlogin : null
         * image :
         * memberAddresses : null
         */

        private int member_id;
        private String uname;
        private String password;
        private String email;
        private int sex;
        private String mobile;
        private long regtime;
        private long lastlogin;
        private String image;
        private Object memberAddresses;

        public int getMember_id() {
            return member_id;
        }

        public void setMember_id(int member_id) {
            this.member_id = member_id;
        }

        public String getUname() {
            return uname;
        }

        public void setUname(String uname) {
            this.uname = uname;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public long getRegtime() {
            return regtime;
        }

        public void setRegtime(long regtime) {
            this.regtime = regtime;
        }

        public long getLastlogin() {
            return lastlogin;
        }

        public void setLastlogin(long lastlogin) {
            this.lastlogin = lastlogin;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public Object getMemberAddresses() {
            return memberAddresses;
        }

        public void setMemberAddresses(Object memberAddresses) {
            this.memberAddresses = memberAddresses;
        }
    }
}
