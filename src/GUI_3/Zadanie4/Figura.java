package GUI_3.Zadanie4;

abstract class Figura implements Obliczenie,Comparable<Figura>  {
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
        if(this.area()<f.area()) return -1;
        else if(this.area()>f.area()) return 1;
        else {
         if (this.obwod() < f.obwod()) return -1;
            else if (this.obwod() > f.obwod()) return 1;
       else {
             if (this.number < f.number) return -1;
             else return 1;
         }
        }
    }

}
