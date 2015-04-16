package com.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import org.hamcrest.Matcher;
import org.junit.Test;

import com.rail.beans.TicketDetails;
import com.rail.daoimplementations.TicketDetailsDaoImplementation;

public class Tickettest
{

@Test
public void testgetTicketDetails() throws ClassNotFoundException, SQLException
{
TicketDetails td=new TicketDetails();


TicketDetailsDaoImplementation ldi=new TicketDetailsDaoImplementation();

ArrayList<TicketDetails> al=ldi.getTicketDetails();
td=al.get(1);
assertEquals(3,td.getTicketId());


}
}