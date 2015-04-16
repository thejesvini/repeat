package com.rail.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import com.rail.beans.TicketDetails;

import com.rail.daointerfaces.TicketDetailsDao;
import com.rail.util.DBUtility;

public class TicketDetailsDaoImplementation implements TicketDetailsDao{
    static int i=1;
	public void validateTicketDetails(TicketDetails ticketInfo) throws ClassNotFoundException, SQLException{
	 ResultSet rs=null;
	 int rs1;
	 double amount=1.00,amount1,amountOne=1.00,amountReturn=1.00;
	 int ticketId;
     Connection con = DBUtility.getConnection();
     
     PreparedStatement psmt1 = con.prepareStatement("select * from coach where coach_id=?");
     int coachId=ticketInfo.getCoachId();
     psmt1.setInt(1,coachId);
     rs = psmt1.executeQuery();
      if(rs.next()){
    	  amount=rs.getDouble(3);
    	  System.out.println("amount="+amount);
      }
     
   
  PreparedStatement psmt = con.prepareStatement("insert into ticket_sold1 values(?,?,?,?,?,?,?,?,?)");
   int oneway=ticketInfo.getOnewayTicket(); 
   int returnway=ticketInfo.getReturnTicket();
   int trainNo=ticketInfo.getTrainNo();
 coachId=ticketInfo.getCoachId();
   amountOne=amount*oneway;
   amountReturn=amount*returnway;
   amount=amount*(oneway+returnway);
   System.out.println("amount="+amount);
   ticketInfo.setAmountOne(amountOne);
   ticketInfo.setAmountReturn(amountReturn);
   ticketInfo.setAmount(amount);
   amount1=ticketInfo.getAmount();
   amountOne=ticketInfo.getAmountOne();
   amountReturn=ticketInfo.getAmountReturn();
   ticketId=i++;
   ticketInfo.setTicketId(ticketId);
   ticketId=ticketInfo.getTicketId();
   //String temp="hi";
   String date1=ticketInfo.getDate1();
   
    psmt.setInt(1,ticketId); 
    psmt.setInt(2, oneway);
    psmt.setInt(3, returnway);
    psmt.setDouble(4, amountOne);
    psmt.setDouble(5, amountReturn);
    psmt.setDouble(6,amount1);
    psmt.setString(7, date1);
    psmt.setInt(8, trainNo);
    psmt.setInt(9, coachId);

    
     try{
      rs1 = psmt.executeUpdate();
     
     }
     catch(Exception e){System.out.println("Error in ResultSet");
     e.printStackTrace();}
     

    }

	
	
	public ArrayList<TicketDetails> getTicketDetails() throws SQLException, ClassNotFoundException{

		ArrayList<TicketDetails> ticketList=new ArrayList<TicketDetails>();
	     Connection con = DBUtility.getConnection();
	

		Statement stmt=con.createStatement();
		Statement stmt1=con.createStatement();
		String query="select * from ticket_sold1";

		ResultSet rs=stmt.executeQuery(query);

	       while(rs.next())
	         {
	        		TicketDetails db1=new TicketDetails();
	        		db1.setTicketId(rs.getInt(1));
	        		db1.setOnewayTicket(rs.getInt(2));
	        		db1.setReturnTicket(rs.getInt(3));
	        		db1.setAmountOne(rs.getDouble(4));
	        		db1.setAmountReturn(rs.getDouble(5));
	        		db1.setAmount(rs.getDouble(6));
	        		db1.setDate1(rs.getString(7));
	        		db1.setTrainNo(rs.getInt(8));
	        		db1.setCoachId(rs.getInt(9));
	        		
	        		ticketList.add(db1);
	    			//System.out.println(trainList);
	    			
	    	    
	         }
	      
		rs.close();
		con.close();

		return ticketList;
	}
	
	
	public ArrayList<TicketDetails> getTicketDetails1(String coach) throws SQLException, ClassNotFoundException{

		ArrayList<TicketDetails> ticketList1=new ArrayList<TicketDetails>();
	     Connection con = DBUtility.getConnection();
	

		Statement stmt=con.createStatement();
		 PreparedStatement psmt = con.prepareStatement("select * from ticket_sold1 where coach_Id=?");

		psmt.setString(1, coach);
		ResultSet rs=psmt.executeQuery();

	       while(rs.next())
	         {
	        		TicketDetails db1=new TicketDetails();
	        		db1.setTicketId(rs.getInt(1));
	        		db1.setOnewayTicket(rs.getInt(2));
	        		db1.setReturnTicket(rs.getInt(3));
	        		db1.setAmountOne(rs.getDouble(4));
	        		db1.setAmountReturn(rs.getDouble(5));
	        		db1.setAmount(rs.getDouble(6));
	        		db1.setDate1(rs.getString(7));
	        		db1.setTrainNo(rs.getInt(8));
	        		db1.setCoachId(rs.getInt(9));
	        		
	        		ticketList1.add(db1);
	    			//System.out.println(trainList);
	    			
	    	    
	         }
	      
		rs.close();
		con.close();

		return ticketList1;
	}
	
}
