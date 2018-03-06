package swiftHWK.tasks;

import java.util.Scanner;

public class Task1_SumNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		 int num1=sc.nextInt();
		 System.out.println("enter second number");
		 int num2=sc.nextInt();
		 try {
			System.out.println(checknumbers(num1, num2));
		} catch (Exception e) {
			
		}
		
	}
	
	static int checknumbers(int number1, int number2)throws Exception{
		if (number1==number2) {
			System.err.println("the numbers cannot be equals");
			
			throw new Exception();
		}else if (number1<0||number2<0) {
			System.err.println("the number Cannot be negetive");
			throw new Exception();
			
		}else {
			return number1+number2;
		}
	}

}
