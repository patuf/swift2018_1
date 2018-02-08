import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {

    public static void main(String [] arg){

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        String bin = Integer.toBinaryString(i);//Този стринг ми преобразува в двоичен код

        String hex = Integer.toHexString(i);//Този стринг ми преобразува в шестнадесетичен код

        System.out.format(bin+ "%n" + hex);

        /*Иска ми се отговорът на шестнадесетичния код да е с главни букви,
        но се затруднявам да го направя*/
    }
}
