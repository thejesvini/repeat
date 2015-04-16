package com.rail.daointerfaces;

import java.sql.SQLException;

import com.rail.beans.Login;

public interface LoginDao {
	public abstract String validateUser(Login login ) throws ClassNotFoundException, SQLException;
	}
