import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Task7_StackMax {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new LinkedList<>();
        int max = 0;

        Scanner sc = new Scanner(System.in);
        String input = "";
        String output = "";
        while (!input.equalsIgnoreCase("END")) {
            input = sc.nextLine();
            String[] split = input.split(" ");

            if (split[0].equalsIgnoreCase("PUSH")) {
                stack.add(Integer.parseInt(split[1]));
                list.add(Integer.parseInt(split[1]));
            } else if (split[0].equalsIgnoreCase("POP")) {
                System.out.println(stack.pop());
                list.remove(list.size() - 1);
            } else if (split[0].equalsIgnoreCase("MAX")) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) > max) {
                        max = list.get(i);
                    }
                }
                System.out.println(max);
                max = 0;
            }
        }

        while(!stack.isEmpty()) {
            output += stack.pop() + " ";

        }
        System.out.println(output);
    }
}
