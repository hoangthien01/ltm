package model.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Bean.FileUpload;
import utils.DatabaseConnection;

public class ListAllFileUploadDAO {
	private ListAllFileUploadDAO() {
	}

	public static List<FileUpload> listFileUpload() throws SQLException {
		List<FileUpload> files = new ArrayList<FileUpload>();
		Connection con = DatabaseConnection.getConnection();
		Statement s = con.createStatement();

		// Create and execute query
		String query = "select * from fileupload";
		ResultSet rs = s.executeQuery(query);

		// get data
		while (rs.next()) {
			String path = rs.getString("Path");
			String name = rs.getString("Name");
			String Uploader = rs.getString("Uploader");
			String status = rs.getString("Status");
			files.add(new FileUpload(path, name, Uploader, status));
		}
		
		return files;
	}
}
