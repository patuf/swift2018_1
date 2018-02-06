package homework.ArraysStringHmwk04;

import java.util.Scanner;
import java.util.Stack;
// !!! Copyrah go ot neta i promenih dve dumi v proverkata ot YES : NO =TRUE I FLASE
// nos i nqmam na ideq kak da go napravq i ne go razzbiram


/**
 * 1) Declare a Stack of type String/character. 2) Now traverse the expression
 * string expression. a) If the current character is a opening bracket (�(� or
 * �{� or �[�) then push it to stack. b) If the current character is a closing
 * bracket (�)� or �}� or �]�) then pop from stack and if the popped character
 * is the matching opening bracket then fine else parenthesis are not balanced.
 * 3) After complete traversal, if there is some starting bracket left in stack
 * then "not balanced".
 */
public class Task3d_BracketMatching {

	private static boolean checkBalancedParentheses(String input) {
		Stack<String> stack = new Stack<String>();
		boolean isBalanaced = false;

		for (int i = 0; i < input.length(); i++) {
			String str = "" + input.charAt(i); // store characters as String

			// if opening bracket then push into stack
			if (str.equals("(") || str.equals("[") || str.equals("{")) {
				stack.push(str);
			}

			// if closing bracket, pop bracket and compare if its a pair
			if (str.equals(")") || str.equals("]") || str.equals("}")) {
				// if stack becomes empty in between then also its not balanced
				if (stack.isEmpty()) {
					return false;
				}
				String opening = stack.peek();
				if (str.equals(")") && opening.equals("(")) {
					stack.pop();
				}
				if (str.equals("]") && opening.equals("[")) {
					stack.pop();
				}
				if (str.equals("}") && opening.equals("{")) {
					stack.pop();
				}
			}
		}
		// if stack is empty at end, then its balanced
		if (input.length() > 0 && stack.isEmpty()) {
			isBalanaced = true;
		}

		return isBalanaced;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter brakcet");
		String read=sc.nextLine();
		String[] inputs = { read };

		for (String input : inputs) {
			boolean flag = checkBalancedParentheses(input);
			if (flag) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
	}
}
