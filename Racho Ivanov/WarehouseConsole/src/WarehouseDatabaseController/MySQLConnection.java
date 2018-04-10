package WarehouseDatabaseController;

import java.sql.*;

public class MySQLConnection
{
	private Connection con;

	public MySQLConnection(String conString, String user, String password)
					throws ClassNotFoundException, IllegalAccessException,
					InstantiationException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		this.con = DriverManager.getConnection(conString, user, password);
	}

	public ResultSet executeQuerry(PreparedStatement st) throws SQLException
	{
		ResultSet rset = st.executeQuery();
		return rset;
	}

	public Connection getCon()
	{
		return con;
	}
}

//while (ex != null) {
//				System.out.println(ex.getSQLState());
//				System.out.println(ex.getMessage());
//				System.out.println(ex.getErrorCode());
//				ex = ex.getNextException();
//				}



