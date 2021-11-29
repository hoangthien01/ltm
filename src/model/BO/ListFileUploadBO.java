package model.BO;

import java.sql.SQLException;
import java.util.List;

import model.Bean.FileUpload;
import model.DAO.ListFileUploadDAO;

public class ListFileUploadBO {
	private ListFileUploadBO() {

	}

	public static List<FileUpload> listFileUpload(String username) throws SQLException {
		return ListFileUploadDAO.listFileUpload(username);
	}
}
