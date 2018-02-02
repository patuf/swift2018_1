import java.util.Scanner;

public class Task3c_PrintChristmasTree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number for height to create a Christmas tree: ");
        int height = input.nextInt(); //height of the tree
        int crown = height - 2; // the top of the tree
        int width = (crown-1)*2+1;//width of the tree
        String row = "*";//leafs
        int half = width/2;//middle of tree
        //loop for height
        for (int i = 0; i < height; i++) {
            //loop for width
            for (int j = 0; j < width; j++) {
                //if statement to check if reached middle
                if (j != half) {
                    System.out.print(" ");
                } else
                    System.out.print(row);
            }
            half--;//lowering half to expand the crown
            row += "**";//adding leaves
            //if statement to check if reaching the end of the tree
            //when reached reset half and leave to build bottom half
            if (i == height - 3) {
                half = width / 2;
                row = "*";
            }
            System.out.println();
        }
    }
}