package GUI_12;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class MyModel extends AbstractListModel<String> {
    int size;
    @Override
    public int getSize() {
        return this.size;
    }
  // LocalDate month= LocalDate.from(LocalDate.now().getMonth());
    String arr[];

    public MyModel() {
        this.size=0;
        this.arr=new String[30];
        this.fill();
    }
    private void fill(){
        for (int i = 1; i <30 ; i++) {
           arr[i]=this.getElementAt(i);
        }
    }

    @Override
    public String getElementAt(int index) {
      LocalDate jakisDate=LocalDate.of(2024,6,index);
        Locale lokalizacja=new Locale("PL");

        return index + " - " + jakisDate.getDayOfWeek()
              .getDisplayName(TextStyle.FULL,lokalizacja);
    }

}
