package com.rail.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.rail.beans.Login;
import com.rail.daointerfaces.LoginDao;
import com.rail.util.DBUtility;

public class LoginDaoImplementation implements LoginDao {
	
	public String validateUser( Login login) throws ClassNotFoundException, SQLException{
        String role = "";
        ResultSet rs=null;
        Connection con = DBUtility.getConnection();
        
       
      PreparedStatement psmt = con.prepareStatement("select * from user1 where username=? and password=?");
      String uname=login.getUsername();
     
       
      String password=login.getPassword();
       
       
       psmt.setString(1,uname);
       psmt.setString(2,password);
        try{
         rs = psmt.executeQuery();
         if(rs.next())
         {
            role=rs.getString("usertype");
            
         }
         else{
             role = "invalid";
         }
        }
        catch(Exception e){System.out.println("Error in ResultSet");
        e.printStackTrace();}
       
        return role;
      
    }


}
