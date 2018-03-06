package hmw08.school.school;

public class Class implements NameAble {
    private final String clasName;
    // reference student and teachers
    Student[] students;
    int numberStudents;
    Teacher[] teachers;

    Class(String clasName) {
        this.clasName = clasName;
        this.students=new Student[20];
        this.teachers=new Teacher[6];
    }

    @Override
    public String getName() {
        return this.clasName;
    }


}
