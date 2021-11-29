package model.BO;

import java.sql.SQLException;

import model.DAO.InsertFileUploadDAO;

public class InsertFileUploadBO {
	private InsertFileUploadBO() {

	}

	public static boolean insertFile(String path, String filename, String username, String status) throws SQLException {
		return InsertFileUploadDAO.insertFile(path, filename, username, status);
	}

}
