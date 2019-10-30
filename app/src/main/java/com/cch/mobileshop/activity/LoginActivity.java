package com.cch.mobileshop.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;

import com.cch.mobileshop.R;

import java.io.IOException;
import java.net.HttpURLConnection;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.et_username)
    EditText et_username;
    @BindView(R.id.et_pwd)
    EditText et_pwd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.bt_login)
    void login() {

        final String username = et_username.getText().toString();
       final String pwd = et_pwd.getText().toString();

        ///登录逻辑
        //HttpURLConnection
        //Okhttp
        //Retorfit
        //Volley
        //XUtils
        new Thread() {
            @Override
            public void run() {
                super.run();
                //OkHttpClient build = new OkHttpClient.Builder() .build();
                String url="http://10.10.16.78:8088/MobileShop/member/login";

                OkHttpClient httpClient = new OkHttpClient();
                FormBody body = new FormBody.Builder()
                        .add("uname", username)
                        .add("password", pwd).build();
                Request request = new Request
                        .Builder()
                        .url(url)
                        .post(body)
                        .build();
                // NetworkOnMainThreadException
                try {
                    Response response = httpClient.newCall(request).execute();
                    Log.d("Response", response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }.start();


    }

}
