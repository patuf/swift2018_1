package School;

import java.util.ArrayList;
import java.util.List;

public class Classes implements Named{
    private final String name;
    List<Student> students = new ArrayList<Student>();
    List<Teacher> teachers = new ArrayList<Teacher>();

    Classes(String className){
        name = className;
    }
    public boolean addStudent(String name,String id){
        Student s = new Student(name,id);
        if(findByName(students,students.size(),name) >-1) return false;
        students.add(s);
        return true;
    }
    public String getName() {
        return name;
    }
    private int findByName( List<? extends Named> arr,int size,String name){
        for(int i=0;i<size;i++){
            if(arr.get(i).getName().equals(name)) return i;
        }
        return -1;
    }
}