<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>JSP Page</title>
 </head>
 <body>
 <h1>Login Page</h1> 
 <center> 
 <h2>SignIn Details</h2> 
 <body background="login.jpg" width="115" height="100">
 <!-- <img src="D:\Railway\Railwaycase\login.jpg" width="115" height="100"/> -->
<form action="LoginController" method="post"> <br/>

<table>
<tr>  
                            <td><b>Username:</b></td>
                            <td><input type="text" name="username"> <br/></td>  
</tr>
                         <tr>  
                            <td><b>Password:</b></td>
                            <td><input type="password" name="password"> <br/></td>  
                            </tr>
                      <tr>  
                            <td><input type="submit" value="Submit"></td> </br>
                            <td><input type="reset" name="Reset"> <br/></td>  
                            </tr>
</table>

 </form> </center>
 </body> 
</html>