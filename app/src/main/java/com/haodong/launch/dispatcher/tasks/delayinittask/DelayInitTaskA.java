package com.haodong.launch.dispatcher.tasks.delayinittask;


import com.haodong.launch.dispatcher.task.MainTask;
import com.haodong.launch.dispatcher.utils.DispatcherLog;

public class DelayInitTaskA extends MainTask {

    @Override
    public void run() {
        // 模拟一些操作
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        DispatcherLog.i("DelayInitTaskA finished");
    }
}
