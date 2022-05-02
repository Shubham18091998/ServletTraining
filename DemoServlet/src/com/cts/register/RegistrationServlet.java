package com.cts.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.dao.LoginDao;
import com.cts.dao.LoginImpl;
import com.cts.dto.Login;


public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegistrationServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
		String country=request.getParameter("country");
		String gender=request.getParameter("gender");
		String language[]=request.getParameterValues("language");
		PrintWriter out=response.getWriter();
		out.println("Hi "+name);
		out.println("Address: "+address+" "+country);
		out.println("Gender: "+gender);
		for(String x:language) {
			out.print("Language: "+x+" ");
		}
		Login login=new Login(username,password);
		LoginDao loginDao=new LoginImpl();
		if(loginDao.insertRec(login)) {
			out.println("Record added in database");
		}
		else {
			out.println("Record not added in database");
		}
		
	}

}
