package Practise.Przygotowanie_do_kolosa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Para <T,R>{
    private T t;
    private R r;

    public Para(T t, R r) {
        this.t = t;
        this.r = r;
    }
    public void print(){
        System.out.println("t -> " + t + " r -> " + r);
    }
}
class Runnerr implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println("Thread from Runnable " + i);
        }
    }
}

class Runner
        extends Thread {

    private char chr;
    private Thread next;

    public Runner(char chr) {
        this.chr = chr;
    }

    public void setNext(Thread next) {
        this.next = next;
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for(int i=0; i<100; i++) {
            System.out.print(this.chr);
            synchronized (next) {
                next.notify();
            }

            synchronized (this){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
 class Main2 {
    public static void main(String[] args) {
        Runner runnerA = new Runner('A');
        Runner runnerB = new Runner('B');
        Runner runnerC = new Runner('C');

        runnerA.setNext(runnerB);
        runnerB.setNext(runnerC);
        runnerC.setNext(runnerA);

        runnerA.start();
        runnerB.start();
        runnerC.start();

        // Budzenie pierwszego wątku do rozpoczęcia sekwencji
        synchronized (runnerA) {
            runnerA.notify();
        }
    }
}

