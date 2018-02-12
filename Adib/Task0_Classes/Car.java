package Task0_Classes;

import java.util.Scanner;

public class Car {
	String model;
	String mark;
	int power;
	int predusingYear;
	int currentYear = 2017;

	public Car(String mark, String model, int predusingYear, int power) {
		// TODO Auto-generated constructor stub
		this.model = model;

		this.mark = mark;

		this.power = power;

		this.predusingYear = predusingYear;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter Car Mark ,Car model,Car Horse Power ,Car manifacutre Year :");
		Car newCar = new Car(sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
		System.out.println(newCar.mark + " " + newCar.model + " year:" + newCar.predusingYear + " Hp" + newCar.power);
		int carOld = newCar.currentYear - newCar.predusingYear;
		double tax;
		if (carOld >= 1 && carOld <= 8) {
			
			if (newCar.power <= 80) {
				tax=insuranceCategory(150, 0.20);
				System.out.println("The DutyTax is :" + tax);

			} else if (newCar.power >= 140) {
				tax = (insuranceCategory(150, 0.45));
				System.out.println("The DutyTax is :" + tax);
			} else {
				tax = insuranceCategory(150, 0);;
				System.out.println("The DutyTax is :" + tax);
			}
		}
		if (carOld > 8 && carOld < 15) {
			if (newCar.power <= 80) {
				tax = insuranceCategory(200, 0.20);
				System.out.println("The DutyTax is :" + tax);

			} else if (newCar.power >= 140) {
				tax = insuranceCategory(200, 0.45);

				System.out.println("The DutyTax is :" + tax);
			} else {
				tax = insuranceCategory(200, 0);
				System.out.println("The DutyTax is :" + tax);
			}
		}

		if (carOld > 15 && carOld <= 25) {
			if (newCar.power <= 80) {
				tax = insuranceCategory(300, 0.20);

				System.out.println("The DutyTax is :" + tax);

			} else if (newCar.power >= 140) {
				tax = insuranceCategory(300, 0.45);

				System.out.println("The DutyTax is :" + tax);
			} else {
				tax = insuranceCategory(300, 0);
				System.out.println("The DutyTax is :" + tax);

			}
		}
		if (carOld > 25) {
			if (newCar.power <= 80) {
				tax=insuranceCategory(500, 0.20);
				System.out.println("The DutyTax is :" + tax);
			} else if (newCar.power >= 140) {
				tax=insuranceCategory(500, 0.45);
				System.out.println("The DutyTax is :" + tax);
			} else {
				tax=insuranceCategory(500, 0);
				System.out.println("The DutyTax is :" + tax);
			}
			
		}
		
	}

	public static double insuranceCategory(double a,double b) {
		double tax=(a*b)+a;
		return tax;
	}
}