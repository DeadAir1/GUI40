package Practise.TypyGeneryczne;

public class Pair<V extends Comparable<V>>  {

    private V first;
    private V second;

    public Pair(V first, V second) {
        this.first=first;
        this.second=second;
    }

    public V compateTwo(){
        if(first.compareTo(second)>=0) return first;
        else return second;
    }
}
