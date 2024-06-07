package GUI_12;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyModel myModel;
    JScrollPane scrollPane;
    JList<String> list;
    public MyFrame()  {
        this.myModel=new MyModel();
        this.scrollPane=new JScrollPane();
        this.list=new JList<>( myModel.arr);
        this.scrollPane.add(list);
        this.add(list);

        this.add(scrollPane,BorderLayout.CENTER);
        this.setSize(new Dimension(300,450));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(MyFrame::new);
    }
}
