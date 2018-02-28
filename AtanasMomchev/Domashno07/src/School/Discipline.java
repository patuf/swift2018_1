package School;

public class Discipline implements Named{
    private final String name;
    private int hours;

    Discipline(String name, int hours){
        this.name = name;
        this.hours = hours;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }
}
