package Wyklady.w03;

import java.util.Comparator;

public
    class Student
    implements Comparable<Student>{

    private String name;
    private int indexNumber;

    public Student(String name, int indexNumber) {
        this.name = name;
        this.indexNumber = indexNumber;
    }

    @Override
    public String toString() {
        return name+" "+indexNumber;
    }

    @Override
    public int compareTo(Student student) {
        if( this.indexNumber < student.indexNumber)
            return -1;
        if( this.indexNumber == student.indexNumber)
            return 0;
        if( this.indexNumber > student.indexNumber)
            return 1;
        return 0;
    }


}
