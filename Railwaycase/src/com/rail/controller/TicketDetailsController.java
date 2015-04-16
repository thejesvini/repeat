package com.rail.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;





import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;














import com.rail.beans.TicketDetails;

import com.rail.servicefactory.ServiceFactory;
import com.rail.services.TicketDetailsService;


public class TicketDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TicketDetailsController() {
        super();

    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html;charset=UTF-8");
		 ArrayList<TicketDetails> ticketList = new ArrayList<TicketDetails>();
	   
		 ArrayList<TicketDetails> ticketList1 = new ArrayList<TicketDetails>();
	    TicketDetailsService ticketDetailsService = ServiceFactory.getTicketDetailsService();
		
		RequestDispatcher rd=null;

        	 
        		  try {
					ticketList = ticketDetailsService.ticketService();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		 
        	
        	 
        	 
        	 Iterator<TicketDetails> itr=ticketList.iterator();
        	 while(itr.hasNext()){
        		 TicketDetails t=(TicketDetails)itr.next();
        		 /*System.out.println(t.getTicketId());
        		 System.out.println(t.getOnewayTicket());
        		 System.out.println(t.getReturnTicket());
        		 System.out.println(t.getAmount());
        		 System.out.println(t.getDate1());
        		 System.out.println(t.getTrainNo());
        		 System.out.println(t.getCoachId());
        	 */
        	 }
        	  
        	 
        	 
        	
        	 	  request.setAttribute("ticketList", ticketList);
        	String coach=request.getParameter("coach");
        	//int coach1=Integer.parseInt(coach);
        	 	  try {
  					ticketList1 = ticketDetailsService.ticketService1(coach);
  				} catch (ClassNotFoundException e) {
  					// TODO Auto-generated catch block
  					e.printStackTrace();
  				} catch (SQLException e) {
  					// TODO Auto-generated catch block
  					e.printStackTrace();
  				}
        	 	 request.setAttribute("ticketList1", ticketList1);
                rd=getServletContext().getRequestDispatcher("/display.jsp");
      			rd.forward(request, response);
        	 }	
			
		
               
      
	
}
