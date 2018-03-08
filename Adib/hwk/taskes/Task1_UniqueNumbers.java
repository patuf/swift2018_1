package swift.hwk.taskes;

import java.util.HashSet;

import java.util.Scanner;

public class Task1_UniqueNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter list limit");
		int limiter=sc.nextInt();
		HashSet<Integer> list = new HashSet();
		System.out.println("enter numbers in the list");
		for (int i = 0; i < limiter; i++) {

			int num = sc.nextInt();
			list.add(num);
		}

		for (Object object : list) {

			System.out.print(object);

		}
	}

}
