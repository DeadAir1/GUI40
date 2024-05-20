package Practise.Przygotowanie_do_kolosa;

public class Pojazd {

    public void jedz(){
        System.out.println("pojazd");
    }
}
class Samochod extends Pojazd{
    @Override
    public void jedz() {
        System.out.println("motocykl");
    }
}
class Motocykl extends Pojazd{
    @Override
    public void jedz() {
        System.out.println("samochod");
    }
}
class Main{
    public static void main(String[] args) {
        Pojazd p1=new Pojazd();
        Pojazd p2=new Samochod();
        Pojazd p3=new Motocykl();
        p1.jedz();
        p2.jedz();
        p3.jedz();
    }
}
