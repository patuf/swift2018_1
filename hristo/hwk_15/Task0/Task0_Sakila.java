package swift2018_1.hristo.hwk_15.Task0;

import java.sql.*;
import java.util.Scanner;


public class Task0_Sakila {

    private static void addActorName(String name){

        final String url = "jdbc:mysql://localhost:3306/sakila?useSSL=false";
        final String user = "root";
        final String password = "easy";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = con.prepareStatement("insert into actor (name) value (?);");
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();

            con.close();

        }
        catch (Exception ex){
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
        }

    }

    private static void addActor2Film(String actor, String film){

        final String url = "jdbc:mysql://localhost:3306/sakila?useSSL=false";
        final String user = "root";
        final String password = "easy";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select id from actor where name = '"+actor+"'");

            rs.next();
            int i = rs.getInt(1);
            System.out.println(i);

            st.executeUpdate("update film set actor_id ="+ i +" where film_name = '"+film+"'");


        }
        catch (Exception ex){
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
        }
    }

    private static void addNewActor2Film (String actor, String film){

        final String url = "jdbc:mysql://localhost:3306/sakila?useSSL=false";
        final String user = "root";
        final String password = "easy";

        try (Connection conn = DriverManager.getConnection(
                url, user, password);

             CallableStatement statement = conn.prepareCall( " {call insert_actor(?, ?, ?)}")) {
            statement.setString("new_name", actor);
            statement.setString("new_film", film);
            statement.registerOutParameter("new_id", Types.INTEGER);
            statement.execute();
            Integer newId = statement.getInt("new_id");
            System.out.println(newId);
        }
        catch (Exception ex){
            System.err.println("Got an exception!");
            System.err.println(ex.getMessage());
        }

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of an actor:");
        String name = sc.next();

        System.out.println("Enter the name of an film:");
        String film = sc.next();


        addNewActor2Film(name,film);


    }

}
