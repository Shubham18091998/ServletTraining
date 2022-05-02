package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.dto.Login;
import com.cts.util.JdbcConnection;

public class LoginImpl implements LoginDao{
	
	public boolean insertRec(Login login) {
		Connection con=JdbcConnection.getConnection();
		PreparedStatement pst=null;
		String query="insert into login values(?,?)";
		try {
			pst=con.prepareStatement(query);
			pst.setString(1, login.getUsername());
			pst.setString(2, login.getPassword());
			int rec=pst.executeUpdate();
			if(rec==1) {
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return false;
	}

	public boolean validateLogin(Login login) {
		Connection con=JdbcConnection.getConnection();
		PreparedStatement pst=null;
		String query="select * from login where username=? and password=?";
		try {
			pst=con.prepareStatement(query);
			pst.setString(1,login.getUsername());
			pst.setString(2, login.getPassword());
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

}
