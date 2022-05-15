package com.ad.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ad.beans.Login;

// Create Dao using jdbc 
public class LoginDao {


		public Login getLogin(String un,String p) {
			
			Login b1 = new Login();

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");	
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","8160");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("Select * from login where userName = '" + un +"' and password = '"+ p +"' ");
				if(rs.next())
				{
					b1.setUserId(rs.getInt("userId"));
					b1.setUsername(rs.getString("userName"));
					b1.setPassword(rs.getString("password"));
				}
				
			} 
			catch (Exception e) {
				System.out.println(e);
			}
			return b1;
			
		}

			
	}
	
	
	
	
