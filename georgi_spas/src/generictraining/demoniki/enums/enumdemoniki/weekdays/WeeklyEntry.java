package generictraining.demoniki.enums.enumdemoniki.weekdays;

public class WeeklyEntry {
    private Weekdays weekday;
    private String note;

    public  WeeklyEntry(String weekday,String note){
    this.weekday=Weekdays.valueOf(weekday.toUpperCase());
    this.note=note;
    }

    @Override
    public String toString() {
        return this.weekday+" - "+ this.note;
    }
}
