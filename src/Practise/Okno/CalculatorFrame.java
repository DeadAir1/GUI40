package Practise.Okno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame (){
        JPanel buttonPanel=new JPanel();
        JButton button0=new JButton("0");
        JButton button1=new JButton("1");
        JButton button2=new JButton("2");
        JButton button3=new JButton("3");
        JButton button4=new JButton("4");
        JButton button5=new JButton("5");
        JButton button6=new JButton("6");
        JButton button7=new JButton("7");
        JButton button8=new JButton("8");
        JButton button9=new JButton("9");
        JButton buttonEquals=new JButton("=");
        JButton buttonIloczyn=new JButton("*");
        JButton buttonDzielenie=new JButton("/");
        JButton buttonDodawanie=new JButton("+");
        JButton buttonOdejmowanie=new JButton("-");
        JButton buttonKoma=new JButton(",");
        JLabel jlabel=new JLabel();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlabel.setText(jlabel.getText()+"1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlabel.setText(jlabel.getText()+"2");
            }
        });
        buttonDodawanie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlabel.setText(jlabel.getText()+"+");
            }
        });
        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // jlabel.setText();
            }
        });
        buttonPanel.setLayout(new GridLayout(4,4));
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonIloczyn);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(buttonOdejmowanie);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(buttonDodawanie);
        buttonPanel.add(button0);
        buttonPanel.add(buttonKoma);
        buttonPanel.add(buttonEquals);
        buttonPanel.add(buttonDzielenie);
        this.add(buttonPanel,BorderLayout.SOUTH);
        this.add(jlabel,BorderLayout.NORTH);

        pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        CalculatorFrame frame=new CalculatorFrame();
    }
}
