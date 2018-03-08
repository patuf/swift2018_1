package swift2018_1.hristo.hwk_10;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Task3_ParenthesesMatching {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Stack<Character> stk = new Stack<Character>();

        System.out.println("Enter something");

        String exp = scan.nextLine();

        for (int i = 0; i < exp.length(); i++) {

                char ch = exp.charAt(i);

                try {

                    if (ch == '(' || ch == '[' || ch == '{')

                        stk.push(ch);

                    else if (ch == ')') {
                        stk.pop();

                    } else if (ch == ']') {
                        stk.pop();

                    } else if (ch == '}') {
                        stk.pop();
                    }
                }catch (EmptyStackException e){
                    System.out.println("False");
                    System.exit(0);
                }
        }

        if (!stk.isEmpty()) {
            System.out.println(stk);
            System.out.println("False");

        }else

            System.out.println("True");

    }
}
