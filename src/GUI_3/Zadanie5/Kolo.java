package GUI_3.Zadanie5;


public class Kolo extends Figura {
    int promien;
    protected int pX=0,pY=0;
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
        if((x<this.x+promien && x>this.x-promien) && (y>this.y-promien && y<this.y+promien)){
            System.out.println("Punkt (" + x + "," + y + ") znajduje sie  wewnatrz kola!");
        } else System.out.println("Punkt (" + x + "," + y + ") znajduje sie na zewnatrz kola!");
    }

    @Override
    public String toString() {
        return "Kolo" +'\n'+
                    "Srodek-" + "(" + x + "," + y + ")" + '\n' +
                "Promien: "+ promien
                ;
    }




    @Override
    public double pole() {
        return 0;
    }

    @Override
    public double obwod() {
        return 2 * 3.14 * promien;
    }


    @Override
    public void rysuj() {
        int count=promien*2;
        for (int i = 0; i < (promien*2) + 1  ; i++) {
            for (int j = count; j >=0 ; j--) {
                System.out.print(" ");
            }
            count--;
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        count=0;
        for (int i = (promien * 2)-1; i >=0 ; i--) {
            for (int j = 0; j <=count+1 ; j++) {
                System.out.print(" ");
            }
            count++;
            for (int j =0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}


