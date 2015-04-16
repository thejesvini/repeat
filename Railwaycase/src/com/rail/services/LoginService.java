package com.rail.services;


import java.sql.SQLException;

import com.rail.beans.Login;
import com.rail.daofactory.DaoFactory;
import com.rail.daointerfaces.LoginDao;

public class LoginService {
	public String validateUser(Login login)throws ClassNotFoundException,SQLException
	{
		LoginDao loginDao=DaoFactory.getLoginDao();
		return  loginDao.validateUser(login);
	}

}
