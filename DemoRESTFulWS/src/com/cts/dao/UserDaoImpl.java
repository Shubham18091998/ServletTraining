package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cts.dto.User;
import com.cts.util.JdbcConnection;


public class UserDaoImpl implements UserDao{

	public boolean addRecord(User user) {
		Connection con=JdbcConnection.getConnection();
		PreparedStatement pst=null;
		String query="insert into user values(?,?)";
		try {
			pst=con.prepareStatement(query);
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			int rec=pst.executeUpdate();
			if(rec==1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public User getUser(String username) {
		Connection con=JdbcConnection.getConnection();
		PreparedStatement pst=null;
		ResultSet rs=null;
		String query="select * from user where username=?";
		try {
			pst=con.prepareStatement(query);
			pst.setString(1,username);
			rs=pst.executeQuery();
			if(rs.next()) {
				String uname=rs.getString(1);
				String password=rs.getString(2);
				User user=new User(uname,password);
				return user;
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
		return null;
	}

	public ArrayList<User> getAllUser() {
		ArrayList<User>userList=new ArrayList<User>();
		Connection con=JdbcConnection.getConnection();
		PreparedStatement pst=null;
		ResultSet rs=null;
		String query="select * from user";
		try {
			pst=con.prepareStatement(query);
			rs=pst.executeQuery();
			while(rs.next()) {
				String uname=rs.getString(1);
				String password=rs.getString(2);
				User user=new User(uname,password);
				userList.add(user);
			}
			return userList;
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public boolean updateRecord(User user) {
		Connection con=JdbcConnection.getConnection();
		PreparedStatement pst=null;
		String query="update user password=? where username=?";
		try {
			pst=con.prepareStatement(query);
			pst.setString(1, user.getPassword());
			pst.setString(2, user.getUsername());
			int rec=pst.executeUpdate();
			if(rec==1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean deleteRecord(String username) {
		Connection con=JdbcConnection.getConnection();
		PreparedStatement pst=null;
		String query="delete from user where username=?";
		try {
			pst=con.prepareStatement(query);
			pst.setString(1, username);
			int rec=pst.executeUpdate();
			if(rec==1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

}
