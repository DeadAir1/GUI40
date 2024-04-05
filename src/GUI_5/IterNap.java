package GUI_5;

import java.util.Iterator;

public class IterNap implements Iterable<Character> {
    private String znaki;
    int poczatek;
    int krok=1;

    public IterNap(String znaki) {
        this.znaki = znaki;
    }
    public void  ustawPoczatek(int poczatek){
        this.poczatek=poczatek;
    }
    public void ustawKrok(int krok){
        this.krok=krok;
    }


    @Override
    public Iterator<Character> iterator() {
        return new Iterator<Character>() {
            int index=poczatek;
            @Override
            public boolean hasNext() {
                return index+krok<znaki.length();
            }

            @Override
            public Character next() {
                index+=krok;
                return znaki.charAt(index);
            }
        };
    }
}
