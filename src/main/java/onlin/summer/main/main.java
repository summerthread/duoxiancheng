package onlin.summer.main;

import onlin.summer.Runnable.MyRunnable;
import onlin.summer.t1.BounceFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by p2p on 2017/8/4.
 */
public class main {
    public static void main(String [] args){

//        Runnable runnable = new MyRunnable();
//        Thread thread = new Thread(runnable);
//        thread.start();
//        System.out.println("运行结束!!!");
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new BounceFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });




    }

    public void test1(){
        System.out.println(Thread.currentThread().getName());

//        try{
//            MyThread myThread = new MyThread();
//            myThread.setName("summer");
//            myThread.start();
//            for (int i = 0;i <10;i++){
//                int time = (int) (Math.random() * 1000);
//                myThread.sleep(time);
//                System.out.println("Main = " + Thread.currentThread().getName());
//            }
//
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }
    }
    public void test2(){
        MyThread t1 = new MyThread(1);
        MyThread t2 = new MyThread(2);
        MyThread t3 = new MyThread(3);
        MyThread t4 = new MyThread(4);
        MyThread t5 = new MyThread(5);
        MyThread t6 = new MyThread(6);
        MyThread t7 = new MyThread(7);
        MyThread t8 = new MyThread(8);
        MyThread t9 = new MyThread(9);
        MyThread t10 = new MyThread(10);
        MyThread t11 = new MyThread(11);
        MyThread t12 = new MyThread(12);
        MyThread t13 = new MyThread(13);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
        t13.start();

    }

}

