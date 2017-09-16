package com.summer.concurrent.base;

/**
 * Created by lishimin on 2017/9/10.
 */
public class ArmyRunnable implements Runnable{
    //保证线程可以正确的读取其他线程写入的值
    volatile boolean keepRunning = true;

    public void run() {
        while (keepRunning){
            //发动5连攻击
            for (int i = 0;i < 5;i++){
                System.out.println(Thread.currentThread().getName() + "进攻对方["+i+"]");
                //让出处理器时间，下次该谁进攻还不一定呢！
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName()+"结束了战斗！");
    }
}
