package GUI_3.Zadanie3;

public class UFO implements Speakable,Flyable{
    @Override
    public String drive() {
        return "Nuclear Reaktor";
    }

    @Override
    public double distance() {
        return 9865.8732;
    }

    @Override
    public String speak() {
        return "Let's dance everybody don't stop.....";
    }

    @Override
    public String toString() {
        return "UFO{}";
    }
}
