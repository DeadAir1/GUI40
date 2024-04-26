package GUI_8;

import java.util.ArrayList;

public class Letters implements Runnable {
  private String letters;

  static Thread  threads[];
    public Letters(String letters) {
    this.letters=letters;
    }

    @Override
    public void run() {
      while(true) {
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }

    }

    public  Thread[] getThreads(){
      threads=new Thread[letters.length()];
      for (int i = 0; i < letters.length(); i++) {
        threads[i]=new Thread(String.valueOf(letters.charAt(i)));
      }
      return threads;
    }


}
