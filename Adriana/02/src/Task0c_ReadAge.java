import java.util.Scanner;

public class Task0c_ReadAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        double value = Double.parseDouble(sc.nextLine());

        while (value%1!=0){
            sc = new Scanner(System.in);
            System.out.println("Enter integer");
            value = Double.parseDouble(sc.nextLine());


        }
        int age = (int) value;
        if (age<18) {
            System.out.println("Underage");
        }
        else {
            System.out.println("Adult");
        }
    }
}
