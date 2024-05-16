package proj009lib2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadBooks")
public class ReadBooks extends HttpServlet {
	
	DatabaseCRUD crud = new DatabaseCRUD();
	
	protected void processRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html:charset=UTF-8");
	}
	
	@Override protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	}
	
	@Override protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
		processRequest(req, res);

		crud.showBooks();
	}

}
