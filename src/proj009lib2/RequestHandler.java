package proj009lib2;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.*;

@WebServlet("/RequestHandler")
public class RequestHandler extends HttpServlet {

public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	res.setContentType("text/html");
	PrintWriter pw = res.getWriter();
	pw.println("<h2> hello library servlet </h2>");
	System.out.println("in service");
}
}
