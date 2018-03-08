package swiftHWK.tasks;

import java.util.Scanner;

public class Task0_NumberNotANumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num;
		loop:
			while(true){
				System.out.println("Enter number : ");
				num=sc.next();
				if (num.equalsIgnoreCase("END")) {
					break loop;
				}
				try {
					int number=Integer.parseInt(num);
				} catch ( NumberFormatException n) {
					System.err.println("Not a Number");
					continue;
				}
				System.out.println("number");
			}

	}
}
