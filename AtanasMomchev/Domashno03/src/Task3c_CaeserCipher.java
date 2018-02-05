import java.util.Scanner;

public class Task3c_CaeserCipher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = input.nextLine();
        System.out.print("Type decode or encode: ");
        String code = input.nextLine();
        //string to contain the changed code
        String uStr = "";
        //if statement to check if input is decode or encode
        if (code.equals("encode")) {
            //loop to go trough the string
            for (int i = 0; i < str.length(); i++) {
                //if statement to check if its space or punctuation
                if(str.charAt(i) == ' '|| str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?' ||
                        str.charAt(i) == ','){
                    uStr += str.charAt(i);
                }else {
                    //if note change to unicode and add one to go to the next letter
                    int unicode = (int) str.charAt(i);
                    unicode++;
                    //add the changed letter to new string
                    uStr += Character.toString((char) unicode);
                }
            }
            //print out the coded string
            System.out.println(uStr);
        }else if(code.equals("decode")){
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ' '|| str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?' ||
                        str.charAt(i) == ',') {
                    uStr += str.charAt(i);
                }else {
                    //decoding the characters
                    int unicode = (int) str.charAt(i);
                    unicode--;
                    //adding the characters to a new string
                    uStr += Character.toString((char) unicode);
                }
            }
            //printing the decoded string
            System.out.println(uStr);
        }
    }
}
