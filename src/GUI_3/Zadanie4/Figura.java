package GUI_3.Zadanie4;

abstract class Figura {
    int x,y;

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }
    abstract String getName();
    abstract void pozycja(int x,int y);

    @Override
    public String toString() {
        return "Figura{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
