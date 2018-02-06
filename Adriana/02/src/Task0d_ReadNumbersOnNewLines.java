import java.util.Arrays;
import java.util.Scanner;

public class Task0d_ReadNumbersOnNewLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int i = sc.nextInt();
        int array [] = new  int [i];
        for (i=0; i<array.length; i++){
            Scanner sc1 = new Scanner(System.in);
            array[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(array));
    }
}
