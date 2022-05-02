package com.cts.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DashboardSessionServlet
 */
public class DashboardSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DashboardSessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String color=request.getParameter("color");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><title>Dashboard</title></head>");
		out.println("<body bgcolor="+color+">");
		out.println("<h1>Welcome "+username+"</h1>");
		out.println("<br>");
		out.println("<a href='profilesession'>Profile</a>");
		out.println("<a href='logoutsession'>Logout</a>");
		out.println("</body>");
		out.println("</html>");
		HttpSession session=request.getSession();
		System.out.println("LoginSessionServlet Session id:"+session.getId());
		System.out.println("LoginSessionServlet Is session "+session.isNew());
	}

}
