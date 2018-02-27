package Task1_School;

public class Teacher extends Discipline {
    Discipline Disciplines;
    String name;

    public Teacher(String name, Discipline discipline){
        this.name = name;
        this.Disciplines = discipline;
    }

    public String getTeacherName(){
        return name;
    }

    public String getTeacherDisciplines(){
        return super.getDiscName();
    }
}
