package generictraining.demoniki.generciclass.bounds;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class InMemDatabase<E extends Identifiable> {
    Set<E> elements = new TreeSet<>();

    public void add(E el) {
        elements.add(el);
    }

    public void remove(E el) {
        elements.remove(el);
    }

    /**
     * Allows copying into List<Object> or List<Identifiable>
     * @param dest
     */
    public void copyToList(List<? super E> dest) {
         for (E el : elements) {
            dest.add(el);
        }
    }

    public List<E> getAsList() {
        List<E> dest = new ArrayList<>();
        for (E el : elements) {
            dest.add(el);
        }
        return dest;
    }
}
