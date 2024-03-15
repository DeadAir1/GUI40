package GUI_3.Zadanie3;

public class Virus implements Flyable{
    @Override
    public String drive() {
        return "Wind";
    }

    @Override
    public double distance() {
        return 45.6;
    }

    @Override
    public String toString() {
        return "Virus{}";
    }
}
