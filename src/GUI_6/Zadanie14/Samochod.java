package GUI_6.Zadanie14;

public class Samochod {
     String marka;
    String cena;

    public Samochod( String marka, String cena) {
        this.marka = marka;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return marka + " " + cena;
    }
}
