package GUI_3.Zadanie6;

import GUI_3.Zadanie5.Kolo;

public class Kolo2 extends Kolo implements Transformacja {
    public Kolo2(int x, int y, int promien) {
        super(x, y, promien);
    }

    @Override
    public void przesunDo(int x, int y) {
        this.pX=this.getX();
        this.pY=this.getY();
        this.setX(x);
        this.setY(y);
    }

    @Override
    public void powrot() {
        this.setX(pX);
        pX=0;
        this.setY(pY);
        pY=0;
    }
}
