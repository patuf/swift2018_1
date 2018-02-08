package homework.ArraysStringHmwk04;

import java.util.Scanner;

public class Task2c_PrintClusterCount {
    public static void main(String[] args) {
///////////////  c) Task2c_PrintClusterCount //////////////
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of numbers");
        int  n = sc.nextInt();
        int [] nums=new int[n];
        int maxCountCluster=0;
        int countCluster=1;
        System.out.println("fill array whit integer numbers");
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=sc.nextInt();
        }
        for (int i = 0; i <nums.length ; i++) {
            int currentCluster=nums[i];

            for (int j = i+1; j <nums.length ; j++) {
                int nextCluster=nums[j];
                if (currentCluster==nextCluster){
                    countCluster++;

                }else {
                    if (countCluster>maxCountCluster)maxCountCluster=countCluster;
                    countCluster=1;

                }

            }
        }
        if (countCluster>maxCountCluster)maxCountCluster=countCluster;
        System.out.println(maxCountCluster);


    }
}
