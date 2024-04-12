package GUI_6.Zadanie13;

import java.util.Collection;

public class Osoba implements Comparable<Osoba>{

    private String imie;
    private int rokUrodzenia;

    public Osoba(String imie, int rokUrodzenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }

    public static boolean wKolekcji(Collection<Osoba> kol,String imie,int rokUrodzenia){
        for(Osoba a:kol){
            if(a.imie.equals(imie) && a.rokUrodzenia==rokUrodzenia)return true;
        }return false;
    }

    @Override
    public int compareTo(Osoba o) {
        if(this.imie.compareTo(o.imie)>0)
            return 1;
        else if(this.imie.compareTo(o.imie)<0)
            return -1;
        else return 0;
    }
}
