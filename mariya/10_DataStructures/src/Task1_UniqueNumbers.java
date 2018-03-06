import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1_UniqueNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        int numberOfNumbers = sc.nextInt();
        for (int i = 0; i < numberOfNumbers; i++) {
            set.add(sc.nextInt());
        }
        System.out.println(set);
    }
}
