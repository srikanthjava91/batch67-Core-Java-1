package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestEXDemo14 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("main method started !!");

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
//		Step1 : Loading the SQL Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class loaded successfully !");

//		Step2: Establish the Database Connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbdata", "root", "root");
			System.out.println("Successfully connecting to the DB !!");

//		Step3 : Create a Statement Object to communicate with DB
			st = con.createStatement();// Creates a Statement object for sending SQL statements to the database.

//		Step 4 : Create a ResultSet to Read the Data.
			String sql = "select * from student";
			rs = st.executeQuery(sql);

			while (rs.next()) {
				System.out.print(rs.getInt(1) + " ");
				System.out.print(rs.getString(2) + " ");
				System.out.print(rs.getString(3) + " ");
				System.out.print(rs.getString(4) + " ");
				System.out.println("***************************");
			}

//		Step5 : Close all the connections 

		} finally {
			rs.close();
			st.close();
			con.close();
		}

		System.out.println("main method ended");
	}
}
