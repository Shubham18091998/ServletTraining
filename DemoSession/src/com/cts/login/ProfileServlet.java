package com.cts.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProfileServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		//String username=request.getParameter("username");
		Cookie cookieArr[]=request.getCookies();
		String username=null;
		String color=null;
		for(Cookie c:cookieArr) {
			String key=c.getName();
			if(key.equals("user")) {
				username=c.getValue();
			}
			if(key.equals("color")) {
				color=c.getValue();
			}
		}
		out.println("<html>");
		out.println("<head><title>Profile</title></head>");
		out.println("<body bgcolor="+color+">");
		out.println("<h1>Profile</h1><br>");
		out.println("<h2>Hi "+username+"</h2>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
