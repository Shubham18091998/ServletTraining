package com.cts.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	public static Connection getConnection() {
		//Load the Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//Create connection
		String url="jdbc:mysql://localhost:3306/emp";
		String user="root";
		String password="root";
		Connection con=null;
		try {
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
