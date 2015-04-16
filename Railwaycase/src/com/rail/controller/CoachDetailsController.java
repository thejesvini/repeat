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

import com.rail.beans.CoachDetails;

import com.rail.servicefactory.ServiceFactory;
import com.rail.services.CoachDetailsService;



public class CoachDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CoachDetailsController() {
        super();

    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html;charset=UTF-8");
		 ArrayList<CoachDetails> coachList = new ArrayList<CoachDetails>();
	   
	    
		 CoachDetailsService coachDetailsService = ServiceFactory.getCoachDetailsService();
		
		RequestDispatcher rd=null;

        	 
        		  try {
        			  coachList = coachDetailsService.coachService();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		 
        	
        	 
        	 
        	 Iterator<CoachDetails> itr=coachList.iterator();
        	 while(itr.hasNext()){
        		 CoachDetails t=(CoachDetails)itr.next();
        		 /*System.out.println(t.getTicketId());
        		 System.out.println(t.getOnewayTicket());
        		 System.out.println(t.getReturnTicket());
        		 System.out.println(t.getAmount());
        		 System.out.println(t.getDate1());
        		 System.out.println(t.getTrainNo());
        		 System.out.println(t.getCoachId());
        	 */
        	 }
        	  
        	
        	 	  request.setAttribute("coachList", coachList);
        	
        			  
                rd=getServletContext().getRequestDispatcher("/CoachDetails.jsp");
      			rd.forward(request, response);
        	 }	
			
		
               
      
	
}
