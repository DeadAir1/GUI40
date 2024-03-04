package GUI1;

public class ZProstokat extends Prostokat {
    int  prostokat_znakowy_id;
    int kwadrat_znakowy_id;
    static int prostokat_counter=0;
    static int kwadrat_counter=0;
    char znak1;
    char znak2;

    ZProstokat(int width,int height,char znak1,char znak2) {
        super(width, height);
        this.znak1=znak1;
        this.znak2=znak2;
        if(height!=width)
            prostokat_znakowy_id=++prostokat_counter;
        else kwadrat_znakowy_id=++kwadrat_counter;
    }
    ZProstokat(int side,char znak1,char znak2){
        this(side,side,znak1,znak2);
    }
    public void rysuj() throws ProstokatException{
        if(this.height<=0 || this.width<=0)
            throw new ProstokatException();
        if(((this.height==1 && this.width==2) || (this.height==2 && this.width==1))
                && (znak1!=znak2)) throw new ProstokatException();
        if(this.height!=this.width) {
            System.out.printf("Prostokat (%d), rozmiaru  %d x %d, %c=%d,%c=%d \n",
                    prostokat_znakowy_id, width, height, znak1, width * height - (2 * width) - ((2 * height) - 4),
                    znak2, width * height - (width * height - (2 * width) - ((2 * height) - 4))
            );
            for (int i = 0; i <width ; i++) {
                System.out.print(znak1);
            }
            for (int i = 0; i < height-2; i++) {
                System.out.print(znak1);
                for (int j = 0; j <width-2 ; j++) {
                    System.out.print(znak2);
                }
                System.out.println(znak1);
            } for (int i = 0; i <width ; i++) {
                System.out.print(znak1);
            }
            System.out.println();
        }else System.out.printf("Kwadrat (%d), rozmiaru  %d x %d, %c=%d,%c=%d \n",
                kwadrat_znakowy_id,width,height,znak1,width*height-(2*width)-((2*height)-4),znak2,width*height-(width*height-(2*width)-((2*height)-4)));

    }

}