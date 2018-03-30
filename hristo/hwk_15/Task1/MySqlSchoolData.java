package swift2018_1.hristo.hwk_15.Task1;

import java.sql.*;
import java.time.LocalDate;

public class MySqlSchoolData {

    public static void insertTeacher(String name, String email, Integer salary){

            final String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
            final String user = "root";
            final String password = "easy";

            try (Connection conn = DriverManager.getConnection(
                    url, user, password);

                 PreparedStatement pstatement = conn.prepareStatement( "insert into teachers (name, email, salary) " +
                         "values (?, ?, ?);")) {
                pstatement.setString(1, name);
                pstatement.setString(2,email);
                pstatement.setInt(3,salary);
                pstatement.executeUpdate();
            }
            catch (Exception ex){
                System.err.println("Got an exception!");
                System.err.println(ex.getMessage());
            }
    }

    public static void getTeachers(Integer x, Integer y){

        final String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
        final String user = "root";
        final String password = "easy";

        try {
            Connection conn = DriverManager.getConnection(
                    url, user, password);

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from teachers salary where salary >" +x+ " && salary < " +y+ ";");


            while (rs.next()){
                System.out.println(rs.getString(2));
            }

        }catch (Exception ex){
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
        }
    }


    public static void insertStudent(String name, String date){

        final String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
        final String user = "root";
        final String password = "easy";

        try (Connection conn = DriverManager.getConnection(
                url, user, password);

             PreparedStatement pstatement = conn.prepareStatement( "insert into students (name, enrollmentDate) " +
                     "values (?, ?);")) {
            pstatement.setString(1, name);
            pstatement.setDate(2, java.sql.Date.valueOf(java.time.LocalDate.parse(date)));
            pstatement.executeUpdate();
        }
        catch (Exception ex){
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
        }
    }

    public static void getStudent(Integer id){

        final String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
        final String user = "root";
        final String password = "easy";

        try {
            Connection conn = DriverManager.getConnection(
                    url, user, password);

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from students where id = " + id +";");
            rs.next();

                System.out.println(rs.getString(2));

        } catch (Exception ex) {
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
        }
    }

    public static void getStudents(String date){

        final String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
        final String user = "root";
        final String password = "easy";

        try {
            Connection conn = DriverManager.getConnection(
                    url, user, password);

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select name from students where enrollmentDate > '" +date+ "';");


            while (rs.next()){
                System.out.println(rs.getString(1));
            }

        }catch (Exception ex){
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
        }

    }

    public static void getDisciplinesByTeacherId(Integer techer_id){

        final String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
        final String user = "root";
        final String password = "easy";

        try {
            Connection conn = DriverManager.getConnection(
                    url, user, password);

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select name from disciplines\n" +
                    "inner join disciplines_taught on disciplines_taught.discipline_id = disciplines.id\n" +
                    "where teacher_id = "+ techer_id+";");


            while (rs.next()){
                System.out.println(rs.getString(1));
            }

        }catch (Exception ex){
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
        }
    }

    public static void getTeachersByDisciplineName(String name){

        final String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
        final String user = "root";
        final String password = "easy";

        try {
            Connection conn = DriverManager.getConnection(
                    url, user, password);

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select teachers.name from teachers\n" +
                    "inner join disciplines_taught on disciplines_taught.teacher_id = teachers.id\n" +
                    "inner join disciplines on discipline_id = disciplines.id\n" +
                    "where disciplines.name = '" + name+"';");


            while (rs.next()){
                System.out.println(rs.getString(1));
            }

        }catch (Exception ex){
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
        }
    }
}
