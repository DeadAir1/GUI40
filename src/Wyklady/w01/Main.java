import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public
    class Main {

    public static void main(String[] args) {
//        Outer outer = new Outer();
//        Outer.Inner inner = outer.get();

        A a = new A();
        a.showHello();

        a = new A(){
            public void showHello(){
                super.showHello();
                System.out.println("my hello");
            }
        };

        a.showHello();

        new Object(){
            public int getValue(){
                return 5;
            }
        }.getValue();

        var obj = new Object(){
            public int getValue(){
                return 5;
            }
        };
        obj.getValue();

        //==========================

        Figure fig;
        fig = new Square(5);
        System.out.println(
            fig.getArea()
        );

        fig = new Figure(){
            @Override
            public double getArea() {
                return 0;
            }
        };

        System.out.println(
            fig.getArea()
        );

        MyAbstractClass mac = new MyAbstractClass(){

        };


        MyAbstract ma = new MyAbstract() {
            @Override
            public String getArea() {
                return ""+5;
            }
        };
        ma.method();


        Frame f = new Frame();
        f.setSize(640, 480);
        f.setVisible(true);

        WindowAdapter windowAdapter = new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };

        f.addWindowListener(
            windowAdapter
        );


    }

}