
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementsExample {

    static final String DBMS_CONN_STRING = "jdbc:mysql://localhost:3306/animaldb";
    static final String DBMS_USERNAME = "root";
    static final String DBMS_PASSWORD = "1qazZAQ!";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String sqlStatement = "SELECT * FROM people ppl left JOIN pets ON ppl.id = pets.ownerId WHERE ppl.age >= ? LIMIT 5";

        int userDefinedAge = 22;
        try (Connection con = DriverManager.getConnection(DBMS_CONN_STRING,
                DBMS_USERNAME, DBMS_PASSWORD);
                PreparedStatement statement = con.prepareStatement(sqlStatement)) {

            System.out.println(executePreparedStatement(statement, 12));
            System.out.println(executePreparedStatement(statement, 18));
            System.out.println(executePreparedStatement(statement, userDefinedAge));

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

    private static String executePreparedStatement(PreparedStatement statement, int arg)
            throws SQLException {

        StringBuilder result = new StringBuilder();

        statement.setInt(1, arg);

        System.out.printf("Listing results for age %d and above:%n", arg);
        try (ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                result.append(String.format("%s - %dyo owns %s, a %s aged %d%n",
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("pets.name"),
                        rs.getString("type"),
                        rs.getInt("pets.age")));
            }
        }

        return result.toString();
    }
}
