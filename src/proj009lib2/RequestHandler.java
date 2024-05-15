package proj009lib2;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import java.io.*;

@WebServlet("RequestHandler")
public class RequestHandler implements Servlet {
	
ServletConfig config = null;
public void init(ServletConfig sc) {
	config = sc;
	System.out.println("in init");
	
}

public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	res.setContentType("text/html");
	PrintWriter pw = res.getWriter();
	pw.println("<h2> hello library servlet </h2>");
	System.out.println("in service");
}

public void destroy() {
	System.out.println("in destroy");
}

public ServletConfig getServletConfig() {
	return config;
}

@Override
public String getServletInfo() {
	// TODO Auto-generated method stub
	return null;
}
}
