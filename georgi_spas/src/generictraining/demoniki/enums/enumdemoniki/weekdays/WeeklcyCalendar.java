package generictraining.demoniki.enums.enumdemoniki.weekdays;

import java.util.ArrayList;
import java.util.List;

public class WeeklcyCalendar {


    List<WeeklyEntry> entries;

    public WeeklcyCalendar() {
        this.entries = new ArrayList<>();
    }

    void addEntry(String weekday, String notes){
    this.entries.add(new WeeklyEntry(weekday,notes));
    }

    Iterable<WeeklyEntry> getWeeklyShedule(){
     return   this.entries;
    }
}
