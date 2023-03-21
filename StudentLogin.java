package com.studentlogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentLogin {

	
	private static final int Id = 0;
	public static void loginDetails(int Id) {
		
		try {
				Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = CommonConnection.getConnection();
			
			PreparedStatement preparedStatement =connection.prepareStatement("select * from registrationdetails where Id = ? ");
			
			
			preparedStatement.setInt(1, Id);
			
			
			ResultSet resultSet = preparedStatement.executeQuery();

			
			
			while (resultSet.next()) {
				System.out.println("FirstName>>" +resultSet.getString(1));
				System.out.println("LastName>>" +resultSet.getString(2));
				System.out.println("city>>" +resultSet.getString(5));
				System.out.println("mailId>>"+resultSet.getString(6));
				System.out.println("MobileNumber>>" +resultSet.getString(7));
				
			}
			
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public static void main(String[]args)  {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter your username");
		String userName = scanner.next();
		
		System.out.println("enter your password");
		String Password = scanner.next();
		
		loginDetails( Id);
		
		
	}
	
	
}
