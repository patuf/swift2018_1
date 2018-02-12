import java.util.Scanner;

public class Task0a_ReadInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer");
        double value = Double.parseDouble(sc.nextLine());

        while (value%1!=0){
            sc = new Scanner(System.in);
            System.out.println("Enter integer");
            value = Double.parseDouble(sc.nextLine());


        }
        int number = (int) value;
        System.out.println(++number);
    }
}
