package hmw11.excersicelection.excersice2;

import java.util.Scanner;

enum Month {
    JAN(31),
    FEB(28),
    MAR(31),
    APR(30),
    MAY(31),
    JUN(30),
    JUL(31),
    AUG(31),
    SEP(30),
    OCT(31),
    NOV(30),
    DEC(31);

    private int days;
    private Month(int days){
    this.days=days;
    }

    @Override
    public String toString() {
        return name()+" - " +days ;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER MONTH");
        System.out.println(Month.valueOf(Month.class,sc.nextLine().substring(0,3).toUpperCase()));
    }
}