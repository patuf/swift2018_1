package Sakila;

import java.sql.*;
import java.util.Scanner;

public class Task0 {
    Scanner input  = new Scanner(System.in);
    final String DBS_CONN_STRING = "jdbc:mysql://localhost:3306/movie";
    final String DBMS_USERNAME = "root";
    final String DBMS_PASSWORD = "Nasko235";

    public void setActor(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
            String query = "INSERT INTO actor(name) values (?)";
        try (Connection con = DriverManager.getConnection(
                DBS_CONN_STRING,DBMS_USERNAME,DBMS_PASSWORD);
            PreparedStatement ps = con.prepareStatement(query)) {
            System.out.println("Input name of actor");
            ps.setString(1,input.nextLine());
            ps.execute();

        }catch (SQLException e){
            while (e != null){
                System.out.println(e.getSQLState());
                System.out.println(e.getMessage());
                System.out.println(e.getErrorCode());
            }
        }
    }
    public void actorInMovie(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String query =
                "update actor set film_actor = (select id from film where title = ? )  where name = ?";
        try (Connection con = DriverManager.getConnection(
                DBS_CONN_STRING,DBMS_USERNAME,DBMS_PASSWORD);
             PreparedStatement ps = con.prepareStatement(query)) {
            System.out.println("Input title of movie and which actor is cast in it");
            ps.setString(1,input.nextLine());
            ps.setString(2,input.nextLine());
            ps.execute();

        }catch (SQLException e){
            while (e != null){
                System.out.println(e.getSQLState());
                System.out.println(e.getMessage());
                System.out.println(e.getErrorCode());
            }
        }
    }
    public void NewactorInMovie(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String query =
                "insert into actor(name,film_actor) select ?, (select id from film where title = ? )";
        try (Connection con = DriverManager.getConnection(
                DBS_CONN_STRING,DBMS_USERNAME,DBMS_PASSWORD);
             PreparedStatement ps = con.prepareStatement(query)) {
            System.out.println("Input title of movie and which actor is cast in it");
            ps.setString(1,input.nextLine());
            ps.setString(2,input.nextLine());
            ps.execute();

        }catch (SQLException e){
            while (e != null){
                System.out.println(e.getSQLState());
                System.out.println(e.getMessage());
                System.out.println(e.getErrorCode());
            }
        }
    }
}
