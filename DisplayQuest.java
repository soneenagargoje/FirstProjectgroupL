package com.user.StudentRegistration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DisplayQuest {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
			Connection con= CommonConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from question");
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("Question : "+rs.getString(1));
				System.out.println("(a) : "+rs.getString(2));
				System.out.println("(b) : "+rs.getString(3));
				System.out.println("(c) : "+rs.getString(4));
				System.out.println("(d) : "+rs.getString(5));
				
			}
			con.close();
			ps.close();
			rs.close();		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	 
}
