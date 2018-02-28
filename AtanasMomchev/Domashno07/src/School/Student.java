package School;

import javax.naming.NameNotFoundException;

public class Student implements Named{
    private final String name;
    private String id;
    Student(String name, String id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }
}
