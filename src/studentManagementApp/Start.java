package studentManagementApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;

public class Start {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to student Management app");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       while(true) {
    	   System.out.println("PRESS 1 to ADD Student");
    	   System.out.println("PRESS 2 to Delete student");
    	   System.out.println("PRESS 3 to display student");
    	   System.out.println("PRESS 4 to update student");
    	   System.out.println("PRESS 5 to exit app");
    	   //taking input from user
    	   int c=Integer.parseInt(br.readLine());
    	   
    	   if(c==1) {
    		   //add student
    		   System.out.println("Enter user name: ");
    		   String name=br.readLine();
    		   
    		   System.out.println("Enter user phone: ");
    		   String phone=br.readLine();
    		   
    		   System.out.println("Enter user city");
    		   String city=br.readLine();
    		   
    		   //create student object to store student
    		   Student st=new Student(name,phone,city);
    		   boolean answer=	StudentDao.insertStudentToDB(st);
    		   
    		   if(answer) {
    			   System.out.println("Student is added succesfully...");
    			   
    		   }
    		   else {
    			   System.out.println("Something went wrong try again...");
    		   }
    	   }
    	   
    	   else if(c==2) {
    		   //delete student
    		   System.out.println("Enter student id to delete");
    		   int userId=Integer.parseInt(br.readLine());
    		   boolean f=StudentDao.deleteStudent(userId);
    		   if(f)
    			   System.out.println("Deleted...");
    		   else
    			   System.out.println("Something went wrong...");
    	   }
    	   else if(c==3) {
    		   //display student
    		   StudentDao.showAllStudent();
    		   
    	   }
    	   else if(c==4) {
    		   //update student
    		   System.out.println("Enter student id to update ");
    		   int userId=Integer.parseInt(br.readLine());
    		   //enter updated details
    		   System.out.println("Enter user name: ");
    		   String name=br.readLine();
    		   
    		   System.out.println("Enter user phone: ");
    		   String phone=br.readLine();
    		   
    		   System.out.println("Enter user city");
    		   String city=br.readLine();
    		   //create student object to pass
    		   Student st=new Student(name,phone,city);
    		   boolean update=StudentDao.updateStudent(st,userId);
    		   if(update)
    			   System.out.println("Student Information updated");
    		   else
    			   System.out.println("Something went wrong");
    	   }
    	   
    	   else if(c==5){
    		   //EXIT
    		   break;
    	   }
    	   else {
    		   
    	   }
       }
       System.out.println("Thankyou for using my application");
       System.out.println("BYE bye");
	}

}
