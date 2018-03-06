package swift.hwk.taskes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2_CommonSubset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List list = new ArrayList();
		List list2 = new ArrayList();
		System.out.println("enter limits of 2 rows");
		int limiter = sc.nextInt();
		int limiter2 = sc.nextInt();
		boolean itContains = false; //a contact button used below
//fill first raw first list 
		for (int i = 0; i < limiter; i++) {
			int firstRow = sc.nextInt();
			list.add(firstRow);
		}
		//fill second row second list
		for (int i = 0; i < limiter2; i++) {
			int secondRow = sc.nextInt();
			list2.add(secondRow);
		}
		//check common numbers in the 2 of the lists
		for (Object object : list) {
			if (list2.contains(object)) {
				System.out.print(object + " ");
				itContains = true;
			}
		}if (!itContains) {
			System.err.println("No");
		}
	}

}
