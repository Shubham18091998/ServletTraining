package com.cts.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int num1=0;
		int num2=0;
		PrintWriter out=response.getWriter();
		try {
		num1=Integer.parseInt(request.getParameter("num1"));
		num2=Integer.parseInt(request.getParameter("num2"));
		int result=num1+num2;
		out.println("Result="+result);
		}catch(NumberFormatException e) {
			out.println("Please enter numeric value only.");
		}
	}
	
}
