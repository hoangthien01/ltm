package model.BO;

import java.sql.SQLException;

import model.DAO.UpdateFileUploadDAO;

public class UpdateFileUploadBO {
	private UpdateFileUploadBO() {

	}

	public static boolean updateFileUpload(String path, String status) throws SQLException {
		return UpdateFileUploadDAO.updateFileUpload(path, status);
	}
}
