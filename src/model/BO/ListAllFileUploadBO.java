package model.BO;

import java.sql.SQLException;
import java.util.List;

import model.Bean.FileUpload;
import model.DAO.ListAllFileUploadDAO;

public class ListAllFileUploadBO {
	private ListAllFileUploadBO() {
	}

	public static List<FileUpload> listFileUpload() throws SQLException {
		return ListAllFileUploadDAO.listFileUpload();
	}
}	
