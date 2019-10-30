package com.cch.mobileshop.activity;

import java.util.List;

public class Response {

    int age;
    List<Myclass>classs;

    String name;
    String phone;
    ShouHuo shouhuodizhi;

    class Myclass{
        int keshi;
        String laoshi;
        String name;
    }

    class ShouHuo{
        String adder;
        String mobile;
    }
}
