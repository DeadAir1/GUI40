package Practise.Watki;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
        JButton button=new JButton("Click me");
        MyWindow(){
                this.setSize(new Dimension(600,400));
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                this.setLayout(new BorderLayout());
                 this.getContentPane().setBackground(Color.BLUE);
                 button.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                         SecondWindow secondWindow = new SecondWindow();
                         Thread thread=new Thread(secondWindow);
                         thread.start();
                     }
                 });
                this.add(button,BorderLayout.PAGE_END);
                this.setBackground(Color.BLUE);
                this.setVisible(true);
            }
    public static void main(String[] args) {
            MyWindow window=new MyWindow();
            Thread thread =new Thread(()-> {
                        for (int i = 0; i <1000 ; i++) {
                        System.out.println("Loop from main " + i );
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }});
            thread.start();




    }

}
class SecondWindow extends JFrame implements Runnable {
    public SecondWindow()  {
        this.setSize(new Dimension(600,400));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println("Loop from second " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
