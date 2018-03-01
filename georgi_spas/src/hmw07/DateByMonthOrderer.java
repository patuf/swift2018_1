package hmw07;

import jdk.nashorn.internal.ir.IfNode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Comparator;


public class
DateByMonthOrderer implements Comparator<LocalDate> {

    @Override
    public int compare(LocalDate data1, LocalDate data2) {
        // give month like intger number
        int fMonth = data1.getMonth().getValue();
        int sMonth = data2.getMonth().getValue();

        if (fMonth < sMonth) {// fMonth(-1)   0(equal)   sMonth(1)
            return -1;// first month is less
        } else if (fMonth > sMonth) {
            // first month is bigger than second
            return 1;
        } else {

            if (fMonth == sMonth) {

                int fDay = data1.getDayOfMonth();
                int sDay = data2.getDayOfMonth();
                if (sDay < fDay) {
                    return -1;// second day is less than second day
                } else if (sDay < fDay) {
                    // second day is bigger than first day
                    return 1;
                } else {
                    return 0;
                }
            }
        }
        return 0;// equal
    }


    public static void main(String[] args) {

        // use this pattern-> https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        // ressume:
        // 1)using pattern from letters, such as uuuu-MMM-dd
        // 2)two methods: one formatting
        /* format(DateTimeFormatter formatter), and one for parsing,
         parse(CharSequence text, DateTimeFormatter formatter)

         EXAMPLE:  LocalDate date = LocalDate.now();
                   String text = date.format(formatter);
                   LocalDate parsedDate = LocalDate.parse(text, formatter);
         */


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate[] ld = {
                LocalDate.parse("2016-12-12", formatter),
                LocalDate.parse("2015-11-11", formatter),
                LocalDate.parse("2014-10-10", formatter),
                LocalDate.parse("2013-09-09", formatter),
                LocalDate.parse("2013-09-09", formatter),
                LocalDate.parse("2013-07-07", formatter),
                LocalDate.parse("2013-07-10", formatter),
                LocalDate.parse("2013-07-11", formatter),
                LocalDate.parse("2012-04-04", formatter)
        };
//Question i can't sort whit own implementaition

        DateByMonthOrderer DateByMonthOrderer = new DateByMonthOrderer();


        Arrays.sort(ld, DateByMonthOrderer);
        for (LocalDate date : ld) {
            System.out.println(date);
        }


    }

}


