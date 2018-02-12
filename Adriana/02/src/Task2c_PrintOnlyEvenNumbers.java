import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chisla[] = new int[n];
        System.out.println("enter numbers");
        for (int i = 0; i < n; i++) {
            chisla[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            if (chisla[i]%2 == 0){
                System.out.print(chisla[i] + " ");
            } else {
                continue;
            }
        }
    }

}
