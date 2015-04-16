<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.util.Iterator"%>
<%@page import="com.rail.beans.TicketDetails"%>
<jsp:useBean id="ticketList" class="java.util.ArrayList" type="java.util.ArrayList" scope="request" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body bgcolor="turquoise">
<img src="s.jpg" width="800" height="500">


<%Iterator sitr=ticketList.iterator();%>
<table>
				<tr>
		
				<td><strong><center>TICKET DETAILS</center></strong></td>
				</br></br>
	
				</tr>
				
			
				
				
						
						<%while(sitr.hasNext()){%>
						    </br>
						    	<tr>
						<%TicketDetails sb2= (TicketDetails)sitr.next();%>
							<td><%=sb2.getTicketId()%></td>
							<td><%= sb2.getOnewayTicket()%></td>
							<td><%= sb2.getReturnTicket()%></td>
							<td><%= sb2.getAmount()%></td>
							<td><%= sb2.getDate1()%></td>
							<td><%= sb2.getTrainNo()%></td>
							<td><%= sb2.getCoachId()%></td>
							
								</tr>
						<%}%>
			  
			  
			  <form action="TicketDetailsController" method="post"> <br/>

<table>
<tr>  
                            <td><b>coachId</b></td>
                            <td><input type="text" name="coach"> <br/></td>  
</tr>
			
 <tr>  
                            <td><form action="TicketDetailsController" method="post"><input type="submit" value="Submit"></form></td> </br>
                            <td><input type="reset" name="Reset"> <br/></td>  
                            </tr>
</table>
</body>
</html>