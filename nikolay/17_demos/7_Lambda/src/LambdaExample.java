
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LambdaExample {

    public static void main(String[] args) {
        int count = 5_000_000;
        List<Integer> numbers = initRandomList(count);

        long start = System.currentTimeMillis();
        long primeCount = numbers.parallelStream().filter(x -> isPrime(x)).count();
        System.out.printf("Parallel stream took %d milliseconds and found %d prime numbers.%n", System.currentTimeMillis() - start, primeCount);

        start = System.currentTimeMillis();
        primeCount = numbers.stream().filter(x -> isPrime(x)).count();
        System.out.printf("Serial stream took %d milliseconds and found %d prime numbers.%n", System.currentTimeMillis() - start, primeCount);
    }

    public static boolean isPrime(int x) {

        double limit = Math.sqrt(x);

        if (x <= 1) {
            return false;
        }

        for (int i = 3; i <= limit; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static List<Integer> initRandomList(int count) {
        List<Integer> numbers = new ArrayList<>(count);
        Random rand = new Random();
        for (int i = 0; i < count; i++) {

            int number = rand.nextInt(Integer.MAX_VALUE);
            if (number < 2) {
                i--;
                continue;
            }

            numbers.add(number);
        }
        return numbers;
    }
}
