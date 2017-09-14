package com.example.loggerdemo;

import android.util.Log;

/**
 * Created by hasee on 2017/9/14.
 */

public class LogUtils {

    private static final String TAG = "PRETTYLogUtils";
    public static boolean isDebug = BuildConfig.DEBUG;


    //封装了对应log的级别,越重要级别越高
    static class CanPrintLevel {
        public static final int VERBOSE = 1;
        public static final int DEBUG = 2;
        public static final int INFO = 3;
        public static final int WARING = 4;
        public static final int ERROR = 5;
    }


    //当前打印的级别,如果mLevel为5的话,只打印error,如果为小于等于1,所有的日志都打印
    //当前打印级别越高,能看到的日志越少
    private static int mCanPrintLevel = CanPrintLevel.VERBOSE;

    //设置当前打印的级别  如果设置他为5,那就只打印error的信息
    public static void setCanPrintLevel(int level) {
        mCanPrintLevel = level;
    }


    public static void v(double number) {
        if (isDebug && CanPrintLevel.VERBOSE >= mCanPrintLevel) {
            Log.v(TAG, number + "");
        }
    }

    public static void v(String tag, double number) {
        if (isDebug && CanPrintLevel.VERBOSE >= mCanPrintLevel) {
            Log.v(tag, number + "");
        }
    }

    public static void v(String Messagel) {
        if (isDebug && CanPrintLevel.VERBOSE >= mCanPrintLevel) {
            Log.e(TAG, Messagel);
        }
    }

    public static void v(String tag, String Messagel) {
        if (isDebug && CanPrintLevel.VERBOSE >= mCanPrintLevel) {
            Log.e(tag, Messagel);
        }
    }


    public static void d(double number) {
        if (isDebug && CanPrintLevel.DEBUG >= mCanPrintLevel) {
            Log.d(TAG, number + "");
        }
    }

    public static void d(String tag, double number) {
        if (isDebug && CanPrintLevel.DEBUG >= mCanPrintLevel) {
            Log.d(tag, number + "");
        }
    }

    public static void d(String Messagel) {
        if (isDebug && CanPrintLevel.DEBUG >= mCanPrintLevel) {
            Log.d(TAG, Messagel);
        }
    }

    public static void d(String tag, String Messagel) {
        if (isDebug && CanPrintLevel.DEBUG >= mCanPrintLevel) {
            Log.d(tag, Messagel);
        }
    }

    public static void d(Object object) {
        if (isDebug && CanPrintLevel.DEBUG >= mCanPrintLevel) {
            Log.d(TAG, object.toString());
        }
    }

    public static void d(String tag, Object object) {
        if (isDebug && CanPrintLevel.DEBUG >= mCanPrintLevel) {
            Log.d(tag, object.toString());
        }
    }

    public static void d(String format, Object... object) {
        if (isDebug && CanPrintLevel.DEBUG >= mCanPrintLevel) {
            Log.e(TAG,String.format(format,object));
        }
    }

}
