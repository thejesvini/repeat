package com.test;
import static org.junit.Assert.*;
import java.sql.SQLException;

import org.junit.Test;

import com.rail.beans.Login;
import com.rail.daoimplementations.LoginDaoImplementation;



public class LoginTest {
	String userName="counterperson";
	String password="upasana";

@Test
	public void validateUser() throws ClassNotFoundException, SQLException
	{
	Login lb=new Login();
	lb.setUsername(userName);
	lb.setPassword(password);

	LoginDaoImplementation ldi=new LoginDaoImplementation();

	String role=ldi.validateUser(lb);
	assertEquals("counterperson",role);
	System.out.println("successfull");
	}


	}


