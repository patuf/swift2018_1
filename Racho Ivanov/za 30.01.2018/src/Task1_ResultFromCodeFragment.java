public class Task1_ResultFromCodeFragment
{
    public static void main(String[] args)
    {
        //a
        int a = 5;
        int b = 10;
        int c = ++a * b--;

        System.out.println("After completion c is " + c + " b is " + b + " and a is " + a +".");

        //b
        System.out.println("1 + 2 = " + 1 + 2);
        System.out.println("1 + 2 = " + (1 + 2));

        //c
        System.out.println(1 + 2 + "abc");
        System.out.println("abc" + 1 + 2);

        //d
        int x = 7;
        float y = 5.6f;
        float z = x * y;
        System.out.println(z + " " + (x * y));

    }
}
