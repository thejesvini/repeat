package com.rail.controller;



import java.io.IOException;


import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.rail.beans.Login;
import com.rail.servicefactory.ServiceFactory;
import com.rail.services.LoginService;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html;charset=UTF-8");


		
		String userName=request.getParameter("username");

		String password=request.getParameter("password");
		
		String role="";
		
		Login logininfo=new Login();
		logininfo.setPassword(password);
		logininfo.setUsername(userName);
		
		LoginService loginService = ServiceFactory.getLoginService();
		
		
      
        	  try {
				role = loginService.validateUser(logininfo);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		 
              if( role.equalsIgnoreCase("admin"))
             {
            	  RequestDispatcher rd=request.getRequestDispatcher("Admin.jsp");
            			  rd.forward(request, response);
            }
              else
              {
            	  RequestDispatcher rd=request.getRequestDispatcher("counter.jsp");
    			  rd.forward(request, response);
                }
              }
      

	
	
}
	
    
	
	
	



