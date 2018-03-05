import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Task2_CommonSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int inputN;
        int inputM;

        for (int i = 0; i < n; i++) {
            inputN = sc.nextInt();
            list1.add(inputN);
        }
        for (int i = 0; i < m; i++) {
            inputM = sc.nextInt();
            list2.add(inputM);
        }

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (Objects.equals(list2.get(j), list1.get(i))) {
                    set.add(list2.get(j));
                }
            }
        }
        if (!(set.isEmpty())) {
            System.out.println(set);
        } else {
            System.out.println("NO");
        }
    }
}
