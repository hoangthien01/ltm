package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static Connection con = null;

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/data";
			con = DriverManager.getConnection(url, "root", "hoangthien01");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	private DatabaseConnection() {

	}

	public static Connection getConnection() {
		return con;
	}
}
