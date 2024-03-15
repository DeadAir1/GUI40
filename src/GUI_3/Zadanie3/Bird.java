package GUI_3.Zadanie3;

public class Bird implements Flyable,Speakable{
    @Override
    public String drive() {
        return "Wings";
    }

    @Override
    public double distance() {
        return 2.5;
    }

    @Override
    public String speak() {
        return "Car,car i wanna car";
    }

    @Override
    public String toString() {
        return "Bird{}";
    }
}
