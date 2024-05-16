package proj009lib2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CreateBook")
public class CreateBook extends HttpServlet {
	
	DatabaseCRUD crud = new DatabaseCRUD();

	protected void processRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html:charset=UTF-8");
	}
	
	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	}
	
	@Override protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
		processRequest(req, res);
		PrintWriter out = res.getWriter();
		
		String title = req.getParameter("title");
		String author = req.getParameter("author");

		crud.dbBookAdd(title, author);
		
//		book.setTitle(title);
//		book.setAuthor(author);
		
//		connection.connect();
		
	}
}
