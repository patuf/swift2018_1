package swift2018_1.hristo.hwk_10;

import java.net.Inet4Address;
import java.util.*;

public class Task4_CountryTour {

    public static void main(String[] args) {

        List <Integer> country = new LinkedList<Integer>();

        country.add(0,4);
        country.add(1,3);
        country.add(2,3);
        country.add(3,4);
        country.add(4,6);

        Iterator<Integer> itr = country.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
