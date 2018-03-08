package swift.hwk.taskes;


import java.util.LinkedList;
import java.util.Scanner;

public class Task4_CountryTour {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number from where you want to start");
		int num=sc.nextInt();
		int counterOfFood=0;// to count the distance of the food carrying
		int counterOfCities=0;// to count the distance of the cities
		
		LinkedList<Integer>listOfCities=new LinkedList<Integer>();
		LinkedList<Integer>listOfFood=new LinkedList<Integer>();
	
		// to fill the linked lists and count the distance
		for (int i = 0; i < num; i++) {
			int numberOfCities=sc.nextInt();
			counterOfCities+=numberOfCities;
			int numberOfFood=sc.nextInt();
			counterOfFood+=numberOfFood;
			listOfCities.add(numberOfCities);
			listOfFood.add(numberOfFood);
		}
		//check if the distance is ok to carry on 
		if (counterOfCities==counterOfFood) {
			System.out.println(num);
			
		}else if (counterOfFood>counterOfCities) {
			System.out.println(num);
			
		}else {
			System.out.println("NO");
		}
		
	}
	/**
	 * i could have used for each loop to check directly from the list but
	 * i think this code above is simpler than foreach loop ;)
	 * we have to USE METHOD K.I.S.S
	 * KEAP IT STUPID AND SIMPLE :D 
	 */

}
