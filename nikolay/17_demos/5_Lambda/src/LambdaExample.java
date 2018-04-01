import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(new Integer[]{15, 2, -5, -12, 4, 6, 9, -3});

        numbers.stream()
                .filter(new NegativePredicate())
                .sorted(new AscOrderComparator())
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer x) {
                        System.out.println(x);
                    }
                });

        numbers.stream()
                .filter(x -> x < 0)
                .sorted((x, y) -> x - y)
                .forEach(x -> System.out.println(x.toString()));
    }

    private static class NegativePredicate implements Predicate<Integer> {
        @Override
        public boolean test(Integer x) {
            return x < 0;
        }
    }

    private static class AscOrderComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer x, Integer y) {
            return x-y;
        }
    }
}
