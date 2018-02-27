import java.util.List;
import java.util.ArrayList;

public class School {

    private List<Teacher> teachers;

    private List<Student> students;

    private List<Class> classes;



    public School()

    {

        this.teachers = new ArrayList<>();

        this.students = new ArrayList<>();

        this.classes = new ArrayList<>();

    }

    public static void main(String[] args) {
        Class klas = new Class("First Class");

        Student pesho=new Student("Pesho",1);
        Student geri=new Student ("Geri",2);

        Teacher english=new Teacher("Petya");
        Teacher bulgarian=new Teacher("Nikola");
        

        System.out.println(klas);
    }

}
