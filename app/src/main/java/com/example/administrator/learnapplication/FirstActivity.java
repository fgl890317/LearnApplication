package com.example.administrator.learnapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2015/8/24.
 */
public class FirstActivity extends Activity {
    private CustomApplication app;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        app= (CustomApplication) getApplication();
        Log.i("FirstActivity", "初始值=====" + app.getValue()); // 获取进程中的全局变量值，看是否是初始化值
        app.setValue("Harvey Ren"); // 重新设置值
        Log.i("FirstActivity", "修改后=====" + app.getValue()); // 再次获取进程中的全局变量值，看是否被修改
        Intent intent=new Intent();
        startActivity(intent);
    }
}
