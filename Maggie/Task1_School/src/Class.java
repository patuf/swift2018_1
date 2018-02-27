import java.util.ArrayList;
import java.util.List;

public class Class implements NameSt {
    public String name;
    private List<Student> studentsList = new ArrayList<Student>();
    private List<Teacher> teachersList = new ArrayList<Teacher>();

    public Class(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getNameSt() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student){
        studentsList.add(student);
    }
    public void addTeacher(Teacher teacher){
        teachersList.add(teacher);
    }
}