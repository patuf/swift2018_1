package Task1_School;

public class Student {
    private String name;
    public int ID;

    public Student(){
        this("no Name",-1);
    }

    public Student(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    public String getStudentName(){
        return name;
    }

    public int getSutdentID(){
        return ID;
    }

    public void setStudentID(int ID){
        this.ID = ID;
    }
}
