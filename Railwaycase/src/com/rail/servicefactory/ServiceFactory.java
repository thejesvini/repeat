package com.rail.servicefactory;

import com.rail.services.CoachDetailsService;
import com.rail.services.LoginService;
import com.rail.services.TicketDetailsService;
import com.rail.services.TrainDetailsService;

public class ServiceFactory {
	 private static LoginService loginService = null;
	 private static TrainDetailsService trainDetailsService=null;
	 private static TrainDetailsService insertTicketService=null;
	 private static TicketDetailsService ticketDetailsService=null;
	 private static CoachDetailsService coachDetailsService=null;

	 public static LoginService getLoginService( ){
	        if(loginService==null){
	            loginService= new LoginService( );
	        }
	        else{
	            return loginService;
	        }
	        return loginService;
	    }
	 
	 public static TrainDetailsService getTrainDetailsService( ){
	        if(trainDetailsService==null){
	        	trainDetailsService= new TrainDetailsService();
	        }
	        else{
	            return trainDetailsService;
	        }
	        return trainDetailsService;
	    }
	 
	 public static TrainDetailsService insertTicketDetails(){
	      if(insertTicketService==null){
	    	  insertTicketService= new TrainDetailsService();
	        }
	        else{
	            return insertTicketService;
	        }
	        return insertTicketService;
	    }
	 


public static TicketDetailsService getTicketDetailsService(){
	
    if(ticketDetailsService==null){
    	ticketDetailsService= new TicketDetailsService();
      }
      else{
          return ticketDetailsService;
      }
      return ticketDetailsService;
  }

public static CoachDetailsService getCoachDetailsService(){
	
    if(coachDetailsService==null){
    	coachDetailsService= new CoachDetailsService();
      }
      else{
          return coachDetailsService;
      }
      return coachDetailsService;
  }



}

