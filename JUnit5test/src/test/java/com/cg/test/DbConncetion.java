package com.cg.test;

import java.sql.*;

public class DbConncetion {
	
	public Connection getConn()
	{
		Connection con = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
