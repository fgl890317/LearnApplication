package com.example.administrator.learnapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2015/8/24.
 */
public class SecondActivity extends Activity {
    private CustomApplication app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app = (CustomApplication) getApplication(); // 获取应用程序

        Log.i("SecondActivity", "当前值=====" + app.getValue()); // 获取全局值
    }
}
