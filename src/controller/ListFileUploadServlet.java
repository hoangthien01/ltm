package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BO.ListFileUploadBO;
import model.Bean.Account;
import model.Bean.FileUpload;

@WebServlet("/ListFileUploadServlet")
public class ListFileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListFileUploadServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<FileUpload> files = new ArrayList<FileUpload>();
		try {
			Account a = (Account) request.getSession().getAttribute("account");
			String username = a.getUsername();
			files = ListFileUploadBO.listFileUpload(username);
			request.setAttribute("files", files);
			RequestDispatcher rdp = request.getRequestDispatcher("ListFileUpload.jsp");
			rdp.forward(request, response);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
