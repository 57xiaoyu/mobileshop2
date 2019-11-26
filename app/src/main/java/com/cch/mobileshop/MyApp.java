package com.cch.mobileshop;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.zhy.http.okhttp.OkHttpUtils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

public class MyApp extends Application {

    public static Context app;
    @Override
    public void onCreate() {
        super.onCreate();

        ///
        app=getApplicationContext();
        //GreenDao


        OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                .addInterceptor(new LoggerInterceptor("TAG"))
                .connectTimeout(10000L, TimeUnit.MILLISECONDS)
                .readTimeout(10000L, TimeUnit.MILLISECONDS)
                //其他配置
                .build();

        OkHttpUtils.initClient(okHttpClient);

        //初始化ImageLoader

        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .showImageOnFail(R.mipmap.error)
                .showImageOnLoading(R.mipmap.zhanweitu)
                .build();
        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration
                .Builder(getApplicationContext())
                .defaultDisplayImageOptions(options)
                .build();
        ImageLoader.getInstance().init(configuration);
    }

}
