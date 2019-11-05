package com.cch.mobileshop.bean;

public class LoginResponse {
    private int status;
    private String msg;
    private Data data;

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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data{
                private String  member_id;//": 34,
                private String  uname;//": "123",
                private String  password;//": "ICy5YqxZB1uWSwcVLSNLcA==",
                private String  email;//": "test123@qq.com",
                private int  sex;//": 0,
                private String  mobile;//": "",
                private long  regtime;//": 1479861190000,
                private long  lastlogin;//": null,
                private String  image;//": "",
                private String  memberAddresses;//": null

        public String getMember_id() {
            return member_id;
        }

        public void setMember_id(String member_id) {
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

        public String getMemberAddresses() {
            return memberAddresses;
        }

        public void setMemberAddresses(String memberAddresses) {
            this.memberAddresses = memberAddresses;
        }
    }

   /* {
        "status": 0,
            "msg": "登录成功",
            "data": {
        "member_id": 34,
                "uname": "123",
                "password": "ICy5YqxZB1uWSwcVLSNLcA==",
                "email": "test123@qq.com",
                "sex": 0,
                "mobile": "",
                "regtime": 1479861190000,
                "lastlogin": null,
                "image": "",
                "memberAddresses": null
    }
    }*/

}
