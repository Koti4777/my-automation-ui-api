package com.mycompany.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DataBaseConnector {
	static String connectionUrl = "jdbc:oracle:thin:@<host>:<port>/<sid>";
	static String username = "<username>";
	static String password = "<password>";
	static Connection connection;
	public static ResultSet resultSet;
	public static String resultValue;

public static String executeSQLQuery (File query) throws FileNotFoundException{
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	try {
		connection = DriverManager.getConnection(connectionUrl,username,password);
		if (connection!=null) {
			System.out.println("Connected to database");
		}else {
			System.out.println("Database connection failed");
		}
		
		Statement smt = connection.createStatement();
		
			resultSet = smt.executeQuery(DataBaseConnector.sqlQuery(query));
			while(resultSet.next()) {
				resultValue = resultSet.getString(0);
			}
	
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	return resultValue;
}
public static String sqlQuery(File inputFile) throws FileNotFoundException {

	// Delimiter
	String delimiter = ";";
	ResultSet rs1 = null;

	// Create scanner
	Scanner scanner = null;
	try {
		scanner = new Scanner(inputFile).useDelimiter(delimiter);
	} catch (FileNotFoundException e1) {
		e1.printStackTrace();

	}

	// Loop through the SQL file statements 
	Statement currentStatement = null;
	//while(scanner.hasNext()) {

	// Get statement 
	String rawStatement = scanner.next();//+ delimiter;

	scanner.close();
	//	System.out.println("raw statement is "+rawStatement);

	return rawStatement;

}
}
