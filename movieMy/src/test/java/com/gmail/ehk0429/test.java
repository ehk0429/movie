package com.gmail.ehk0429;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class test {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	
	private static final String URL = "jdbc:mysql://localhost:3306/new?useSSL=false";
	
	private static final String USER = "root";
	
	private static final String PW = "0000";
	
	@Test
	public void testConnect() throws Exception{
		Class.forName(DRIVER);
		try(Connection con = DriverManager.getConnection(URL,USER,PW)) {
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}	}
}
