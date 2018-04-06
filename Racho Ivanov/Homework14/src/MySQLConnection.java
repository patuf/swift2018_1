import java.sql.*;

public class MySQLConnection
{
	private Connection conn ;


	MySQLConnection(String conn, String user, String password) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException
	{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		this.conn = DriverManager.getConnection(conn, user, password);
	}

	public ResultSet execQuerry(String querry) throws SQLException
	{
		Statement stm = this.conn.createStatement();
		return  stm.executeQuery(querry);
	}
}
