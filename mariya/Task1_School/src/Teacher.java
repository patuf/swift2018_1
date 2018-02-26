import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    private List<Discipline> disciplinesList = new ArrayList<Discipline>();

    public Teacher(String name) {
        super(name);
    }
}
