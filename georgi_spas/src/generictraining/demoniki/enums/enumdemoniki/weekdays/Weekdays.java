package generictraining.demoniki.enums.enumdemoniki.weekdays;

public enum Weekdays {

    MONDAY,
    TUESDAY,
    WENDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    @Override
    public String toString() {
        return this.name().charAt(0)+this.name().substring(1).toLowerCase();
    }
}
