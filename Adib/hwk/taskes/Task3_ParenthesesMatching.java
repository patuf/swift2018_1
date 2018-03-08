package swift.hwk.taskes;

import java.util.Scanner;
import java.util.Stack;

public class Task3_ParenthesesMatching {
	static final char LPAREN = '(';
	static final char RPAREN = ')';
	static final char LBRACE = '{';
	static final char RBRACE = '}';
	static final char LBRACKET = '[';
	static final char RBRACKET = ']';
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please Enter phrase with Parentheses[{()}]");
		String s=sc.nextLine();
		System.out.println(isClosed(s));
	}
	//Return true or false if expression has Parenthesis
	public static boolean isClosed(String s) {

		/**
		 * i took the idea from JAVA Parentheses 
		 * TO SAVE THE CONTRUCT AS YOU TOLD US ;)
		 * checking to see if parentheses ,braces, brackets are Closed. so if
		 * [()]{}{[()()]()} is true 
		 * else[{(]){ 
		 * is false
		 */
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			//Function to push an item to stack
			if (s.charAt(i) == LPAREN) {
				stack.push(LPAREN);

			} else if (s.charAt(i) == LBRACE) {
				stack.push(LBRACE);

			} else if (s.charAt(i) == LBRACKET) {
				stack.push(LBRACKET);
			} else if (s.charAt(i) == RPAREN) {
				if (stack.isEmpty()) {
					return false;
				}
				//Pop the element from stack, if it is not a pair 
	           // parenthesis of char then there is a mismatch.
	            //This happens for expressions like {(})
				if (stack.pop() != LPAREN) {
					return false;
				}

			} else if (s.charAt(i) == RBRACE) {
				if (stack.isEmpty()) {
					return false;
				}
				if (stack.pop() != LBRACE) {
					return false;
				}
			} else if (s.charAt(i) == RBRACKET) {
				if (stack.isEmpty()) {
					return false;
				}
				if (stack.pop() != LBRACKET) {
					return false;
				}
			}
			// ignoring all of this if-else -construction :(
		}
		return stack.isEmpty();
	}

}
