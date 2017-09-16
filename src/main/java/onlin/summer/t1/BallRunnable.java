package onlin.summer.t1;

import java.awt.*;

/**
 * Created by lishimin on 2017/9/9.
 */
public class BallRunnable implements Runnable{
    private Component component;
    private Ball ball;
    public static final int STEPS = 1000;
    public static final int DELAY = 5;

    public BallRunnable(Ball aBall, Component aCompont){
        ball = aBall;
        component = aCompont;
    }


    public void run() {
        try {
            for (int i = 1; i <= STEPS; i++){
                ball.move(component.getBounds());
                component.repaint();
                Thread.sleep(DELAY);
            }
        }
        catch (InterruptedException e){

        }

    }
}
