package swift2018_1.hristo.hwk_10;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task5_ChildPlay {

    public static void main(String[] args) {

        List<Integer> children = new LinkedList<>();
        int count = 0;
        int firstInput;

        Scanner sc = new Scanner(System.in);

        firstInput = sc.nextInt();

        for (int i = 0; i < firstInput; i++) {
            children.add(sc.nextInt());
        }

        int childrenSize = children.size();

        try {
            for (int i = 0; i < childrenSize; i++) {

                if (children.get(i) < children.get(i + 1)) {
                    children.remove(i);
                    childrenSize--;
                    count++;
                }
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println(count);
            System.exit(0);
        }

        System.out.println(count);
    }
}
