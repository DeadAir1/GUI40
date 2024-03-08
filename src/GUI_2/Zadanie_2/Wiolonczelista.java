package GUI_2.Zadanie_2;

public class Wiolonczelista extends Muzyk{
    Wiolonczelista(String imie, double czas) {
        super(imie, czas);
    }

    @Override
    String instrument() {
        return "Wiolonczela";
    }

    @Override
    double stawka() {
            return 250.0;
    }
}
