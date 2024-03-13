package Wyklady.w02.ex03;

public
    class C
    implements A, B{

    public void xxx(){
//        A.xxx();
        A.super.xxx();
    }


    public static void main(String[] args) {
        new C();
    }
}
