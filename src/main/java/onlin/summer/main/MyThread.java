package onlin.summer.main;

/**
 * Created by lishimin on 2017/8/24.
 */
public class MyThread extends Thread{
    private int i;

    public MyThread (int i){
        super();
        this.i = i;
    }



    @Override
    public void run() {
        System.out.println(i);
    }

    public void thread1(){
        try {
            for (int i = 0;i<10;i++){
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
