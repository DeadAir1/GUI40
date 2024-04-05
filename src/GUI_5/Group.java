package GUI_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Group   {
    private int maxStudentCount=10;
    private String title;
    ArrayList<Student> students=new ArrayList<>();

    public Group(String title,int maxStudentCount) {
        this.maxStudentCount = maxStudentCount;
        this.title = title;
    }
    public void assign(Student student){}

    public ArrayList<Student> getStudents(){
        return this.students;
    }
    public void remove(Student s) throws Exception{
        students.remove(s);

    }
}
