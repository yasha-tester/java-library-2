/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj009lib2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author yasha-user
 */

@WebServlet("/EditBook")
public class EditBook extends HttpServlet {
    
    DatabaseCRUD crud = new DatabaseCRUD();
        
	protected void processRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html:charset=UTF-8");
	}
	
	@Override protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	}
        
        	@Override protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
		processRequest(req, res);

                String title = req.getParameter("title");
		String author = req.getParameter("author");
                String editedTitle = req.getParameter("editedTitle");
                String editedAuthor = req.getParameter("editedAuthor");
                
		crud.dbBookEdit(title, author, editedTitle, editedAuthor);
	}
}
