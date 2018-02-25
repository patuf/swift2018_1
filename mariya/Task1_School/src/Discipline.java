public class Discipline implements Named {
    public String name;
    public int hoursPerWeek;

    public Discipline(String name, int hoursPerWeek) {
        this.name = name;
        this.hoursPerWeek = hoursPerWeek;
    }

    public String getName() {
        return name;
    }
}
