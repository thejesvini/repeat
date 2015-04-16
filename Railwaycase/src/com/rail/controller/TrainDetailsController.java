package com.rail.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;




import java.util.Hashtable;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;











import com.rail.beans.CoachDetails;
import com.rail.beans.StationDetails;
import com.rail.beans.TrainDetails;
import com.rail.servicefactory.ServiceFactory;
import com.rail.services.TrainDetailsService;


public class TrainDetailsController<E> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TrainDetailsController() {
        super();

    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html;charset=UTF-8");
		 ArrayList<TrainDetails> trainList = new ArrayList<TrainDetails>();
	     ArrayList<StationDetails> stationList=new ArrayList<StationDetails>();
	     ArrayList<CoachDetails> coachList=new ArrayList<CoachDetails>();
	    
	    TrainDetailsService trainsDetailsService = ServiceFactory.getTrainDetailsService();
		
		RequestDispatcher rd=null;

        	  try {
        		  Hashtable ht= trainsDetailsService.validateTrainDetails();
        		 
        		  
        		  trainList = (ArrayList<TrainDetails>)ht.get("trainList");
        		  stationList=(ArrayList<StationDetails>)ht.get("stationList");
        	 coachList=(ArrayList<CoachDetails>)ht.get("coachList");
        	 
        	 
        	 Iterator<TrainDetails> itr=trainList.iterator();
        	 while(itr.hasNext()){
        		 TrainDetails t=(TrainDetails)itr.next();
        		 System.out.println(t.getDestination());
        		 System.out.println(t.getTrainName());
        		 System.out.println(t.getTrainNo());
        		 System.out.println(t.getTripsperDay());
        				 
        	 }
      
        			
        	 	  request.setAttribute("trainList", trainList);
        			request.setAttribute("stationList", stationList);
        			request.setAttribute("coachList", coachList);
        			  
                	rd=getServletContext().getRequestDispatcher("/bookticket1.jsp");
      			rd.forward(request, response);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		 
               
       

        	  }
      
	}

      
       
   
              
      


	
    
	
	
	



