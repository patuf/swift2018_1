import java.util.Scanner;
import java.util.Stack;

public class Task3_ParenthesesMatching {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
//        String input = "[([{}])[](){}([[]]{})]";

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '[':
                case '(':
                case '{':
                    stack.add(input.charAt(i));
                    break;
                case ']':
                    if (stack.peek().equals('[')) {
                        stack.pop();
                    } else {
                        System.out.println("Fail");
                        return;
                    }
                case ')':
                    if (stack.peek().equals('(')) {
                        stack.pop();
                    } else {
                        System.out.println("Fail");
                        return;
                    }
                case '}':
                    if (stack.peek().equals('{')) {
                        stack.pop();
                    } else {
                        System.out.println("Fail");
                        return;
                    }
                default:
                    break;
            }
        }
        System.out.println("True");
    }
}
