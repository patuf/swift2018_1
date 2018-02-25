import java.util.ArrayList;
import java.util.List;

public class Class implements Named {
    public String name;
    private List<Student> studentsList = new ArrayList<Student>();
    private List<Teacher> teachersList = new ArrayList<Teacher>();

    public Class(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
