package studentManagementApp;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection con;
public static Connection createC() {
	
	
	try {
		// load the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	// create the connection
	String user="nitish";
	String password="password";
	String url="jdbc:mysql://localhost:3306/student_manage?autoReconnect=true&useSSL=false";
	con=DriverManager.getConnection(url,user,password);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return con;
}
}
