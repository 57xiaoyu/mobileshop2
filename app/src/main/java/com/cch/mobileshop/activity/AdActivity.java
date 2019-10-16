package com.cch.mobileshop.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cch.mobileshop.R;

import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class AdActivity extends AppCompatActivity {

    @BindView(R.id.tv_count)
    TextView tv_count;

    @BindView(R.id.iv_image)
    ImageView imageView;

    @BindView(R.id.rl_root)
    RelativeLayout relativeLayout;

    @BindString(R.string.app_name)
    String str;

    @BindColor(R.color.colorAccent)
    int col;

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };


    @OnClick({R.id.tv_count, R.id.iv_image})
    public void startMainActivity(View view) {
        if(view.getId()==R.id.tv_count) {
            handler.removeCallbacks(task);
            Intent intent = new Intent(AdActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }else {
            //
        }
    }
/*
    @OnClick(R.id.iv_image)
    void onImageClick(){
        //点击后执行
    }*/

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad);
        //Butterknife绑定Activity
        ButterKnife.bind(this);




        tv_count.setBackgroundColor(col);
        //tv_count.setText(getResources().getString(R.string.app_name));
        tv_count.setText(str);

       /* tv_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.removeCallbacks(task);
                Intent intent=new Intent(AdActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });*/
        //主线程  UI

        //UI 线程不能做耗时的操作  UI线程不能阻塞
        //如何倒计时

        //如何创建新线程
        /*Thread thread = new Thread();
        thread.start();*/

       /* new Thread(){
            @Override
            public void run() {
                super.run();
                ///


            }
        }.start();
*/


        //1.  TimerTask;
        //1   handler
//
  /*      CountDownTimer countDownTimer=new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {

            }
        };  countDownTimer.start();*/

        count = 5;
        handler.postDelayed(task, 1000);

        //handler.handleMessage();
    }

    int count = 5;
    Runnable task = new Runnable() {
        @Override
        public void run() {
            tv_count.setText("点击跳转 " + count);
            if (count > 0) {
                count--;
                handler.postDelayed(task, 1000);
            } else {
                Intent intent = new Intent(AdActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }
    };


}
