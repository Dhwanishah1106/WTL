package com.spring;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DatabaseConnection {
	
	private static DatabaseDetails d;
	

	public void setD(DatabaseDetails d) {
		this.d = d;
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		System.out.println(d.getName()+ d.getUser()+ d.getPassword() + d.getUrl()+" all this connection details");
		Class.forName(d.getName());
		Connection con = (Connection) DriverManager.getConnection(d.getUrl(), "root", d.getPassword());
		return con;
		
	}
	
}
