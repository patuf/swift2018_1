package swift2018_1.hristo.hwk_08.Task1;

public class Discipline extends Teacher{

    private String discipline_name;
    private int weekcount;


    public Discipline(String school, String teacher_name, String discipline_name, int weekcount) {
        super(school, teacher_name);
        this.discipline_name = discipline_name;
        this.weekcount = weekcount;

    }
}
