package Project.Project;

import java.util.Iterator;
import java.util.Scanner;

import Project.Registration.Registration;
import Project.Registration.RegistrationMethod;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    {
       QuestionsMethods qm= new QuestionsMethods();
//    Queston q= new Queston();
//       
////       q.setQuestions("Identify modifier which can not be used for constructor ");
////       q.setA("public");
////       q.setB("protected");
////       q.setC("private");
////       q.setD("static");
////       q.setAns("d");
////      
////       if(qm.insertQuetion(q)>0) {
////    	   System.out.println("sucess");
////       }
//       
    Scanner sc = new Scanner(System.in);
//       
//       
//       if(qm.listOfQuestions() != null) {
       Iterator<Queston> iterator= qm.listOfQuestions().iterator();
       int i=1;
       while(iterator.hasNext()) {
    	   Queston q = iterator.next();
    	   System.out.println(i+")  "+q.getQuestions());
    	   System.out.println("a) "+q.getA());
    	   System.out.println("b) "+q.getB());
    	   System.out.println("c) "+q.getC());
    	   System.out.println("d) "+q.getD());
    	   
    	   System.out.println();
    	   
    	   System.out.print("Answer = ");
    	   String a=sc.next();
    	   System.out.println();
    	   System.out.println("----------------------------------------------------------------------------------------");
    	   System.out.println();
    	   i++;
       }
//       }
//       else
//    	   System.out.println("List is null");
//    	RegistrationMethod rm =new RegistrationMethod();
//    	Registration re = new Registration();
//    	re = rm.checkLogin("ssss", "pppp");
//    	
//    	System.out.println(rm.checkLogin("ssss", "pppp"));
//    	System.out.println(re.getUserName() +"  "+ re.getPassWord());
    }
}
