package generictraining.demoniki.generciclass.bounds;

public abstract class Identifiable implements Comparable<Identifiable> {

    abstract String getId();

    @Override
    public int compareTo(Identifiable o) {
        return getId().compareTo(o.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    @Override
    public boolean equals(Object oth) {
        if (oth == null)
            return false;
        if (this == oth)
            return true;
        if (!(oth instanceof Identifiable))
            return false;

        return getId().equals(((Identifiable) oth).getId());
    }
}
