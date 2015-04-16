package com.rail.services;


import java.sql.SQLException;
import java.util.ArrayList;


import com.rail.beans.TicketDetails;
import com.rail.daofactory.DaoFactory;

import com.rail.daointerfaces.TicketDetailsDao;

public class TicketDetailsService {
	public ArrayList<TicketDetails> ticketService()throws ClassNotFoundException,SQLException{
		TicketDetailsDao ticketDetailsDao=DaoFactory.getTicketDetailsService();
		return  ticketDetailsDao.getTicketDetails();
	}
	
	public ArrayList<TicketDetails> ticketService1(String coach1)throws ClassNotFoundException,SQLException{
		TicketDetailsDao ticketDetailsDao=DaoFactory.getTicketDetailsService();
		return  ticketDetailsDao.getTicketDetails1(coach1);
	}
}
