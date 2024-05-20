package Practise.Przygotowanie_do_kolosa;

public interface OperacjaMatematyczna {
    int wykonaj(int a,int b);
    static void done(){
        System.out.println("hello");
    }
}
class Dodawanie implements OperacjaMatematyczna{

    @Override
    public int wykonaj(int a,int b) {
        return a+b;
    }
}
class Mnozenie implements OperacjaMatematyczna{

    @Override
    public int wykonaj(int a,int b) {
        return a*b;
    }
}
class Main1{
    public static void main(String[] args) {


    }
}
