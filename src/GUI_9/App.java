package GUI_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.Flow;

public class App {
    public static void main(String[] args) {
        new App();
    }
    public App() {
        SwingUtilities.invokeLater(this::create);
    }
    private  void create() {
        JFrame f=new JFrame();
        f.getContentPane().setLayout(new BorderLayout());
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(new Dimension(400, 600));
    JTextArea area = new JTextArea();
    String str=JOptionPane.showInputDialog("Podaj Czcionke:");
    area.setFont(Font.decode(str));
    area.setForeground(JColorChooser.showDialog(null,"Color",Color.RED));
    f.getContentPane().add(area, BorderLayout.PAGE_START);
    JButton button=new JButton("Remove all and add Buttons");
    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Layouts(f);
        }
    });
    f.getContentPane().add(button,BorderLayout.PAGE_END);
    f.setVisible(true);
    }
    private void Layouts(JFrame f){
        f.getContentPane().removeAll();
        f.repaint();
        f.setLayout(new BorderLayout());
        for (int i = 0; i <5 ; i++) {
        f.getContentPane().add(new JButton(String.valueOf(i)));
        }
        f.repaint();

    }
}
