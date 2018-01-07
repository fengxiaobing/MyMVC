package com.example.mymvc;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mymvc.base.BaseActivity;

public class MainActivity extends BaseActivity {
    TextView textView;


    @Override
    protected int getRootView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        textView = findViewById(R.id.tv);
    }

    @Override
    protected void initData() {
        textView.setText("哈哈哈");
    }

    @Override
    protected void initListener() {
        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        super.onClick(view);
        Toast.makeText(this, "hahaha", Toast.LENGTH_SHORT).show();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment, new MainFragment());

        // addToBackStack添加到回退栈,addToBackStack与ft.add(R.id.fragment, new
        // MyFragment())效果相当
        // ft.addToBackStack("test");

        ft.commit();
    }
}
