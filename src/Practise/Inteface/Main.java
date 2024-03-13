package Practise.Inteface;

public class Main implements Calculator{

    @Override
    public int dodawanie(int a, int b) {
        return a+b;
    }

    @Override
    public int odejmowanie(int a, int b) {
    return a-b;
    }

    @Override
    public int mnozenie(int a, int b) {
    return a*b;
    }

    @Override
    public int dzielenie(int a, int b) {
    return a/b;
    }
}
