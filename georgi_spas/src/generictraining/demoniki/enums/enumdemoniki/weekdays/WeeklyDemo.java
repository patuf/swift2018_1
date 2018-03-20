package generictraining.demoniki.enums.enumdemoniki.weekdays;

public class WeeklyDemo {
    public static void main(String[] args) {
        WeeklcyCalendar wc=new WeeklcyCalendar();
        wc.addEntry("monday","work");
        wc.addEntry("sunday","sleep");
        Iterable<WeeklyEntry> schedule=wc.getWeeklyShedule();
        for (WeeklyEntry weeklyEntry:schedule) {
            System.out.println(weeklyEntry);
        }
    }
}
