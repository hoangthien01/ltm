package model.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import utils.DatabaseConnection;

public class InsertFileUploadDAO {
	private InsertFileUploadDAO() {

	}

	public static boolean insertFile(String path, String filename, String username, String status) throws SQLException {
		boolean check = false;
		Connection con = DatabaseConnection.getConnection();
		Statement s = con.createStatement();

		String query = "insert into fileupload values('" + path + "', '" + filename + "', '" + username + "', '"
				+ status + "')";
		check = s.executeUpdate(query) != 0;
		return check;
	}
}
