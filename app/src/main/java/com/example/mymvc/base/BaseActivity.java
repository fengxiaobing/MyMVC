package com.example.mymvc.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2018/1/7.
 */

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //1、初始化布局
        setContentView(getRootView());

        //2、初始化控件
        initView();

        //3、初始化数据
        initData();

        //4、初始化点击事件
        initListener();
    }

    /**初始化布局*/
    protected abstract int getRootView();
    /**初始化控件*/
    protected abstract void initView();
    /**初始化数据*/
    protected abstract void initData();
    /**初始化点击事件*/
    protected abstract void initListener();

    @Override
    public void onClick(View view) {

    }

    /**
     * 可以写一写常用的方法，但是为了内存管理有些最好还是使用工具类
     * 因为如果写到基类里面，他是初始化到内存里面的，也就是说没有使用，就已经占用空间
     */

    protected void startActivity(Class<? extends Activity> clazz){
        Intent in = new Intent(this,clazz);
        startActivity(in);
    }
}
