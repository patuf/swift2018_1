import java.util.Scanner;

public class Task0b_ReadArray {
    public static void main (String[] args){
        Scanner scan =new Scanner(System.in);

        int n = scan.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1){
                System.out.print(arr[i] + ",");
            }
            else {
                System.out.print(arr[i]);
            }
        }
    }
}
