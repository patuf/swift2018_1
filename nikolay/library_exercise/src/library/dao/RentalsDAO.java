package library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

public class RentalsDAO extends AbstractDAO {


    public int getTakenBooks(String esbn) throws SQLException {

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement("select sum(quantity) from rentals where esbn = ? AND status = 0");
             ResultSet rs = setEsbnAndExec(ps, esbn)) {

            if (rs.next())
                return rs.getInt(0);
            else
                return 0;
        }
    }

    public boolean rentABook(int cli_id, String esbn, int quantity, LocalDate dueDate) throws SQLException {

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement("insert into rentals (client_id, date_taken, ...) values (?,?,?)");
             ResultSet rs = setEsbnAndExec(ps, esbn)) {

            if (rs.next())
                return rs.getInt(0);
            else
                return 0;
        }
    }

    private ResultSet setEsbnAndExec(PreparedStatement ps, String esbn) throws SQLException {

        ps.setString(1, esbn);
        return ps.executeQuery();
    }
}
