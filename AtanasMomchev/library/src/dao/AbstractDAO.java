package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

abstract class AbstractDAO {

    protected Connection getConnection() throws SQLException {

        final String DBS_CONN_STRING = "jdbc:mysql://localhost:3306/library";
        final String DBMS_USERNAME = "root";
        final String DBMS_PASSWORD = "Nasko235";

        return DriverManager.getConnection(DBS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
    }
}
