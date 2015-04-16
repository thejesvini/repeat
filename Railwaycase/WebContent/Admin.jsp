<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Admin</title>
</head>
<body bgcolor="cyan">

<h1>Welcome Admin</h1>
 	<img src="ad.jpg" width="800" height="400">
 	
 
	<a href="book.jsp">Sale Ticket</a> 
<form action="TicketDetailsController" method="post">
<input type="submit" value="DisplayTicket"></form>
	
	<form action="CoachDetailsController" method="post">
	<input type="submit" value="Coach Details"></form>
	
	<form action="TicketDetailsController" method="post">
	<input type="submit" value="List of Travellers"></form>
	<a href="Login.jsp">Logout</a>
</body>
</html>