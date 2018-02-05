public class Task0a_CreatingArray {
    public static void main(String[] args) {
        // creating and initialising array
        int [] numbers = new int[]{5,9,11,3,6,4,7};
        //loop to go trough each part of the array and print it on new row
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
