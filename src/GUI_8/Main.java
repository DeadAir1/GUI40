package GUI_8;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Letters letters = new Letters("ABCD");
        for (Thread t : letters.getThreads()) {
            System.out.println(t.getName());
        t.start();
        }

       // Thread.sleep(5000);

        /*<- tu trzeba zapisać
           fragment, który kończy działanie kodów, wypisujących litery
        */
        System.out.println("\nProgram skończył działanie");
    }

}