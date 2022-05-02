package com.cts.config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServletConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DemoServletConfig() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		ServletConfig config=getServletConfig();
		String filename=config.getInitParameter("filename");
		BufferedReader br=new BufferedReader(new FileReader(filename));
		String rec=null;
		try {
		while((rec=br.readLine())!=null) {
			out.println(rec+"<br>");
		}
		}finally {
			br.close();
		}
	}

}
