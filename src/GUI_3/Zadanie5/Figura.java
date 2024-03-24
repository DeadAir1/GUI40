package GUI_3.Zadanie5;

import GUI_3.Zadanie6.Obliczenie;
import GUI_3.Zadanie6.Rysowanie;

abstract class Figura implements Obliczenie,Comparable<Figura>, Rysowanie {
    int x,y;
    int number;
    static int sNumber=0;

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
        this.number=sNumber++;
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


    public int compareTo(Figura f){
        if(this.pole()<f.pole()) return -1;
        else if(this.pole()>f.pole()) return 1;
        else {
         if (this.obwod() < f.obwod()) return -1;
            else if (this.obwod() > f.obwod()) return 1;
       else {
             if (this.number < f.number) return -1;
             else return 1;
         }
        }
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
