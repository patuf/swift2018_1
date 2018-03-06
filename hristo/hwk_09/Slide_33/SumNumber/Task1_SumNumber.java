package swift2018_1.hristo.hwk_09.Slide_33.SumNumber;

import java.util.Scanner;

public class Task1_SumNumber {



    public Task1_SumNumber(int a, int b)
        throws EqualsException, NegativeNumber {
            if (a == b) {
                throw new EqualsException("This numbers are equals");
            }else if (a < 0 || b <0) {
                throw new NegativeNumber("There is negative number");
            }
        }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean isexception = false;

        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
           Task1_SumNumber equals = new Task1_SumNumber(a , b);
        }
        catch (EqualsException ex){
            System.out.println(ex.getMessage());
            isexception = true;
        }
        catch (NegativeNumber ex){
            System.out.println(ex.getMessage());
            isexception = true;
        }

        if(!isexception)
        System.out.println("The sum of digits is: " + (a + b));
    }
}
