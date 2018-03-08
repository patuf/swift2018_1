import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Character> brackets = new Stack<>();
        String str;
        boolean bracket = true;
        System.out.println("Input String with braces: ");
        str = input.nextLine();
        for(Character c : str.toCharArray()){
            if(c == '[') {
                brackets.add(c);
                brackets.add(']');
            }
            else if(c == '{') {
                brackets.add(c);
                brackets.add('}');
            }
            else if(c == '(') {
                brackets.add(c);
                brackets.add(')');
                }
            else if(c == '}' || c == ']' || c == ')'){
                if(!brackets.peek().equals(c)) {
                    bracket = false;
                    break;
                }
                else {
                    brackets.pop();
                    brackets.pop();
                }
            }
        }
        System.out.println(bracket);
    }
}
