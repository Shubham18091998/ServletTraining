package com.cts.dao;

import java.util.ArrayList;

import com.cts.dto.User;

public interface UserDao {
	public boolean addRecord(User user);
	public User getUser(String username);
	public boolean updateRecord(User user);
	public boolean deleteRecord(String username);
	public ArrayList<User> getAllUser();
	
}
