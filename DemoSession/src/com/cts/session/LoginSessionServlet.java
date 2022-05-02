package com.cts.session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginSessionServlet
 */
public class LoginSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String color=request.getParameter("color");
		if(username.equals("admin") && password.equals("admin")) {
			HttpSession session=request.getSession();
			session.setAttribute("username", username);
			session.setAttribute("color", color);
			System.out.println("LoginSessionServlet Session id:"+session.getId());
			System.out.println("LoginSessionServlet Is session "+session.isNew());
			RequestDispatcher rd=request.getRequestDispatcher("dashboardsession");
			rd.forward(request, response);
		}
		else {
			response.sendRedirect("login.html");
		}
	}

}
