package src.hwk_03;

public class Task3c_PrintChristmasTree {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5 - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }

}