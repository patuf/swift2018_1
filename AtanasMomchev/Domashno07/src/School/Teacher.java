package School;
import java.util.ArrayList;
import java.util.List;
public class Teacher implements Named{
    private final String name;
    List<Discipline> dL = new ArrayList<Discipline>();

    Teacher(String name){
        this.name = name;
    }
    public boolean addDiscipline(Discipline d){
        if(findByName(d.getName()) > -1) return false;
        dL.add(d);
        return true;
    }
    public boolean addHours(String name, int hours){
        if(findByName(name) == -1) return false;
        dL.get(findByName(name)).setHours(hours);
        return true;
    }
    @Override
    public String getName() {
        return name;
    }
    private int findByName(String name){
        for(int i=0;i<dL.size();i++){
            if(dL.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
