<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.util.Iterator"%>
<%@page import="com.rail.beans.CoachDetails"%>
<jsp:useBean id="coachList" class="java.util.ArrayList" type="java.util.ArrayList" scope="request" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="IndianRed">
		</br></br>


<strong><center>COACH DETAILS</center></strong>


<%Iterator sitr=coachList.iterator();%>
<table>
				<tr>
		<th>CoachId</th>
		<br><th>CoachName</th>
		<th>Amount</th>
		<th>Station Code</th>

				</br></br>
	
				</tr>
				
			
				
				
						
						<%while(sitr.hasNext()){%>
						 
						    	<tr>
						<%CoachDetails sb2= (CoachDetails)sitr.next();%>
							<td><%=sb2.getCoachId1()%></td>
							  <td><%= sb2.getCoachName()%></td>
							<td><%= sb2.getAmount()%></td>
								<td><%= sb2.getStationCode()%></td>
						
								<tr>
						<%}%>
			
			


</table>
 <a href="Admin.jsp">back</a>
</body>
</html>