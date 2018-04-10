package DataBase;

import java.sql.*;

public class MySQLConnection
{
	private Connection con;

	public MySQLConnection() throws ClassNotFoundException, IllegalAccessException,
					InstantiationException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouseDB?autoReconnect=true&useSSL=false",
		"warehouse", "warehouse");
	}

	public ResultSet executeQuerry(PreparedStatement st) throws SQLException
	{
		ResultSet rset = st.executeQuery();
		return rset;
	}

	public ResultSet execQuerry(String querry) throws SQLException
	{
		Statement stm = this.con.createStatement();
		return  stm.executeQuery(querry);
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



