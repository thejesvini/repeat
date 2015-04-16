<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.util.Iterator"%>
<%@page import="com.rail.beans.TicketDetails"%>
<jsp:useBean id="ticketList" class="java.util.ArrayList" type="java.util.ArrayList" scope="request" />
<jsp:useBean id="ticketList1" class="java.util.ArrayList" type="java.util.ArrayList" scope="request" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="SandyBrown">
		</br></br>

<img src="i.jpg" width="800" height="300">
<br>
<br>
<br>
<strong><center>TICKET DETAILS</center></strong>
<br>


<br>
<%Iterator sitr=ticketList.iterator();%>
<table>
				<tr>
		<th>Ticket Id</th>
		<th>One Way Ticket</th>
		<th>Return Ticket</th>
		<th>OneWay Amount</th>
		<th>Return Amount</th>
       <th>Total Amount</th>
       <th>Date</th>
       <th>Train No.</th>
       <th>CoachId</th>
				</br></br>
	
				</tr>
				
			
				
				
						
						<%while(sitr.hasNext()){%>
						 
						    	<tr>
						<%TicketDetails sb2= (TicketDetails)sitr.next();%>
							<td><%=sb2.getTicketId()%></td>
							  <td><%= sb2.getOnewayTicket()%></td>
							<td><%= sb2.getReturnTicket()%></td>
								<td><%= sb2.getAmountOne()%></td>
									<td><%= sb2.getAmountReturn()%></td>
							<td><%= sb2.getAmount()%></td>
						<td><%= sb2.getDate1()%></td>
						<td><%= sb2.getTrainNo()%></td>
									<td><%= sb2.getCoachId()%></td>
								<tr>
						<%}%>
			
			

</table>



			  <form action="TicketDetailsController" method="post"> <br/>

<%-- <table>
<tr>  
                            <td><b>coachId</b></td>
                            <td><input type="text" name="coach"> <br/></td>  
</tr>
			
 <tr>  
                            <td><form action="TicketDetailsController" method="post"><input type="submit" value="Submit"></form></td> </br>
                            <td><input type="reset" name="Reset"> <br/></td>  
                            </tr>
</table>



<%Iterator sitr1=ticketList1.iterator();%>
<table>
				<tr>
		<th>Ticket Id</th>
		<th>One Way Ticket</th>
		<th>Return Ticket</th>
		<th>OneWay Amount</th>
		<th>Return Amount</th>
       <th>Total Amount</th>
       <th>Date</th>
       <th>Train No.</th>
       <th>CoachId</th>
				</br></br>
	
				</tr>
				
			
				
				
						
						<%while(sitr.hasNext()){%>
						 
						    	<tr>
						<%TicketDetails sb1= (TicketDetails)sitr1.next();%>
							<td><%=sb1.getTicketId()%></td>
							  <td><%= sb1.getOnewayTicket()%></td>
							<td><%= sb1.getReturnTicket()%></td>
								<td><%= sb1.getAmountOne()%></td>
									<td><%= sb1.getAmountReturn()%></td>
							<td><%= sb1.getAmount()%></td>
						<td><%= sb1.getDate1()%></td>
						<td><%= sb1.getTrainNo()%></td>
									<td><%= sb1.getCoachId()%></td>
								<tr>
						<%}%>
			
			

</table> --%>








<a href="Admin.jsp">back</a><br>
<br>
<a href="counter.jsp"> go back for user</a>
</body>
</html>