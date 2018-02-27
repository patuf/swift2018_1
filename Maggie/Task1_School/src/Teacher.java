import java.util.ArrayList;
import java.util.List;

public class Teacher implements NameSt {
   private String NameSt;
    private List<Discipline> disciplinesList = new ArrayList<Discipline>();

    public Teacher(String nameSt) {
        this.NameSt=nameSt;
    }

    public String findName(){
        return String.format("My name is %s. ", getNameSt());
    }

    @Override
    public String getNameSt() {
        return null;
    }
}

