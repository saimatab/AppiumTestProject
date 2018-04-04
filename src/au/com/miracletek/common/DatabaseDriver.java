package au.com.miracletek.common;

import  java.sql.Connection;	
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;	

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Map;
import java.io.File;
public class DatabaseDriver {
	
	
	public ResultSet db(String un, String pwd, String query )throws Exception{
	
	 String dbUrl = "jdbc:mysql://bgc.db.miracletek.co:3306/bgc_qa";					

		//Database Username		
		String username =un;	
     
		//Database Password		
		String password = pwd;				

		//Query to Execute		
		String query1 =query;	
     
	    //Load mysql jdbc driver		
	    Class.forName("com.mysql.jdbc.Driver");			
	
		//Create Connection to DB		
 	Connection con = DriverManager.getConnection(dbUrl,username,password);

		//Create Statement Object		
	   Statement stmt = con.createStatement();					

		// Execute the SQL Query. Store results in ResultSet		
		ResultSet rs= stmt.executeQuery(query);	
		con.close();
		return rs;
	}
	
}
