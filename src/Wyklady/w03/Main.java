package Wyklady.w03;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        // ex01

        FuncInter fi = new FuncInter(){
            @Override
            public void method(String str) {
                System.out.println(str);
            }
        };
        fi.method("tutaj");

        fi = (s) -> {
            System.out.println(s);
        };
        fi.method("tu2");

        fi = (s) -> System.out.println(s);

        fi = System.out::println;
        fi.method("tu3");

        // ex 02

        Student s1 = new Student("Jan", 1701);
        Student s2 = new Student("Ola", 678);
        Student s3 = new Student("Xawery", 23765);

        Student[] students = { s1, s2, s3};

        for(Student stud : students)
            System.out.println(stud);

        System.out.println("===================");

        Arrays.sort(students);

        for(Student stud : students)
            System.out.println(stud);

        //ex03===================

        MyArray<Object> obj = new MyArray<>();
        MyArray<Student> studs = new MyArray<>();
        studs.addElement(s1);
        Student sRes = studs.getElement(0);
    }
}