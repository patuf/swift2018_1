package swiftacadoop.HomeWork;

import java.util.Scanner;

public class Task1_CalculatorClient {

	public static void main(String[] args) {
		System.out.println("welcome to the calculator ");
		Scanner sc = new Scanner(System.in);
		
	
		while(true) {

			System.out.print("Enter Calculating Word : ");
			String command =sc.next();// calculating command
			
			if (command.equalsIgnoreCase("END")) {
				break;
			}
			System.out.print("enter First Number : ");
			double a = sc.nextDouble();// first variable
			System.out.print("Enter Second Number : ");
			double b = sc.nextDouble();// second variable
		
			String[] keyWord = { "SUM", "SUB", "MUL", "DIV", "PER" };// adding a
																		// list
																		// of
																		// commands

			if (keyWord[0].equalsIgnoreCase(command)) {// when its "sum" it
															// will be active
				System.out.println(String.format("the result is "+"%.3f", swiftacadoop.HomeWork.calculator.Addiction(a, b)));
				// printing the method which declaring under
			}
			if (keyWord[1].equalsIgnoreCase(command)) {// when its "sub" it
															// will be active
				System.out.println(String.format("the result is "+"%.3f", swiftacadoop.HomeWork.calculator.subtract(a, b)));
			}
			if (keyWord[2].equalsIgnoreCase(command)) {// when its "mul" it
															// will be active
				System.out.println(String.format("the result is "+"%.3f", swiftacadoop.HomeWork.calculator.multiply(a, b)));
			}
			if (keyWord[3].equalsIgnoreCase(command)) {// when its "div" it
															// will be active
				System.out.println(String.format("the result is "+"%.3f",swiftacadoop.HomeWork.calculator.divide(a, b)));

			}
			if (keyWord[4].equalsIgnoreCase(command)) {// when its "per" it
															// will be active
				System.out.println(String.format("the result is "+"%.3f", swiftacadoop.HomeWork.calculator.percentage(a, b)));

			}
			
		}

	}

}
