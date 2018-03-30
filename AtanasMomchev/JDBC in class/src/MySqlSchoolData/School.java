package MySqlSchoolData;

import java.sql.*;
import java.util.Scanner;

public class School {
    Scanner input = new Scanner(System.in);
    final String DBS_CONN_STRING = "jdbc:mysql://localhost:3306/school";
    final String DBMS_USERNAME = "root";
    final String DBMS_PASSWORD = "Nasko235";

    public void somthingThatIsNeeded(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void insertTeacher() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String query = "INSERT INTO teachers(name,email,salary) values (?,?,?)";
        try (Connection con = DriverManager.getConnection(
                DBS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
             PreparedStatement ps = con.prepareStatement(query)) {
            System.out.println("Input name, email and salary of teacher");
            ps.setString(1, input.nextLine());
            ps.setString(2, input.nextLine());
            ps.setDouble(3, input.nextDouble());
            ps.execute();
        }
    }

    public void getTeacher() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String query = "select * from teachers where id = ?";
        try (Connection con = DriverManager.getConnection(
                DBS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
             PreparedStatement ps = con.prepareStatement(query)) {
            System.out.println("Input teachers id.");
            System.out.println(executePreparedStatement(ps, input.nextInt()));

        }
    }
    public void getTeachers() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String query = "select t.salary,t.name from teachers t group by id having salary> ? and salary < ?";
        try (Connection con = DriverManager.getConnection(
                DBS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
             PreparedStatement ps = con.prepareStatement(query)) {
            StringBuilder result = new StringBuilder();
            System.out.println("Input margin for salary:");
            ps.setDouble(1,input.nextDouble());
            ps.setDouble(2,input.nextDouble());
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()) {
                    System.out.println(result.append(String.format("%.2f - %s",
                            rs.getDouble("salary"),
                            rs.getString("name"))));
                }
            }

        }
    }
    public void setStudent() throws  SQLException{
        String query = "INSERT INTO students(name,enrollmentDate) values (?,?)";
        try (Connection con = DriverManager.getConnection(
                DBS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
             PreparedStatement ps = con.prepareStatement(query)) {
            System.out.println("Input name and enrollment date for student.");
            ps.setString(1, input.nextLine());
            ps.setString(2, input.nextLine());
            ps.execute();

        }
    }
    public void getStudentById()throws SQLException{
        String query = "select * from students where id = ?";
        try (Connection con = DriverManager.getConnection(
                DBS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
             PreparedStatement ps = con.prepareStatement(query)) {
            StringBuilder result = new StringBuilder();
            System.out.println("Input id.");
            ps.setString(1, input.nextLine());
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    System.out.println(result.append(String.format("%s - enrolled on %s.",
                            rs.getString("name"),
                            rs.getDate("enrollmentDate").toString())));
                }
            }
        }
    }
    public void getStudentAfterDate()throws SQLException{
        String query = "select * from students where enrollmentDate > ?";
        try (Connection con = DriverManager.getConnection(
                DBS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
             PreparedStatement ps = con.prepareStatement(query)) {
            StringBuilder result = new StringBuilder();
            System.out.println("Input date.");
            ps.setString(1, input.nextLine());
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    System.out.println(result.append(String.format("%s - enrolled on %F.",
                            rs.getDouble("name"),
                            rs.getDate("enrollmentDate"))));
                }
            }
        }
    }
    private static String executePreparedStatement(PreparedStatement statement, int arg)
            throws SQLException {

        StringBuilder result = new StringBuilder();

        statement.setInt(1, arg);

        try (ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                result.append(String.format("%s - emial address: %s, salary = %.2f",
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getDouble("salary")));
            }
        }
        return result.toString();
    }
}