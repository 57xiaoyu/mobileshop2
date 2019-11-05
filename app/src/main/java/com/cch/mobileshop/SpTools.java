package com.cch.mobileshop;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * SharedPreferences工具类
 */
public class SpTools {
    private static final String CONFIGFILE = "fc_sp_name";

    /**
     * @param key   关键字
     * @param value 对应的值
     */
    public static void setBoolean(String key, boolean value) {
        SharedPreferences sp = MyApp.app.getSharedPreferences(CONFIGFILE, Context.MODE_PRIVATE);
        sp.edit().putBoolean(key, value).commit();//提交保存键值对

    }

    /**
     * @param key      关键字
     * @param defValue 设置的默认值
     * @return
     */
    public static boolean getBoolean(String key, boolean defValue) {
        SharedPreferences sp = MyApp.app.getSharedPreferences(CONFIGFILE, Context.MODE_PRIVATE);
        return sp.getBoolean(key, defValue);
    }

    /**
     * @param key   关键字
     * @param value 对应的值
     */
    public static void setString(String key, String value) {
        SharedPreferences sp = MyApp.app.getSharedPreferences(CONFIGFILE, Context.MODE_PRIVATE);
        sp.edit().putString(key, value).commit();//提交保存键值对

    }

    /**
     * @param key      关键字
     * @param defValue 设置的默认值
     * @return
     */
    public static String getString(String key, String defValue) {
        SharedPreferences sp = MyApp.app.getSharedPreferences(CONFIGFILE, Context.MODE_PRIVATE);
        return sp.getString(key, defValue);
    }

    /**
     * @param key   关键字
     * @param value 对应的值
     */
    public static void setInt(String key, int value) {
        SharedPreferences sp = MyApp.app.getSharedPreferences(CONFIGFILE, Context.MODE_PRIVATE);
        sp.edit().putInt(key, value).commit();//提交保存键值对

    }

    /**
     * @param key      关键字
     * @param defValue 设置的默认值
     * @return
     */
    public static int getInt(String key, int defValue) {
        SharedPreferences sp = MyApp.app.getSharedPreferences(CONFIGFILE, Context.MODE_PRIVATE);
        return sp.getInt(key, defValue);
    }

    public static void setLong(String key, long value) {
        SharedPreferences sp = MyApp.app.getSharedPreferences(CONFIGFILE, Context.MODE_PRIVATE);
        sp.edit().putLong(key, value).commit();//提交保存键值对

    }

    public static long getLong(String key, long defValue) {
        SharedPreferences sp = MyApp.app.getSharedPreferences(CONFIGFILE, Context.MODE_PRIVATE);
        return sp.getLong(key, defValue);
    }
}
