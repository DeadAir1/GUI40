package GUI_5.Zadanie10;

public class Osoba implements Comparable<Osoba> {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Osoba{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Osoba(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Osoba o) {
        if(this.name.compareTo(o.getName())>0) return 1;
        else if(this.name.compareTo(o.getName())<0) return -1;
        else return this.age-o.getAge();
    }
}
