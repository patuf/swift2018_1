package tasks1to9;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task3_ParenthesesMatching {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Deque<Character> stack = new ArrayDeque<>();

        outerLoop:
        for (Character c : input.toCharArray()) {

            Character popped;

            switch (c) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    continue;
                case ')':
                case ']':
                case '}':
                    popped = stack.pop();
                    if (!popped.equals(c)) {
                        System.out.println(false);
                        return;
                    }
                    break;
                default:
                    break;
            }
        }

        if (stack.isEmpty())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
