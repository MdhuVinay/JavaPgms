package practiceSDET48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Fetch_pgm
{
	public static void main(String[] args) throws SQLException
	{
		Connection connection = null;
		try
		{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("Select * from sdet");
			while(result.next())
			{
				System.out.println(result.getString(2));
			}
		}
		finally
		{
			connection.close();
		}
		
	}
}
