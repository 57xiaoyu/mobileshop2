package com.cch.mobileshop;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class MyApp extends Application {

    public static Context app;
    @Override
    public void onCreate() {
        super.onCreate();

        ///
        app=getApplicationContext();
        //GreenDao
    }

}
