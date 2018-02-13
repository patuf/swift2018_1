package swiftacadoop.HomeWork;

import java.util.Scanner;

public class Task1_CalculatorClient {


	public static void main(String[] args) {

		System.out.println("welcome tho the calculator ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Calculating Word : ");
		String calculating = sc.next();//calculating command
		System.out.print("enter First Number : ");
		double a = sc.nextDouble();// first variable
		System.out.print("Enter Second Number : ");
		double b = sc.nextDouble();//second variable
		
		String[] keyWord = { "SUM", "SUB", "MUL", "DIV", "PER" };//adding a list of  commands

		if (keyWord[0].equalsIgnoreCase(calculating)) {//when its "sum" it will be active
			System.out.println(String.format("%.3f", Addiction(a, b)));
			//printing the method which declaring under
		}
		if (keyWord[1].equalsIgnoreCase(calculating)) {//when its "sub" it will be active
			System.out.println(String.format("%.3f",subtract(a, b)));
		}
		if (keyWord[2].equalsIgnoreCase(calculating)) {//when its "mul" it will be active
			System.out.println(String.format("%.3f",multiply(a, b)));
		}
		if (keyWord[3].equalsIgnoreCase(calculating)) {//when its "div" it will be active
			System.out.println(String.format("%.3f",divide(a, b)));

		}
		if (keyWord[4].equalsIgnoreCase(calculating)) {//when its "per" it will be active
			System.out.println(String.format("%.3f",percentage(a, b)));

		}
		

	}

	public static double Addiction(double a, double b) {// method addiction
		double sum = a + b;
		return sum;
	}

	public static double subtract(double a, double b) {// method subtraction
		double sum = a - b;
		return sum;
	}

	public static double multiply(double a, double b) {//method multiply
		double sum = a * b;
		return sum;
	}

	public static double divide(double a, double b) {//method divided by
		double sum = a / b;
		return sum;
	}

	public static double percentage(double a, double b) {//method percentage of
		double sum = (a * b) / 100;
		return sum;
	}

}
