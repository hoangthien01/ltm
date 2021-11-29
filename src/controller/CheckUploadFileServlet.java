package controller;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import model.BO.InsertFileUploadBO;
import model.BO.UpdateFileUploadBO;
import model.Bean.Account;

@WebServlet("/CheckUploadFileServlet")
@MultipartConfig
public class CheckUploadFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CheckUploadFileServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.getRequestDispatcher("Result.jsp").include(request, response);
		
		Account a = (Account) request.getSession().getAttribute("account");
		Part part = request.getPart("myFile");
		
		String username = a.getUsername();
		String fileName = extractFileName(part);
		String status = "Processing";
		fileName = new File(fileName).getName();
		String path = this.getFolderUpload().getAbsolutePath() + File.separator + fileName;
		
		try {
			InsertFileUploadBO.insertFile(path, fileName, username, status);
			part.write(path);
			status = "Sucessfully";
		} catch (IOException | SQLException e) {
			status = "Failed";
			e.printStackTrace();
		} finally {
			try {
				UpdateFileUploadBO.updateFileUpload(path, status);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	private String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] items = contentDisp.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length() - 1);
			}
		}
		return "";
	}

	private File getFolderUpload() {
		File folderUpload = new File("D:\\FileUpload");
		if (!folderUpload.exists()) {
			folderUpload.mkdirs();
		}
		return folderUpload;
	}

}
