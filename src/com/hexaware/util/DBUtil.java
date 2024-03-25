package com.hexaware.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
	static Connection com;
	public static Connection getDBConn() throws SQLException {
		
		try {
			com = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaprojecttest","root","ini@007");
		}
		
		catch(SQLException se) {
			System.out.println(se);
			se.printStackTrace();
		}
		return com;
		
	}
	public static void main(String[]args) throws SQLException {
		System.out.println(getDBConn());
	}
}
