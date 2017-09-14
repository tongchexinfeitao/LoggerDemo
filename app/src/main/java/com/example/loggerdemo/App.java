package com.example.loggerdemo;

import android.app.Application;

import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.Settings;

/**
 * Created by hasee on 2017/9/14.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //设置当前应用,能够打印日志的级别,
        // 如果为1或者小于1,所有日志都能打印出来,如果设置大于5那么就没有日志能够打印
//        LogUtils.setCanPrintLevel(LogUtils.CanPrintLevel.VERBOSE);

        Settings settings = Logger.init("我自己的tag")
                //设置隐藏 线程信息
                .hideThreadInfo()
                //设置log的具体位置 要显示的方法个数,默认是2;
                .methodCount(2);

        //根据当前app是debug版本还是release版本,设置是否打印日志
        if (BuildConfig.DEBUG) {

            //设置打印log
            settings.logLevel(LogLevel.FULL);
        } else {
            //设置不打印log
            settings.logLevel(LogLevel.NONE);
        }
    }
}
