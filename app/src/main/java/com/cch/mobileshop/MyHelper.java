package com.cch.mobileshop;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyHelper extends SQLiteOpenHelper {
    public MyHelper(Context context) {
        //1.1   1

        //1.2    2
        super(context, "my_sqlite", null, 1);
    }

    //数据库创建时调用
    @Override
    public void onCreate(SQLiteDatabase db) {
        // SQL语句
        db.execSQL("create table users (user_id,user_name)");
    }

    //数据库升级时调用
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        //

    }
}
