package com.cch.mobileshop.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cch.mobileshop.R;
import com.cch.mobileshop.adapter.LeftAdapter;
import com.cch.mobileshop.adapter.RightAdapter;
import com.cch.mobileshop.bean.FenLeiDingjiResponse;
import com.cch.mobileshop.bean.SecondListResponse;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;

public class FenLeiFragment extends Fragment {

    @BindView(R.id.rv_left)RecyclerView rv_left;
    @BindView(R.id.rv_right)RecyclerView rv_right;

    private List<FenLeiDingjiResponse.DataBean> leftDatas;
    private LeftAdapter leftAdapter;
    private ArrayList<SecondListResponse.DataBean> rightDatas;
    private RightAdapter rightAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cata, container, false);
        ButterKnife.bind(this,view);
        initView();
        initData();
        return view;
    }

    private void initData() {
        //发送网络请求获取顶级列表的数据
        OkHttpUtils.get()
                .url("http://10.10.16.73:8089/MobileShop/cat")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        //

                        Gson gson = new Gson();
                        FenLeiDingjiResponse fenLeiDingjiResponse = gson.fromJson(response, FenLeiDingjiResponse.class);

                        List<FenLeiDingjiResponse.DataBean> data = fenLeiDingjiResponse.getData();
                        if(data!=null&&data.size()!=0){
                            leftDatas.clear();
                            leftDatas.addAll(data);

                            leftAdapter.notifyDataSetChanged();

                            //加载默认的 也就是第一个
                            getSecondList(0);
                        }
                    }
                });


    }

    private void initView() {

        //
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        rv_left.setLayoutManager(linearLayoutManager);

        leftDatas = new ArrayList<>();
        leftAdapter = new LeftAdapter(getActivity(), leftDatas);

        leftAdapter.setOnItemClickLisner(new LeftAdapter.OnItemClickLisener(){
            @Override
            public void onItemClick(int pos) {


                //加载二级列表
                getSecondList(pos);

            }
        });
        rv_left.setAdapter(leftAdapter);



        //
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 3, OrientationHelper.VERTICAL, false);
        rv_right.setLayoutManager(gridLayoutManager);

        rightDatas =new ArrayList<SecondListResponse.DataBean>();
        rightAdapter = new RightAdapter(getActivity(), rightDatas);
        rv_right.setAdapter(rightAdapter);


    }

    private void getSecondList(int pos) {
        FenLeiDingjiResponse.DataBean dataBean = leftDatas.get(pos);
        int cat_id = dataBean.getCat_id();
        String url="http://10.10.16.73:8089/MobileShop/cat/parent/"+cat_id;
        //发送网络请求获取顶级列表的数据
        OkHttpUtils.get()
                .url(url)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {

                        Gson gson = new Gson();
                        SecondListResponse secondListResponse = gson.fromJson(response, SecondListResponse.class);
                        List<SecondListResponse.DataBean> data = secondListResponse.getData();

                        if(data!=null&&data.size()!=0){
                            rightDatas.clear();
                            rightDatas.addAll(data);
                            rightAdapter.notifyDataSetChanged();
                        }
                    }
                });
    }
}
