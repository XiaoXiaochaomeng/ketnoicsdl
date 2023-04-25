package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection c = null;
		com.mysql.jdbc.Driver driver;
		try {
			driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			String url = "jdbc:mySQL://localhost:3306/nhasach";
			String username = "root";
			String password = "Anhem@123";
			c = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return c;
	}
	
	public static void closeConnection(Connection c) {
		try {
			if(c!=null) {
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
