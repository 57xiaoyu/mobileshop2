package com.cch.mobileshop.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.cch.mobileshop.R;
import com.cch.mobileshop.bean.SecondListResponse;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RightAdapter extends RecyclerView.Adapter <RightAdapter.RightHoder>{


    private final Context context;
    private final ArrayList<SecondListResponse.DataBean> datas;

    public RightAdapter(Context context, ArrayList<SecondListResponse.DataBean> rightDatas) {
        this.context=context;
        this.datas=rightDatas;
    }

    @NonNull
    @Override
    public RightHoder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.right_item, viewGroup, false);
        return new RightHoder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RightHoder rightHoder, int i) {
        SecondListResponse.DataBean dataBean = datas.get(i);
        rightHoder.tv_name.setText(dataBean.getName());

        Glide.with(context)
                //.load(dataBean.getImage())
                .load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1574141635052&di=7fb8170cf7b4ccb60faef5bd2c222b38&imgtype=0&src=http%3A%2F%2Fpic18.nipic.com%2F20120204%2F4938944_155731011373_2.jpg")
                .into(rightHoder.iv_icon);
    }

    @Override
    public int getItemCount() {
        if(datas==null){
            return 0;
        }
        return datas.size();
    }

    public class RightHoder extends RecyclerView.ViewHolder{


        @BindView(R.id.tv_name)TextView tv_name;
        @BindView(R.id.iv_icon)ImageView iv_icon;

        public RightHoder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
