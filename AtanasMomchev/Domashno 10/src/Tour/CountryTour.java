package Tour;

import java.util.*;

public class CountryTour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter;
        int keySum = 0;
        int valueSum = 0;
        LinkedHashMap<Integer,Integer> cities = new LinkedHashMap<>();
        System.out.println("How many cities: ");
        counter = input.nextInt();
        System.out.println("Input cities now: ");
        for(int i=0;i<counter;i++){
            cities.put(input.nextInt(),input.nextInt());
        }
        for(Integer city : cities.keySet()){
            keySum += city;
            valueSum += cities.get(city);
        }
        if(keySum > valueSum) {
            System.out.println("NO");
        }else {

        }
    }
}
