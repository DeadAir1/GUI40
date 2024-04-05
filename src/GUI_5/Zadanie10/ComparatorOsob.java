package GUI_5.Zadanie10;

import java.util.Comparator;

public class ComparatorOsob implements Comparator<Osoba> {
        Cryterium crytetium;

    public ComparatorOsob(Cryterium crytetium) {
        this.crytetium = crytetium;
    }

    @Override
    public int compare(Osoba o1, Osoba o2) {
        return switch (crytetium){
            case NAME -> o1.getName().compareTo(o2.getName());
            case AGE ->  o1.getAge()-o2.getAge();
        };

    }
}
enum Cryterium{
    NAME(1),AGE(2);

    int value;
    Cryterium(int value){
        this.value=value;
    }
}
