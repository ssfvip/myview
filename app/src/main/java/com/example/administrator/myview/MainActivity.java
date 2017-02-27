package com.example.administrator.myview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.btn_auto).setOnClickListener(this);
        findViewById(R.id.btn_day).setOnClickListener(this);
        findViewById(R.id.btn_night).setOnClickListener(this);
        findViewById(R.id.fab).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_auto: {
                getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
                recreate();
                break;
            }
            case R.id.btn_day: {
                getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                recreate();
                break;
            }
            case R.id.btn_night: {
                getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                recreate();
                break;
            }
        }
    }


    /**
     * 高级自定义控件
     * 监听滑动
     * 动画的进入/出去
     * 1,。Listview
     * 2.气泡绘制上去
     * 自定义Listview，在Listview添加一个子View，还要监听动画
     */
}
