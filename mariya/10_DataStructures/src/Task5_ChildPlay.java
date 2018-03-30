import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5_ChildPlay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfElements = sc.nextInt();
        int input;
        List<Integer> list = new ArrayList<>();
        List<Integer> positionsList = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < numberOfElements; i++) {
            input = sc.nextInt();
            list.add(input);
        }

        while (true) {
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(j) > list.get(i)) {
                        positionsList.add(list.get(j));
                        break;
                    } else {
                        break;
                    }
                }
            }
            if (positionsList.isEmpty()) {
                System.out.println(counter);
                return;
            }

            for (int k = 0; k < list.size(); k++) {
                for (int j = 0; j < positionsList.size(); j++) {
                    if (list.get(k) == positionsList.get(j)) {
                        list.remove(k);
                    }
                }
            }

            counter++;
            positionsList.clear();
        }
    }
}
