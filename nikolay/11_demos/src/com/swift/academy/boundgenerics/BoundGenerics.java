package generictraining.demoniki.generciclass.bounds;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BoundGenerics {

    public static void main(String[] args) {
        InMemDatabase<Movie> movieDb = new InMemDatabase<>();
        InMemDatabase<Person> personDb = new InMemDatabase<>();

        movieDb.add(new Movie("Predator", 1980));
        movieDb.add(new Movie("Red Sparrow", 2018));
//        movieDb.add(new Person("Pesho", "90213"));
        personDb.add(new Person("Pesho", "901203"));
        personDb.add(new Person("Gosho", "960813"));

        List<Person> personsList = personDb.getAsList();
        List<Movie> moviesList = new LinkedList<>();
        List<Identifiable> idList = new LinkedList<>();
        List<BoundGenerics> bgList = new LinkedList<>();
        movieDb.copyToList(moviesList);
        movieDb.copyToList(idList);
        personDb.copyToList(idList);
//        movieDb.copyToList(personsList);
//        movieDb.copyToList(bgList);

        LenComparator lenComparator = new LenComparator();
        TooNarrowLenComparator tooNarrowLenComparator = new TooNarrowLenComparator();

        Collections.sort(moviesList, lenComparator);
        Collections.sort(moviesList, tooNarrowLenComparator);

        Collections.sort(personsList, lenComparator);
//        Collections.sort(personsList, tooNarrowLenComparator);

        reverseSort(moviesList);
        reverseSort(personsList);
        reverseSort(idList);
//        wrongReverseSort(moviesList);
    }

    private static <T extends Comparable<? super T>> void reverseSort(List<T> list) {
        Collections.reverse(list);
        // OR
//        Comparator<T> revComp = Collections.<T>reverseOrder();
//        Collections.sort(list, revComp);
    }

    private static <T extends Comparable<T>> void wrongReverseSort(List<T> list) {
        Collections.reverse(list);
    }


    private static class LenComparator implements Comparator<Identifiable> {
        @Override
        public int compare(Identifiable o1, Identifiable o2) {
            return new Integer(o1.getId().length()).compareTo(o2.getId().length());
        }
    }

    private static class TooNarrowLenComparator implements Comparator<Movie> {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.compareTo(o2);
        }
    }
}
