package com.test;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import com.rail.beans.CoachDetails;
import com.rail.beans.TicketDetails;
import com.rail.daoimplementations.CoachDetailsDaoImplementation;
import com.rail.daoimplementations.TicketDetailsDaoImplementation;

public class coachTest {
	
@Test
	public void testGetTicketDetails() throws ClassNotFoundException, SQLException
	{
	TicketDetails td=new TicketDetails();


	TicketDetailsDaoImplementation ldi=new TicketDetailsDaoImplementation();

	ArrayList<TicketDetails> al=ldi.getTicketDetails();
	td=al.get(1);
	assertEquals(12,td.getCoachId());


	}
	}

	

