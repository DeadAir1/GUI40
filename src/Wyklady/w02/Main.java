package Wyklady.w02;
import ex05.FIA;
import ex05.FIB;
import ex05.FIC;
import ex05.FuncInterface;
import Wyklady.w02.ex01.*;

public
    class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Mouse mouse = new Mouse();

        computer.connect(mouse);

// ======================================

        FuncInterface funcInterface = () -> {
            System.out.println("tu");
        };

        funcInterface.method();

        FIA fia = (c, d) -> {
            System.out.println(c + d);
        };
        fia.method( 5, 6);

        FIB fib = (e, f) -> {
            return e < f;
        };

        System.out.println(
            fib.method(4, 5)
        );

    }

}