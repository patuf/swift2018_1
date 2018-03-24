/*import java.sql.*;

public class Task0_Sakila {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sakila",
                "root", "sql");
             CallableStatement statement = conn.prepareCall( "{call insert_country(?, ?)}")) {
            statement.setString("new_country", "Bulgaria");
            statement.registerOutParameter("new_id", Types.INTEGER);
            statement.execute();
            Integer newId = statement.getInt("new_id");
            System.out.println(newId);
        }catch (SQLException ex) {
            // code
        }

    }
}*/
