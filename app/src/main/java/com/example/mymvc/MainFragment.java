package com.example.mymvc;

import android.os.Bundle;
import android.widget.TextView;

import com.example.mymvc.base.BaseFragment;

/**
 * Created by Administrator on 2018/1/7.
 */

public class MainFragment extends BaseFragment{
    TextView textView;
    @Override
    protected int setLayoutResouceId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        super.initView();
        textView = findViewById(R.id.tv);
    }

    @Override
    protected void initData(Bundle arguments) {
        super.initData(arguments);
        textView.setText("啦啦啦");
    }
}
