package homework.ArraysStringHmwk04;

public class Task_Print2dArray {
    public static void main(String[] args) {
        ///////////////////  d) ask0d_Print2dArray  ////////////////
        // print 2n dimensional array 4x4 whit value from 1 to 16

        int [][] arrayTwoDimensional=new int[4][4];// decalaration + initialize
        int count=1;
        // fill array start from row and fill in every col to the end of row

        for (int row = 0; row <arrayTwoDimensional.length ; row++) {
            for (int col = 0; col < arrayTwoDimensional[0].length; col++) {
                arrayTwoDimensional[row][col]=count;// fill whit value
                if (count<10){
                    System.out.print(" ");// one tab
                    System.out.print(arrayTwoDimensional[row][col]);// print

                }else{
                    System.out.print(arrayTwoDimensional[row][col]);// print
                }

                count++;
            }
            System.out.println();

        }
    }
}
