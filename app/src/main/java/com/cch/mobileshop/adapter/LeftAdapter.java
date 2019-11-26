package com.cch.mobileshop.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cch.mobileshop.R;
import com.cch.mobileshop.bean.FenLeiDingjiResponse;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LeftAdapter extends RecyclerView.Adapter<LeftAdapter.LeftHoder> implements View.OnClickListener {


    private final Context context;
    private final List<FenLeiDingjiResponse.DataBean> datas;

    //当前选中的位置
    private int cunrunt_pos;
    private OnItemClickLisener onItemClickLisener;

    public LeftAdapter(Context context, List<FenLeiDingjiResponse.DataBean> leftDatas) {
        this.context=context;
        this.datas=leftDatas;
    }

    @NonNull
    @Override
    public LeftHoder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.left_item, viewGroup, false);
        view.setOnClickListener(this);
        return new LeftHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LeftHoder leftHoder, int i) {
        leftHoder.itemView.setTag(i);
        FenLeiDingjiResponse.DataBean dataBean = datas.get(i);
        leftHoder.tv_name.setText(dataBean.getName());
        if(cunrunt_pos==i){
            leftHoder.tv_name.setBackgroundColor(0xffffffff);
        }else {
            leftHoder.tv_name.setBackgroundColor(0xffF3F4F6);
        }
    }

    @Override
    public int getItemCount() {
        if(datas==null){
            return 0;
        }
        return datas.size();
    }

    @Override
    public void onClick(View v) {
       int pos= (int) v.getTag();
        cunrunt_pos=pos;

        if(onItemClickLisener!=null){
            onItemClickLisener.onItemClick(pos);
        }
        notifyDataSetChanged();
    }

    public void setOnItemClickLisner(OnItemClickLisener l) {
        this.onItemClickLisener=l;
    }

    public  class  LeftHoder extends RecyclerView.ViewHolder{

        @BindView(R.id.tv_name)
        TextView tv_name;

        public LeftHoder(@NonNull View itemView) {
            super(itemView);
           //tv_name= itemView.findViewById(R.id.tv_name);
            ButterKnife.bind(this,itemView);
        }
    }

    public interface OnItemClickLisener{
        void onItemClick(int pos);
    }
}
