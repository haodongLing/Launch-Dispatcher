package com.haodong.launch.dispatcher.tasks;

import android.content.Context;
import android.telephony.TelephonyManager;

import com.haodong.launch.dispatcher.App;
import com.haodong.launch.dispatcher.task.Task;


public class GetDeviceIdTask extends Task {
    private String mDeviceId;

    @Override
    public void run() {
        // 真正自己的代码
        TelephonyManager tManager = (TelephonyManager) mContext.getSystemService(
                Context.TELEPHONY_SERVICE);
    }
}
