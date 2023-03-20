package Project.Registration;

public class RegistrationMainMethod {

	public static void main(String[] args) {
		Registration re = new Registration();
		RegistrationMethod rm = new RegistrationMethod();
		re.setFirstName("sonee");
		re.setLastName("nagargoje");
		re.setUserName("sonee");
		re.setPassWord("sone@123");
		re.setCity("Beed");
		re.setEmailId("sonee123@gmail.com");
		re.setMobileNumber("2589631");
		if(rm.insertRegistration(re)>0)
		{
			System.out.println("Your Registration is success");
		}
		
	}

}
