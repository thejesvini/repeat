package com.rail.daofactory;

import com.rail.daoimplementations.CoachDetailsDaoImplementation;
import com.rail.daoimplementations.LoginDaoImplementation;
import com.rail.daoimplementations.TicketDetailsDaoImplementation;
import com.rail.daoimplementations.TrainsDetailsDaoImplementation;
import com.rail.daointerfaces.CoachDetailsDao;
import com.rail.daointerfaces.LoginDao;
import com.rail.daointerfaces.TicketDetailsDao;
import com.rail.daointerfaces.TrainsDetailsDao;

public class DaoFactory {
	private static LoginDao loginDao=null;
	private static TrainsDetailsDao trainsDetailsDao=null;
	private static TicketDetailsDao ticketDetailsDao=null;
	private static CoachDetailsDao coachDetailsDao=null;
	
	 public static LoginDao getLoginDao( ){
	        if(loginDao==null){
	            loginDao=new LoginDaoImplementation( );
	        }
	        else{
	            return loginDao;
	        }
	        return loginDao;

	    }
	 
	 public static TrainsDetailsDao getTrainDetailsService(){
	        if(trainsDetailsDao==null){
	        	trainsDetailsDao=new TrainsDetailsDaoImplementation();
	        }
	        else{
	            return trainsDetailsDao;
	        }
	        return trainsDetailsDao;

	    }
	 
	 public static TicketDetailsDao getTicketDetailsService(){
	        if(ticketDetailsDao==null){
	        	ticketDetailsDao=new TicketDetailsDaoImplementation();
	        }
	        else{
	            return ticketDetailsDao;
	        }
	        return ticketDetailsDao;

	    }


	 public static CoachDetailsDao getCoachDetailsService(){
	        if(coachDetailsDao==null){
	        	coachDetailsDao=new CoachDetailsDaoImplementation();
	        }
	        else{
	            return coachDetailsDao;
	        }
	        return coachDetailsDao;

	    }

}
