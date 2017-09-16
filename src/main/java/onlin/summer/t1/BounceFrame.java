package onlin.summer.t1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by lishimin on 2017/9/9.
 */
public class BounceFrame extends JFrame{
    private BallComponent comp;

    public BounceFrame(){
        setTitle("Bounce");

        comp = new BallComponent();
        add(comp, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        addButton(buttonPanel,"Start",new ActionListener(){
            public void actionPerformed(ActionEvent event){
                addBall();
            }
        });
        addButton(buttonPanel, "Close", new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(buttonPanel,BorderLayout.SOUTH);
        pack();
    }


    public void addButton(Container c,String title,ActionListener listener){

        JButton button = new JButton(title);
        c.add(button);
        button.addActionListener(listener);
    }

    public void addBall(){


        Ball ball = new Ball();
        comp.add(ball);
        Runnable r = new BallRunnable(ball,comp);
        Thread t = new Thread(r);
        t.start();
    }





}
