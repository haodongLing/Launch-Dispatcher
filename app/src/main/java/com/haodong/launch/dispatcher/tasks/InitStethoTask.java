package com.haodong.launch.dispatcher.tasks;

import android.os.Handler;
import android.os.Looper;

import com.facebook.stetho.Stetho;
import com.haodong.launch.dispatcher.task.Task;

/**
 * 异步的Task
 */
public class InitStethoTask extends Task {

    @Override
    public void run() {

        Handler handler = new Handler(Looper.getMainLooper());
        Stetho.initializeWithDefaults(mContext);
    }
}
