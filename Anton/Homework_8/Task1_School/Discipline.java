package Task1_School;

public class Discipline {
    private String disciplinename;
    private int hoursperweek;

    public Discipline(){
        this("no name", -1);
    }

    public Discipline(String name, int hours){
        this.disciplinename = name;
        this.hoursperweek = hours;
    }

    public String getDiscName(){
        return disciplinename;
    }

    public int getHoursperweek(){
        return hoursperweek;
    }

    public void setDisciplinename(String name){
        this.disciplinename = name;
    }

    public void setHoursperweek(int hours){
        this.hoursperweek = hours;
    }
}