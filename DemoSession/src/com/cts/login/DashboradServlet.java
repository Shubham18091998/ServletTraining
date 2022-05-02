package com.cts.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DashboradServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public DashboradServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String color=request.getParameter("color");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><title>Dashboard</title></head>");
		out.println("<body bgcolor="+color+">");
		out.println("<h1>Welcome "+username+"</h1>");
		out.println("<br>");
		out.println("<a href='profile'>Profile</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
