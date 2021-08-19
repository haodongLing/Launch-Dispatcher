package com.haodong.launch.dispatcher.utils;

import android.util.Log;

import com.haodong.launch.dispatcher.BuildConfig;


/**
 * Author: tangyuan
 * Time : 2021/7/16
 * Description: 初始化专用Log
 */
public class DispatcherLog {

    private static boolean sDebug = BuildConfig.DEBUG;

    public static void i(String msg) {
        if (!sDebug) {
            return;
        }
        Log.i("TaskDispatcher", msg);
    }

    public static boolean isDebug() {
        return sDebug;
    }

    public static void setDebug(boolean debug) {
        sDebug = debug;
    }

}
