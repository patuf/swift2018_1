public class Discipline implements NameSt {
    public String name;
    public int weekHours;

    public Discipline(String name, int weekHours) {
        this.name = name;
        this.weekHours = weekHours;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getNameSt() {
        return null;
    }
}