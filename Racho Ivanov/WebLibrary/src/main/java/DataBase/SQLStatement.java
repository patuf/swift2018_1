package DataBase;

import WarehouseElements.Item;
import WarehouseElements.Lot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public final class SQLStatement
{
	private static PreparedStatement pStatement;
	private static Connection con;
	private SQLStatement(Connection con)
	{
		this.con = con;
	}

	public static PreparedStatement newItem(Item item) throws SQLException
	{
		pStatement = con.prepareStatement
						("inset into goods (name, volume, weight, price) values (?,?,?,?)");

		pStatement.setString(1,item.getName());
		pStatement.setString(2,item.getVolume()+"");
		pStatement.setString(3,item.getWeight()+"");
		pStatement.setString(4,item.getPrice()+"");

		return pStatement;
	}

	public static PreparedStatement newLot(Lot lot) throws SQLException
	{
		pStatement = con.prepareStatement("insert into Lots(name, supported_weight, " +
						"current_weight, supported_volume, available_volume) values(?,?,?,?,?)");

		pStatement.setString(1,lot.getName());
		pStatement.setString(2,lot.getSupportedWeight()+"");
		pStatement.setString(3,lot.getCurrentLoad()+"");
		pStatement.setString(4,lot.getSupportedVolume()+"");
		pStatement.setString(5,lot.getAvailableVolume()+"");

		return pStatement;
	}

	public static String getAllTransactions()
	{
		return "select * from transactions ;";
	}

	public static String getTransactions(boolean type)
	{
		String base = "select * from transactions ";
		if (type == false)
			return base + "where transaction_type = false;";

		return base + "where transaction_type = true;";
	}

	public static String getLots(String complexity)
	{
		return "select * from lots " + complexity + " ;";
	}

	public static String getItems(String complexity)
	{
		return "select * from items " + complexity + " ;";
	}

}