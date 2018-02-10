package Calculator;
import java.util.Scanner;

public class Task1_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator cal = new Calculator();
        String str = "";
        System.out.println("Input commands and numbers: ");
        while (true){
            //str will hold the command
            str = input.next();
            str = str.toUpperCase();
            if(str.equals("END")) break;
            //setting variables to class object
            cal.setA(input.nextDouble());
            cal.setB(input.nextDouble());
            //calling methods depending on command in str
            if(str.equals("SUM"))
                System.out.format("%.3f %n",cal.sum());
            else if (str.equals("SUB"))
                System.out.format("%.3f %n",cal.subtract());
            else if (str.equals("MUL"))
                System.out.format("%.3f %n",cal.multiply());
            else if (str.equals("DIV"))
                System.out.format("%.3f %n",cal.divide());
            else if (str.equals("PER"))
                System.out.format("%.3f %n",cal.percentage());
        }
    }
}
