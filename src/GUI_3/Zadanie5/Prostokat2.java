package GUI_3.Zadanie5;

import GUI_3.Zadanie6.Rysowanie;

public class Prostokat2 extends Prostokat implements Rysowanie {
    char symbol;

    public Prostokat2(int x, int y, int szerokosc, int wysokosc,char symbol) {
        super(x, y, szerokosc, wysokosc);
        this.symbol=symbol;
    }

    @Override
    public void rysuj() {
        for (int i = 0; i <this.high ; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(this.symbol+ "");
            }
            System.out.println();

        }
    }

    @Override
    public double pole() {
        return 0;
    }
}
