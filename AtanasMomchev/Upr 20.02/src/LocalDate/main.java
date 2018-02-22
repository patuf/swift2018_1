package LocalDate;


import java.time.LocalDate;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        DateByMonthOrder c = new DateByMonthOrder();
        LocalDate [] arrangeDates = new LocalDate[]{LocalDate.now(),LocalDate.of(2012,12,12),
                                        LocalDate.of(2015,8,15),
                                        LocalDate.of(2017,10,17),
                                        LocalDate.of(2010,10,31)};
        Arrays.sort(arrangeDates, c);
        for(LocalDate date : arrangeDates){
            System.out.println(date + " ");
        }
    }
}
