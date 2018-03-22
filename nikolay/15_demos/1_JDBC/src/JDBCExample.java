
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample {

    public static void main(String[] args) {

        final String DBMS_CONN_STRING = "jdbc:mysql://localhost:3306";
        final String DBMS_USERNAME = "root";
        final String DBMS_PASSWORD = "1qazZAQ!";

        try (Connection con = DriverManager.getConnection(
                DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                Statement statement = con.createStatement();
                ResultSet rs = statement.executeQuery(
                        "SELECT * FROM animaldb.people ppl JOIN animaldb.pets ON ppl.id = pets.ownerId where ppl.name = 'Pesho' LIMIT 5")) {

            while (rs.next()) {
                System.out.printf("%s - %dyo owns %s, a %s aged %d%n",
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("pets.name"),
                        rs.getString("type"),
                        rs.getInt("pets.age"));
            }

        } catch (SQLException ex) {

            // SQLException is actually a linked list of Exceptions
            while (ex != null) {
                System.out.println(ex.getSQLState());
                System.out.println(ex.getMessage());
                System.out.println(ex.getErrorCode());
                ex = ex.getNextException();
            }

        }
    }
}
