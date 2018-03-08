package swift.homwork.HWK7;

import java.time.LocalDate;
import java.util.Comparator;

public class DateByMonthOrderer implements Comparator<LocalDate> {

	@Override
	public int compare(LocalDate o1, LocalDate o2) {
		return o1.getMonthValue()-o2.getMonthValue();

	}
	/**
	 * i know that i have to do this : 
	 * int firstMonth=o1.getMonthValue();
	 * int secondMonth=o1.getgetMonthValue();
	 * if(firstMonth>secondMonth){
	 * return 1;
	 * }else if (firstMonth<secondMonth){
	 * return -1;
	 * }else{
	 * return 0;
	 * }
	 * but i already have done it by using the comparator
	 * and method compare which it has this function in it :D
	 * 
	 * hope it's right;
	 */

}

