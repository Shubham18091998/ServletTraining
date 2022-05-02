package com.cts.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String color=request.getParameter("color");
		if(username.equals("admin") && password.equals("admin")) {
			Cookie cookie1=new Cookie("user",username);
			Cookie cookie2=new Cookie("color",color);
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			RequestDispatcher rd=request.getRequestDispatcher("dashboard");
			rd.forward(request, response);
		}
		else {
			response.sendRedirect("login.html");
		}
	}

}
