package com.example.administrator.learnapplication;

import android.app.Application;

/**
 * Created by Administrator on 2015/8/24.
 */
public class CustomApplication extends Application {
    private static final String VALUE="Harvey";
    private  String value;

    @Override
    public void onCreate() {
        super.onCreate();
        setValue(VALUE);

    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
