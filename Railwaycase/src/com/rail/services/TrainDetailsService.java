package com.rail.services;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;

import com.rail.beans.CoachDetails;
import com.rail.beans.StationDetails;
import com.rail.beans.TicketDetails;
import com.rail.beans.TrainDetails;
import com.rail.daofactory.DaoFactory;
import com.rail.daointerfaces.LoginDao;
import com.rail.daointerfaces.TicketDetailsDao;
import com.rail.daointerfaces.TrainsDetailsDao;

public class TrainDetailsService {
	public static Hashtable validateTrainDetails()throws ClassNotFoundException,SQLException
	{
		TrainsDetailsDao trainDetailsDao=DaoFactory.getTrainDetailsService();
		//return  trainDetailsDao.validateTrainDetails();
		
		
		Hashtable ht= new Hashtable();
		try {
			ArrayList<TrainDetails> trainList=trainDetailsDao.getTrainList();
			ArrayList<StationDetails> stationList=trainDetailsDao.getStationList();
			ArrayList<CoachDetails> coachList=trainDetailsDao.getCoachList();
			
			System.out.println("deptlist"+trainList.size());
			System.out.println("categoryList"+stationList.size());
			System.out.println("subcategoryList"+coachList.size());
			
			ht.put("trainList", trainList);
			ht.put("stationList", stationList);
			ht.put("coachList", coachList);

		} 
		catch (SQLException e) {
			e.printStackTrace();
		}		
		return ht;		
		}
	
	
	public void insertTicketDetails(TicketDetails trainInfo)throws ClassNotFoundException,SQLException{
		TicketDetailsDao ticketDao=DaoFactory.getTicketDetailsService();
		  ticketDao.validateTicketDetails(trainInfo);
	}
	
	
	
}
