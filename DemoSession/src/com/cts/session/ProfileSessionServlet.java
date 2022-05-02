package com.cts.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProfileSessionServlet
 */
public class ProfileSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileSessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		//String username=request.getParameter("username");
		HttpSession session=request.getSession(false);//If session is in memory it will return session object, however it will  return null if session object is not there.
		System.out.println("LoginSessionServlet Session id:"+session.getId());
		System.out.println("LoginSessionServlet Is session "+session.isNew());
		String username=null;
		String color=null;
		
		if(session!=null) {
			username=(String)session.getAttribute("user");
			color=(String)session.getAttribute("color");
		}
		out.println("<html>");
		out.println("<head><title>Profile</title></head>");
		out.println("<body bgcolor="+color+">");
		out.println("<h1>Profile</h1><br>");
		out.println("<h2>Hi "+username+"</h2>");
		out.println("<a href='logoutsession'>Logout</a>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
