package InterfaceReturn;

import java.util.Timer;
import java.util.TimerTask;

public class Me {
    private Timer mTimer;
    public void wantSleep(){
        System.out.println("我想要睡觉了....");
    }

    public void startSleep(){
        mTimer = new Timer();
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("开始呼呼大睡....");
            }
        },0,1000);//在指定的延迟之后，以固定速率为1000ms来执行所指定的任务

    }

    public void stopSleep(){
        if (mTimer != null) {
            mTimer.cancel();
            mTimer = null;
            System.out.println("停止睡觉....");
        }
    }





}
