package com.haodong.launch.dispatcher;

import android.app.Application;

import com.haodong.launch.dispatcher.tasks.GetDeviceIdTask;
import com.haodong.launch.dispatcher.tasks.InitAMapTask;
import com.haodong.launch.dispatcher.tasks.InitBuglyTask;
import com.haodong.launch.dispatcher.tasks.InitFrescoTask;
import com.haodong.launch.dispatcher.tasks.InitStethoTask;
import com.haodong.launch.dispatcher.tasks.InitUmengTask;

/**
 * Author: tangyuan
 * Time : 2021/8/19
 * Description:
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        TaskDispatcher.init(this);

        TaskDispatcher dispatcher = TaskDispatcher.createInstance();

        dispatcher.addTask(new InitAMapTask())
                .addTask(new InitStethoTask())
                .addTask(new InitBuglyTask())
                .addTask(new InitFrescoTask())
                .addTask(new InitUmengTask())
                .addTask(new GetDeviceIdTask())
                .start();

        dispatcher.await();
    }
}
