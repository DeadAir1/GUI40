package GUI_3.Zadanie4;

public class Kolo extends Figura {
    int promien;
    public Kolo(int x, int y,int promien) {
        super(x, y);
        this.promien=promien;
    }

    @Override
    String getName() {
        return null;
    }

    @Override
    void pozycja(int x, int y) {

    }

    @Override
    public String toString() {
        return "Kolo{" +
                "promien=" + promien +
                ", x=" + x +
                ", y=" + y + ",area = "+ area() +",obwod =" + obwod() +",number ="+ number+
                '}';
    }

    @Override
    public double area() {
        return 3.14 * promien*promien;
    }

    @Override
    public double obwod() {
        return 2 * 3.14 * promien;
    }


}


