package com.cts.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.dao.LoginDao;
import com.cts.dao.LoginImpl;
import com.cts.dto.Login;

public class LoginSlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginSlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		LoginDao loginDao=new LoginImpl();
		Login login=new Login(username,password);
		if(loginDao.validateLogin(login)) {
			RequestDispatcher rd=request.getRequestDispatcher("dashboard");
			request.setAttribute("user",username);
			rd.forward(request, response);
			out.println("<html>");
			out.println("<body>");
			out.println("<h2>Login successful</h2>");
			out.println("<h3>Hi "+username+" </h3>");
			out.println("</body>");
			out.println("</html>");
		}
		else {
			out.println("<html>");
			out.println("<body>");
			out.println("<h2>Invalid username or password</h2>");
			out.println("</body>");
			out.println("</html>");
		}
		/*if(username.equals("admin") && password.equals("admin")) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h2>Login successful</h2>");
			out.println("<h3>Hi "+username+" </h3>");
			out.println("</body>");
			out.println("</html>");
		}
		else {
			out.println("<html>");
			out.println("<body>");
			out.println("<h2>Invalid username or password</h2>");
			out.println("</body>");
			out.println("</html>");
		}*/
	}

}
