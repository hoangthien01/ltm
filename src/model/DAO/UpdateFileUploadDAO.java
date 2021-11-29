package model.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import utils.DatabaseConnection;

public class UpdateFileUploadDAO {
	private UpdateFileUploadDAO() {

	}

	public static boolean updateFileUpload(String path, String status) throws SQLException {
		boolean check = false;
		Connection con = DatabaseConnection.getConnection();
		Statement s = con.createStatement();

		String query = "update fileupload set status = '" + status + "' where path ='" + path + "'";
		check = s.executeUpdate(query) != 0;
		return check;
	}
}
