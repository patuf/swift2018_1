import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class Task1_School {
    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        int teacherId = Integer.parseInt(scanner.nextLine());
        String teacherName = scanner.nextLine();
        String email = scanner.nextLine();
        int salary = Integer.parseInt(scanner.nextLine());

        /*int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        int studentId = Integer.parseInt(scanner.nextLine());
        String studentName = scanner.nextLine();
        String enrollment_date = scanner.nextLine();

        String disciplines = scanner.nextLine();*/

        MySqlSchoolData sql = new MySqlSchoolData();
        sql.insertTeacher(teacherName, email, teacherId, salary);

        System.out.println(sql.getTeacher(teacherId));

        /*sql.getTeachers(x, y).stream().forEach(System.out::println);

        sql.insertStudent(studentId, studentName, enrollment_date);

        sql.getTeachersByDisciplineName(disciplines).stream().forEach(System.out::println);*/
    }
}
