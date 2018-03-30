package Sakila;

import MySqlSchoolData.School;

import java.sql.SQLException;

public class MainForTesting {
    public static void main(String[] args) {
        School s = new School();
        s.somthingThatIsNeeded();
        try {
            s.getStudentById();
        } catch (SQLException e) {
            while (e != null) {
                System.out.println(e.getSQLState());
                System.out.println(e.getMessage());
                System.out.println(e.getErrorCode());
            }
        }

    }
}
