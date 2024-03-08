package GUI_2.Zadanie_2;

public class Flecista extends Muzyk{
    Flecista(String imie, double czas) {
        super(imie, czas);
    }

    @Override
    String instrument() {
        return "flet";
    }

    @Override
    double stawka() {
        return 300.0;
    }
}
