import java.util.Scanner;

public class Task4a_StringWoVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a sentace and i will eat the vowels: ");
        String sentance = input.nextLine();
        String noVowels ="";//the new string with no vowels
        char vowel;//char to input each char
        //a loop to go trough each char
        for(int i=0;i<sentance.length();i++){
            vowel = sentance.charAt(i);//putting each char in here
            //if statement to check if the char is a vowel
            if(vowel=='A'||vowel=='E'||vowel=='I'||vowel=='O'||vowel=='U'||vowel=='Y'){
                continue;
            }else if (vowel=='a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u'||vowel=='y'){
                continue;
            }else
                noVowels+= vowel;//creating the new string
        }
        System.out.print("I ate them all: " + noVowels);
    }
}
