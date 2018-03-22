package swift2018_1.hristo.hwk_10;

import java.util.Scanner;
import java.util.Stack;

public class Task7_StackMax {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> trackmax = new Stack<>(); //this stack track the max value of inputs

        Scanner sc = new Scanner(System.in);


        boolean end = false;

        int count = 0;


        do {
            String str = sc.next();

            switch (str) {

                case "PUSH":

                    int i = sc.nextInt();

                    if (trackmax.isEmpty()){ //this construction compare and add only greater or equal value to track stack
                        trackmax.push(i);
                    }else if (i >= trackmax.peek()){
                        trackmax.push(i);
                    }


                    st.push(i);

                    count++;
                    break;

                case "POP":

                    System.out.println(st.peek());
                    st.pop();
                    trackmax.pop();
                    count--;
                    break;

                case "MAX":

                    System.out.println(trackmax.peek());
                    break;

                case "END":

                    end = true;
                    break;
            }
        }while (!end) ;

        for (int i = 0; i < count; i++) {

            if(i == count - 1){

                System.out.print(st.peek());
                System.exit(0);
            }

            System.out.print(st.peek() + ", ");
            st.pop();
        }
    }
}
