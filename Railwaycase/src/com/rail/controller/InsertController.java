package com.rail.controller;



import java.io.IOException;


import java.sql.SQLException;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;






import com.rail.beans.TicketDetails;
import com.rail.servicefactory.ServiceFactory;

import com.rail.services.TrainDetailsService;


public class InsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InsertController() {
        super();

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html;charset=UTF-8");

		String Way;
		
		String date1=request.getParameter("date1");
		
		String way=request.getParameter("trainName");
		int trainNo=Integer.parseInt(way);
		
	
		
		 Way=request.getParameter("oneway");
		int oneWayTicket=Integer.parseInt(Way);
		
		Way=request.getParameter("returnticket");
		int returnTicket=Integer.parseInt(Way);
		
		way=request.getParameter("coachName");
		int coachId=Integer.parseInt(way);
		
		
		
		
		TicketDetails ticketinfo=new TicketDetails();
		ticketinfo.setTrainNo(trainNo);
		ticketinfo.setOnewayTicket(oneWayTicket);
		ticketinfo.setReturnTicket(returnTicket);
		ticketinfo.setCoachId(coachId);
		ticketinfo.setDate1(date1);
		
		
		TrainDetailsService ticketService = ServiceFactory.insertTicketDetails();
		
		
      
        	  try {
				 ticketService.insertTicketDetails(ticketinfo);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		 
              
      

	
	}
}