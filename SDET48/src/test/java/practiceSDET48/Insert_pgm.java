package practiceSDET48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Insert_pgm
{
	public static void main(String[] args) throws SQLException
	{
		Connection connection = null;
		try
		{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			//test is the database name that i have used.
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate("insert into sdet values(0003, 'madhu', 807314634)");
			if(result>0)// we created 1 row
			{
				System.out.println("query inserted");
			}
			else
			{
				System.out.println("query not inserted");
			}	
		}
		finally
		{
			connection.close();
		}
	}
}
