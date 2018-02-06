package homework.ArraysStringHmwk04;

public class Task0a_CreateArray {
    public static void main(String[] args) {

        ///////////////////  a) Task0a_CreateArray  ////////////////
        // task is to initialize array whit values 5,9,11,3,6,4,7

        /*
                    Two variant to initialize array :
            A) manual we input valuesi in this brackets {}
            B) we give the new size whit number (new typearray(int,boolean  and etc...)[number size]
            after that full array whit values of numbers  whit loop
         */

        // A)
        int[] array = {5, 9, 11, 3, 6, 4, 7};//declaration + initialize
        // B)
        int[] arr;// declaration

        String str = "5,9,11,3,6,4,7";// input in arr whit loop                 index- 0 1 2  3 4 5 6
        String[] nums = str.split(",");// take  numbers in array  split by ",". |5|9|11|3|6|4|7 | array
        int size = nums.length;// take size of array
        System.out.println("zise of array is " + size);// to see size of array

        arr = new int[size];//declaration size array
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.valueOf(nums[i]);
            System.out.println("Value of array is " + arr[i] + " on position " + i);
        }
    }
}
