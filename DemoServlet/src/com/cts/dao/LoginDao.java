package com.cts.dao;

import com.cts.dto.Login;

public interface LoginDao {
	public boolean insertRec(Login login);
	public boolean validateLogin(Login login);
}
