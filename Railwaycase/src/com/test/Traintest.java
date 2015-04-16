


package com.test;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.rail.beans.TicketDetails;
import com.rail.beans.TrainDetails;

import com.rail.daoimplementations.TrainsDetailsDaoImplementation;
import com.rail.services.TrainDetailsService;


public class Traintest 
{
	
	
		
	@Test
		public void testGetTrainList() throws ClassNotFoundException, SQLException
		{
	       TrainDetails t=new TrainDetails();
	      
		 
		TrainsDetailsDaoImplementation ld=new TrainsDetailsDaoImplementation();

		ArrayList<TrainDetails> al=ld.getTrainList();
		t=al.get(2);
		assertEquals("udyan exp",t.getTrainName());


		

	
	
		
	}
}
		


		