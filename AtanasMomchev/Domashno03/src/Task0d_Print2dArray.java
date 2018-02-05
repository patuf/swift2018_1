public class Task0d_Print2dArray {
    public static void main(String[] args) {
        //creating ints for rows and columns
        int rowCount = 4;
        int colCount = 4;
        //creating and initialising 2 dimensional array
        int [][]  arr = new int[rowCount][colCount];
        //creating a loop and a nesting loop
        for(int i=0; i<rowCount;i++){
            for(int j=0; j<colCount;j++){
                //inputting numbers in the array
                arr[i][j] = (i*colCount)+j+1;
                //printing the array
                System.out.format("%4d",arr[i][j]);
            }
            //creating the next row to create a matrix
            System.out.println();
        }
    }
}
