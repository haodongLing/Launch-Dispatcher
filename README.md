# Launch-Dispatcher
第三方框架实例化框架
## 使用方式
### 添加依赖
```
 implementation 'io.github.haodongling:Launch_Dispatcher:1.0.0'
```
- MainTask: 在主线程中执行
- Task: 在子线程中执行
### 在Application中实例化
```
   TaskDispatcher.init(this);

        TaskDispatcher dispatcher = TaskDispatcher.createInstance();

        dispatcher.addTask(new InitAMapTask())
                .addTask(new InitStethoTask())
                .addTask(new InitBuglyTask())
                .addTask(new InitFrescoTask())
                .addTask(new InitUmengTask())
                .addTask(new GetDeviceIdTask())
                .start();

        dispatcher.await();// 等待执行完成，默认等待10s
```
- 若相关Task之间有依赖关系，可实现重写`Task`的`dependOn`方法
```
public class InitJPushTask extends Task {

    @Override
    public List<Class<? extends Task>> dependsOn() {
        List<Class<? extends Task>> task = new ArrayList<>();
        task.add(GetDeviceIdTask.class);
        return task;
    }

    @Override
    public void run() {
        JPushInterface.init(mContext);
        PerformanceApp app = (PerformanceApp) mContext;
        JPushInterface.setAlias(mContext, 0, app.getDeviceId());
    }
}
```

