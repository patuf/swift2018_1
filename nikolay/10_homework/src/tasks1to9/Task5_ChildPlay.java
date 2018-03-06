package tasks1to9;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Task5_ChildPlay {

    static int simplestSolution(List<Integer> heights) {
        int rounds = -1;
        boolean played;

        do {
            rounds++;
            played = false;
            for (int i = heights.size() - 1; i >= 1; i--) {
                if (heights.get(i) > heights.get(i - 1)) {
                    heights.remove(i);
                    played = true;
                }
            }
        } while (played);

        return rounds;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> heights = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            heights.add(sc.nextInt());
        }

        System.out.println(simplestSolution(heights));

    }
}
