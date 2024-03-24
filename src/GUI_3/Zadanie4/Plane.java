package GUI_3.Zadanie4;

public class Plane implements Flyable,Speakable{
    @Override
    public String drive() {
        return "Oil Engine";
    }

    @Override
    public double distance() {
        return 987.12;
    }

    @Override
    public String speak() {
        return "I believe I can fly";
    }

    @Override
    public String toString() {
        return "Plane{}";
    }
}
