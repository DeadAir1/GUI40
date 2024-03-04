package GUI1;

public class Prostokat {
    int width;
    int height;

    Prostokat(int width,int height){
        this.width=width;
        this.height=height;
    }
    public void rysuj() throws ProstokatException{
        if(this.height!=this.width)
            System.out.printf("Zwykly prostokat rozmiaru %d x %d \n",this.height,this.width);
        else System.out.printf("Zwykly kwadrat rozmiaru %d x %d \n",this.height,this.width);
        if(this.height<=0 || this.width<=0)
            throw new ProstokatException();
    }

}
