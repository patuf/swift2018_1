package dao;

import exceptions.BookNotFound;
import model.Book2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BooksDAO extends AbstractDAO {

    public Book2 findByEsbn(String esbn) throws SQLException, BookNotFound {

        try(Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement("select esbn, author,title,quantity from books where esbn = ?");

            ResultSet rs = setEsbnAndExec(ps,esbn)){
            if(rs.next()){
                return new  Book2(rs.getString("title"),
                            rs.getString("esbn"),
                            rs.getString("author"),
                            rs.getInt("quantity"));
            }else {
                throw new BookNotFound(esbn);
            }
        }
    }
    private ResultSet setEsbnAndExec(PreparedStatement ps, String esbn) throws SQLException {
        ps.setString(1,esbn);
        return ps.executeQuery();
    }
}
