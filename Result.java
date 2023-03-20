package Project.Registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Project.Project.MyConnection;

public class Result {
	
	public void  updateResult(String a , int b)
	{
		Connection con =MyConnection.getMyConnection();
		PreparedStatement ptst = null;
		String sql = "update questions set eans = ? where id=?";
		try {
			ptst = con.prepareStatement(sql);
			ptst.setString(1 , a);
			ptst.setInt(2 , b);
			ptst.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	public void  updateResultInRegistration(int a , String  b)
	{
		Connection con =MyConnection.getMyConnection();
		PreparedStatement ptst = null;
		String sql = "update registrationForm set result = ? where MobileNumber=?";
		try {
			ptst = con.prepareStatement(sql);
			ptst.setInt(1 , a);
			ptst.setString(2 , b);
			ptst.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public List<Registration> allResult()
	{
		
	Registration reg = null ;
		List<Registration> list = new ArrayList();
		Connection con = MyConnection.getMyConnection();
		PreparedStatement ptst = null;
		ResultSet rs = null;
		String sql = "select * from RegistrationForm order by result desc";
		try {
			ptst = con.prepareStatement(sql);
			rs=ptst.executeQuery();
			while(rs.next())
			{
				reg=new Registration();
				reg.setFirstName(rs.getString("FirstName"));
				reg.setLastName(rs.getString("LastName"));
				reg.setUserName(rs.getString("UserName"));
				reg.setPassWord(rs.getString("UserPassWord"));
				reg.setCity(rs.getString("City"));
				reg.setEmailId(rs.getString("emailId"));
				reg.setMobileNumber(rs.getString("MobileNumber"));
				reg.setResult(rs.getInt("result"));
				list.add(reg);
				
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return list;
		}	

}
