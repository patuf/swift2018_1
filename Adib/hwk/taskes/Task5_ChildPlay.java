package swift.hwk.taskes;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Task5_ChildPlay {
	public static void main(String[] args) {
		List<Integer> listOfHights = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of child");
		int numberOfChild = sc.nextInt();
		int count = 0;
		// adding heights
		for (int i = 0; i < numberOfChild; i++) {
			int heightsOfChilds = sc.nextInt();
			listOfHights.add(heightsOfChilds);
		}
		int listSize = listOfHights.size();// to make it easy to use in the loop
		try {// to try resolving the problem
			for (int i = 0; i < listSize; i++) {
				if (listOfHights.get(i) < listOfHights.get(i + 1)) {
					listOfHights.remove(i);
					listSize--;
					count++;
				}
			}
		} catch (Exception e) {// to check if indexoutofboundsExeption
			System.out.println(count);
			return;
		}

		System.out.println(count);

	}

}
