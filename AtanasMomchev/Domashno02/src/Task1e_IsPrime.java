import java.util.Scanner;

public class Task1e_IsPrime {
    public static void main(String [] args){
        boolean IsPrime = false; // boolean to return
        int sum = 0; //used as a counter
        Scanner input = new Scanner(System.in);
        System.out.print("Input number to check if its prime: ");
        int number = input.nextInt();
        // a loop to check to how many numbers is number dividable
        for(int i=2;i<=number;i++){
            if(number%i != 0)continue;
            sum++;
        }
        //change the state of IsPrime if it is divided only by 1 and its self
        if (sum == 1) IsPrime = true;
        System.out.print(IsPrime);
    }
}
