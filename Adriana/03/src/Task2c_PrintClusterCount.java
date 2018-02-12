import java.util.Scanner;

public class Task2c_PrintClusterCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int chisla[] = new int[n];
        System.out.println("enter numbers");
        for (i = 0; i < n; i++) {
            chisla[i] = sc.nextInt();
        }
        int a = 0;
        for (i = 0; i < n-1; i++) {
            if ((chisla[i] == chisla[i++])&& chisla[i++]!= chisla[(i++)+1]) {
                a++;
            }else {
                continue;
            }
            if (chisla[n] == chisla[n-1]){
                a = a + 1;
            }


        }
        System.out.print(a);

    }

}
// ne moga da razbera zashto ne trugva