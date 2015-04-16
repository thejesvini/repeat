package com.rail.daoimplementations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.rail.beans.CoachDetails;

import com.rail.daointerfaces.CoachDetailsDao;
import com.rail.util.DBUtility;

public class CoachDetailsDaoImplementation implements CoachDetailsDao{

	
	public ArrayList<CoachDetails> getCoachDetails() throws SQLException, ClassNotFoundException{

		ArrayList<CoachDetails> coachList=new ArrayList<CoachDetails>();
	     Connection con = DBUtility.getConnection();
	

		Statement stmt=con.createStatement();
		String query="select * from coach";
		ResultSet rs=stmt.executeQuery(query);

	       while(rs.next())
	         {
	        		CoachDetails db1=new CoachDetails();
	        		db1.setCoachId1(rs.getInt(1));
	        		db1.setCoachName(rs.getString(2));
	        		db1.setAmount(rs.getDouble(3));
	        		db1.setStationCode(rs.getInt(4));
	        	
	        		
	        		coachList.add(db1);
	    			//System.out.println(trainList);
	    			
	    	    
	         }
	      
		rs.close();
		con.close();

		return coachList;
	}
	
	
}
