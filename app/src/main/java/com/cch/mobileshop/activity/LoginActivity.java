package com.cch.mobileshop.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import com.cch.mobileshop.R;
import com.cch.mobileshop.SpTools;
import com.cch.mobileshop.bean.LoginResponse;
import com.cch.mobileshop.bean.MyResponse;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.concurrent.TimeUnit;

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

       String url="http://10.10.16.65:8089/MobileShop/member/login2";

        OkHttpClient httpClient = new OkHttpClient.Builder().build();

        FormBody body = new FormBody.Builder()
                .add("input", username)
                .add("password", pwd)
                .build();
        Request request = new Request.Builder().url(url).post(body).build();

        httpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                //
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                //
                String json = response.body().string();
                //Gson  JSON解析： JSON---->Java对象

                Gson gson = new Gson();
               final MyResponse myResponse = gson.fromJson(json, MyResponse.class);

                //处理登录逻辑
                if(myResponse.getStatus()==0){


                    SpTools.setBoolean("isLogin",true);


                    //成功
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(LoginActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
                        }
                    });
                    finish();
                }else {
                    //失败
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(LoginActivity.this,myResponse.getMsg(),Toast.LENGTH_SHORT).show();
                        }
                    });
                }

            }
        });
    }

}
