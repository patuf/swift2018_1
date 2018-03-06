package swift.homwork.HWK7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;


public class LocalData {
	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
		LocalDate[] localdate = { LocalDate.parse("12-02-2016", formatter), LocalDate.parse("16-08-2005", formatter),
				LocalDate.parse("01-01-2016", formatter), LocalDate.parse("01-10-2018", formatter),
				LocalDate.parse("02-01-2008", formatter), LocalDate.parse("06-07-2001", formatter),
				LocalDate.parse("12-12-2014", formatter) };
	
		DateByMonthOrderer dateByMonthOrderer= new DateByMonthOrderer();
		Arrays.sort(localdate, dateByMonthOrderer);
		for (LocalDate localDate2 : localdate) {
			System.out.println(localDate2);
		}

	}
}
