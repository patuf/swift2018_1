
public class StringSplitExample {

    public static void main(String[] args) {
        
        String input = "I    would   love   you   to   not    put              so    many   intervals";
        String[] split = input.split("\\s+");
        System.out.println(String.join(" ", split));

        input = "a + b - c * d / e < f > g >= h <= i == j";
        String[] operators = input.split("\\s*\\w+\\s*");
        String[] operands = input.split("\\s*\\W+\\s*");

        System.out.println("Operators: " + String.join(" ", operators));
        System.out.println("Operands: " + String.join(" ", operands));
    }

}
