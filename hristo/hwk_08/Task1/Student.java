package swift2018_1.hristo.hwk_08.Task1;

public class Student extends Classroom {

    private String student_name;
    private int student_num;


    public Student(String school, String classroom_name, String student_name, int student_num) {
        super(school, classroom_name);
        this.student_name = student_name;
        this.student_num = student_num;
    }
}
