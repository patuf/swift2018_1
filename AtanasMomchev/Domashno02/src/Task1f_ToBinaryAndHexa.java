import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {
    public static void main(String [] args){
        String binary = ""; // for printing binary
        String hex = ""; // for printing hex
        String rev = ""; // where the code is kept before it is reversed
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();
        temp = number;
        // a loop to transform the number into a reversed binary
        while(temp >0){
            // checks if the temp is dividable by 2 if no then add 1 else add 0
            if(temp%2 !=0){
                rev += 1;
            }else {
                rev += 0;
            }
            temp = temp/2;
        }
        // reverse the answer so it is in a correct order
        for(int i=rev.length()-1;i>=0;i--){
            binary += rev.charAt(i);
        }
        rev = "";// setting rev back to blank
        temp = number;// setting temp equal to number again
        //setting up a loop to transform the number to a reversed hex
        while (temp>0){
            int temp2 = temp; // creating a second temp to store the modulus
            temp2 = temp2%16;
            if((temp2)<10){
                rev+= temp2;
            }else{
                switch (temp2){
                    case 10: rev += "A"; break;
                    case 11: rev += "B"; break;
                    case 12: rev += "C"; break;
                    case 13: rev += "D"; break;
                    case 14: rev += "E"; break;
                    default: rev += "F"; break;
                }
            }
            temp= temp/16;
        }
        for(int i=rev.length()-1;i>=0;i--){
            hex += rev.charAt(i);
        }
        System.out.println(binary);
        System.out.println(hex);
    }
}
