package GUI_2.Zadanie_3;

public abstract class Spiewak implements Comparable<Spiewak>{
    String nazwisko;
    int id;
    static int id_Spiewakow=0;

    public Spiewak(String nazwisko) {
        this.nazwisko = nazwisko;
        this.id=++id_Spiewakow;
    }
    abstract String spiewaj();
 /*   static Spiewak najglosniej(Spiewak[] sp){
        int id;
        int tab[]=new int[sp.length];
        for (int i = 0; i <sp.length ; i++) {
            char arr[]=sp[i].spiewaj().toCharArray();
            for (int j = 0; j <arr.length-1 ; j++) {
                for (int k = j; k <arr.length ; k++) {
                    if(arr[k]>arr[j]){
                        char t=arr[k];
                        arr[k]=arr[j];
                        arr[j]=t;
                    }
                }
            }


        }
    }*/

    @Override
    public String toString() {
        return "(" + this.id + ")" + nazwisko + ":" +
                 spiewaj() ;
    }
    public int compareTo(Spiewak s){
        if(this.spiewaj().length()<s.spiewaj().length()) return -1;
        else if(this.spiewaj().length()>s.spiewaj().length()) return 1;
        else{
            if(this.nazwisko.compareTo(s.nazwisko) > 0) return -1;
            else if(this.nazwisko.compareTo(s.nazwisko) <0) return 1;
            else{
                if(this.id<s.id) return -1;
                else return 1;
            }
        }
    }
}
