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
import android.widget.TextView;

import com.cch.mobileshop.R;


public class AdActivity extends AppCompatActivity {
    TextView tv_count;

    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad);

         tv_count=findViewById(R.id.tv_count);

        tv_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.removeCallbacks(task);
                Intent intent=new Intent(AdActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
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

        count=5;
        handler.postDelayed(task,1000);

        //handler.handleMessage();
    }

    int count =5;
    Runnable task= new Runnable() {
        @Override
        public void run() {
            tv_count.setText("点击跳转 "+count);
            if(count>0){
                count--;
                handler.postDelayed(task,1000);
            }else {
                Intent intent=new Intent(AdActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }
    };

}
