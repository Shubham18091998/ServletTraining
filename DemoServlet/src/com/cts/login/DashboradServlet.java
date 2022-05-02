package com.cts.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
		PrintWriter out=response.getWriter();
		String user=(String)request.getAttribute("user");
		out.println("Welcome to Dashbord");
		out.println("Hi "+user);
		
		RequestDispatcher rd=request.getRequestDispatcher("footer.html");
		rd.include(request, response);
		
	}

}
