package com.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Driver {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DatabaseConnection dc = (DatabaseConnection) context.getBean("dc");
		Student s = (Student)context.getBean("student");
		Connection con = dc.getConnection();
		Statement stmt = (Statement) con.createStatement();
		String sql = "CREATE TABLE STUDENT" +
                "(rollNo INTEGER not NULL, " +
                " name VARCHAR(255), " + 
                " branch VARCHAR(255), " +  
                " PRIMARY KEY ( rollNo))"; 	
		stmt.executeUpdate(sql);
		/* INSERT INTO TABLE STUDENT AND FETCH RECORDS INTO STUDENT OBJECT AND DISPLAY*/
		sql = "INSERT INTO STUDENT " +
                "VALUES(103, 'Sumit Mittal', 'Computer')";
		stmt.executeUpdate(sql);
		System.out.println("Inserted records into the table...");

		 String sql1 = "SELECT * FROM STUDENT";
	      ResultSet rs = stmt.executeQuery(sql1);
	      //STEP 5: Extract data from result set
	      while(rs.next()){
	         //Retrieve by column name
	         int rollNo  = rs.getInt("rollNo");
	         String name = rs.getString("name");
	         String branch = rs.getString("branch");

	         //Display values
	         System.out.println("Roll No: " + rollNo);
	         System.out.println("Name: " + name);
	         System.out.println("Branch: " + branch);
	      }
	      rs.close();
	      
	}

}
