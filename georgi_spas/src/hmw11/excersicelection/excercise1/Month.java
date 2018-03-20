package hmw11.excersicelection.excercise1;

import java.util.Scanner;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of month");
        int numMonth=sc.nextInt();
        System.out.println(Month.values()[numMonth-1]);
    }
}
