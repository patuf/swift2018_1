import java.util.Scanner;

public class Task2c_PrintClusterCount {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("How many numbers will you input: ");
    int numbers = input.nextInt();
    // creating and initialising array with length numbers
    int [] arr = new int[numbers];
    //creating counter for clusters
    int clusters = 0;
    //creating a int to put the start of a cluster
    int clusterStart = 0;
    System.out.print("Ok input them now: ");
    //loop to fill the array
    for(int i=0;i<numbers;i++){
        arr[i]=input.nextInt();
    }
    //loop to go trough the array
    for(int i=0;i<arr.length;i++){
        //if statement to check if the cluster is continuing and skip if true to next iteration
        if(arr[i] == clusterStart && i != 0) continue;
        int end = i + 1;
        //if statement to change end so we don't get error out of bounds
        if(i == arr.length-1) end = arr.length-1;
        //if statement to check if there is a cluster start
      if(arr[i] == arr[end] && i != arr.length-1){
          //entering the number of the cluster
          clusterStart = arr[i];
          //increasing cluster count by 1
          clusters++;
      }
    }
        System.out.format("In you array there are %d clusters",clusters);
    }
}
