package homework.ArraysStringHmwk04;

import java.util.Scanner;

public class Task3b_PrintLetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String letters = "abcdefghijklmnopqrstuvwqxyz";
		int[] countLetters = new int[letters.length()];
		
		//System.out.println(countLetters.length);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter word to count occur letters");
		String input=sc.nextLine().toLowerCase();
		

		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < letters.length(); j++) {
				if (input.charAt(i)==letters.charAt(j)) {
					countLetters[j]++;
					break;
				}
			}
		}
		
		for (int i = 0; i < countLetters.length; i++) {
			if (countLetters[i]!=0) {
				System.out.println(letters.charAt(i)+" "+countLetters[i]);
			}
		}
		

	}

}
