<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.util.Iterator"%>
<%@page import="com.rail.beans.TrainDetails"%>
<%@page import="com.rail.beans.StationDetails"%>
<%@page import="com.rail.beans.CoachDetails"%>
<jsp:useBean id="trainList" class="java.util.ArrayList" type="java.util.ArrayList" scope="request" />
<jsp:useBean id="stationList" class="java.util.ArrayList" type="java.util.ArrayList" scope="request" />
<jsp:useBean id="coachList" class="java.util.ArrayList" type="java.util.ArrayList" scope="request" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body bgcolor="DarkSalmon">
<form action="InsertController" method="post"> 
<img src="rt.jpg"  width="800"  height ="400">
<br>
<br>

<strong>BOOK TICKET</strong>
<table>

<%Iterator sitr=trainList.iterator();%>
				<tr>
					<td><strong>Train Name</strong></td>
					<td><select name="trainName">
						<option>--Select an option--</option>
						<%while(sitr.hasNext()){%>
						<%TrainDetails db2= (TrainDetails)sitr.next();%>
						<option value="<%= db2.getTrainNo()%>">
							 <%=db2.getTrainName()%> </option>
						<%}%>
					</select></td>
				</tr>
				
				
				
				
<%Iterator titr=stationList.iterator();%>
				<tr>
					<td><strong>Station Name</strong></td>
					<td><select name="stationName">
						<option>--Select an option--</option>
						<%while(titr.hasNext()){%>
						<%StationDetails db3= (StationDetails)titr.next();%>
						<option value="<%= db3.getStationCode()%>">
							 <%=db3.getStationname()%> </option>
						<%}%>
					</select></td>
				</tr>
				
				
			<tr>
					<td><strong>Ticket Date</strong></td>
					<td><input type="text" name="date1" value=""></td>
				</tr>
				


<tr>
					<td><strong>No. of 1-way Tickets</strong></td>
					<td><input type="text" name="oneway" value=""></td>
				</tr>


		<tr>
					<td ><strong>No. of return Tickets</strong></td>
					<td><input type="text" name="returnticket" value=""></td>
				</tr>
				

	<%Iterator citr=coachList.iterator();%>
				<tr>
					<td><strong>coach<strong></td>
					<td><select name="coachName">
						<option>--Select an option--</option>
						<%while(citr.hasNext()){%>
						<%CoachDetails db4= (CoachDetails)citr.next();%>
						<option value="<%= db4.getCoachId1()%>">
							 <%=db4.getCoachName()%> </option>
						<%}%>
					</select></td>
				</tr>
				
		</table>
		 <a href="succ.jsp">Submit</a><br>
                            
           <br>           
				 <a href="Admin.jsp">Back</a><br>
				 <br>
				 
				 <a href="counter.jsp"> go back for user</a>


</body>
  
</html>