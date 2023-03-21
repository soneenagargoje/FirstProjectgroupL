package com.studentregistration;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class StudentRegistrationDetails {

	
	
	public static void  insertdata(String firstName,String lastName,String userName,String password,String city, String mailId,int mobileNumber) throws SQLException {
		
		
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
			
		
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentregistrationdetails","root","Vaibhav@999");
			PreparedStatement stmt = connection.prepareStatement("insert into registrationdetails(Firstname,Lastname,Username,Password,City,MailId,MobileNumber)values(?,?,?,?,?,?,?)");
		stmt.setString(1, firstName);
		stmt.setString(2, lastName);
		stmt.setString(3, userName);
		stmt.setString(4, password);
		stmt.setString(5, city);	
		stmt.setString(6, mailId);
		stmt.setInt(7, mobileNumber);
		
	stmt.execute();
	stmt.getResultSet();
	System.out.println("Registration completed");
		
		
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
			}
	public static void main (String[]args) throws SQLException {
		Scanner scanner =new Scanner(System.in);
		for (int i=1; i<=5;i++) {
			
			System.out.println("Enter your First Name");
			String firstName = scanner.next();
			
			System.out.println("Enter your Last Name");
			String lastName = scanner.next();
			
			System.out.println("Enter the User Name");
			String userName = scanner.next();
			
			System.out.println("Enter your Password");
			String password =scanner.next();
			
			System.out.println("Enter your City");
			String city = scanner.next();
			
			System.out.println("Enter your Mail Id");
			String mailId = scanner.next();
			
			System.out.println("Enter your Mobile Number");
			int mobileNumber = scanner.nextInt();
			
			
				insertdata(firstName,lastName,userName,password,city,mailId,mobileNumber);
			
			
		}
			
	}
		
				
	}
	
	

