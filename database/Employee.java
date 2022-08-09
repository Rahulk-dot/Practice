package database;

import java.sql.*;

//these are the 5 steps for database connection.
//Also the jar file ojdbc6.jar is added in the project.

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//1. Load the Driver.
			//For mysql - Class.forName("com.mysql.jdbc.Driver")
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. Create a connection.
			//For mysql - Connection con = DriverManager.getConnection("jdbc:mysql://localhost
			//            :3306/Emp","root","root");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			
			//3. Create a statement.
			
			Statement stmt = con.createStatement();
			
			//4. Execute the statement.
			
			stmt.execute("insert into Emp Values(400,'Gattu',26,'Estimation Er',1000000)");
			
			//5. Close the Statement and Connection.
			
			stmt.close();con.close();
			
			
			System.out.println("Data Inserted...");
		}
		catch(Exception e) {
			
		}
	}

}
