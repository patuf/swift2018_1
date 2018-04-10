import WarehouseDatabaseController.MySQLConnection;
import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exe
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
	{
		final String conString = "jdbc:mysql://localhost:3306/warehouseDB?autoReconnect=true&useSSL=false";
		final String user = "warehouse";
		final String password = "warehouse";

		MySQLConnection con = new MySQLConnection(conString, user,password);



	}
}
