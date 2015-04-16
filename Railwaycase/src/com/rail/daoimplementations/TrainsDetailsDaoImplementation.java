package com.rail.daoimplementations;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;



import java.util.ArrayList;




import java.util.Hashtable;

import com.rail.beans.CoachDetails;
import com.rail.beans.StationDetails;
import com.rail.beans.TrainDetails;
import com.rail.daointerfaces.TrainsDetailsDao;
import com.rail.util.DBUtility;

public class TrainsDetailsDaoImplementation implements TrainsDetailsDao{

	
	public ArrayList<TrainDetails> getTrainList() throws SQLException, ClassNotFoundException{

		ArrayList<TrainDetails> trainList=new ArrayList<TrainDetails>();
	     Connection con = DBUtility.getConnection();
	

		Statement stmt=con.createStatement();
		String query="select * from trains";
		ResultSet rs=stmt.executeQuery(query);

	       while(rs.next())
	         {
	        		TrainDetails db1=new TrainDetails();
	        		db1.setTrainNo(rs.getInt(1));
	        		db1.setTrainName(rs.getString(2));
	        		db1.setTripsperDay(rs.getInt(3));
	        		db1.setDestination(rs.getString(4));
	    			trainList.add(db1);
	    			System.out.println(trainList);
	    			
	    	    
	         }
	      
		rs.close();
		con.close();

		return trainList;
	}
	
	public ArrayList<StationDetails> getStationList() throws SQLException, ClassNotFoundException{

		ArrayList<StationDetails> stationList=new ArrayList<StationDetails>();
	     Connection con = DBUtility.getConnection();
	

		Statement stmt=con.createStatement();
		String query="select * from stations";
		ResultSet rs=stmt.executeQuery(query);

		while(rs.next())
        {
       		StationDetails db2=new StationDetails();
       		db2.setStationCode(rs.getInt(1));
       		db2.setStationname(rs.getString(2));
       		db2.setTrainNo(rs.getInt(3));
       
       		stationList.add(db2);
   			System.out.println(stationList);
 
        }
	      
		rs.close();
		con.close();

		return stationList;
	}
	
	public ArrayList<CoachDetails> getCoachList() throws SQLException, ClassNotFoundException{

		ArrayList<CoachDetails> coachList=new ArrayList<CoachDetails>();
	     Connection con = DBUtility.getConnection();
	

		Statement stmt=con.createStatement();
		String query="select * from coach";
		ResultSet rs=stmt.executeQuery(query);

		 while(rs.next())
         {
        		CoachDetails db3=new CoachDetails();
        		db3.setCoachId1(rs.getInt(1));
        		db3.setCoachName(rs.getString(2));
        		db3.setAmount(rs.getDouble(3));
        		db3.setStationCode(rs.getInt(4));
        
        		coachList.add(db3);
    			System.out.println(coachList);
 
         }
	      
		rs.close();
		con.close();

		return coachList;
	}
	
}
