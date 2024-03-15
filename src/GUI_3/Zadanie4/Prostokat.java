package GUI_3.Zadanie4;

public class Prostokat extends Figura {
    int high,width;

    public Prostokat(int x, int y, int high, int width) {
        super(x, y);
        this.high = high;
        this.width = width;
    }

    @Override
    String getName() {
        return null;
    }

    @Override
    void pozycja(int x, int y) {

    }
//
    @Override
    public String toString() {
        return "Prostokat{" +
                "high=" + high +
                ", width=" + width +
                ", x=" + x +
                ", y=" + y + ",area = "+ area() + ",obwod =" + obwod() +",number ="+ number+
                '}';
    }

    @Override
    public double area() {
        return high*width;
    }

    @Override
    public double obwod() {
        return 2*high+ 2*width;
    }
}
