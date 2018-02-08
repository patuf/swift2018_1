import java.util.Scanner;

public class Task1b_PrintMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number N to create an array with NxN matrix: ");
        int number = input.nextInt();
        //creating row and column and assigning the input
        int rowAndCol = number;
        //creating and initialising 2 dimensional array
        int [][]  arr = new int[rowAndCol][rowAndCol];
        //creating a loop and a nesting loop
        for(int i=0; i<rowAndCol;i++){
            for(int j=0; j<rowAndCol;j++){
                //inputting numbers in the array
                arr[i][j] = (i*rowAndCol)+j+1;
            }
        }
        for(int i=0; i<rowAndCol;i++){
            if(i%2 == 0) {continue;
            }else{
                for(int k=0;k<arr.length/2;k++){
                    int temp = arr[i][k];
                    arr[i][k] = arr[i][arr.length-1-k];
                    arr[i][arr.length-1-k] = temp;
                }
            }
        }
        for(int i=0;i<rowAndCol;i++){
            for(int j=0;j<rowAndCol;j++){
                System.out.format("%4d",arr[j][i]);
            }
            System.out.println();
        }
    }
}
