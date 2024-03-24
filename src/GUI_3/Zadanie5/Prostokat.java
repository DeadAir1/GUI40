package GUI_3.Zadanie5;

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
            if((x>this.x && x<this.x+width) && (y<this.y && y> this.y-high)){
                System.out.println("Punkt (" + x + "," + y + ") znajduje sie wewnatrz prostokata!");
            }
            else System.out.println("Punkt (" + x + "," + y + ") znajduje sie na zewnatrz prostokata!");
    }

    @Override
    public String toString() {
        return "Prostokat" + '\n' +
                "Lewy gorny-" + "(" + x + "," + y + ")" + '\n'+
                "Szerokosc:"+ width + ", Wysokosc:" + high

               ;
    }



    @Override
    public double pole() {
        return 0;
    }

    @Override
    public double obwod() {
        return 2*high+ 2*width;
    }

    @Override
    public void rysuj() {
        for (int i = 0; i < high; i++) {
            for (int j = 0; j <width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
