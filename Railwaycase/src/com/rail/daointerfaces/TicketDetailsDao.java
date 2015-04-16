package com.rail.daointerfaces;

import java.sql.SQLException;


import java.util.ArrayList;

import com.rail.beans.TicketDetails;

public interface TicketDetailsDao {

	public abstract void validateTicketDetails(TicketDetails ticketInfo) throws ClassNotFoundException, SQLException;
	public abstract ArrayList<TicketDetails> getTicketDetails() throws ClassNotFoundException, SQLException;
	public abstract ArrayList<TicketDetails> getTicketDetails1(String coach) throws ClassNotFoundException, SQLException;

}
