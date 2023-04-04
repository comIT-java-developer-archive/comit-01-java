package com.comit.course._25_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.comit.course._25_jdbc.bean.User;

public class _06_JdbcPrStDelete {

	public static void main(String[] args) {

		String dbUrl = "jdbc:mysql://localhost:3306/usersdb";
		String dbUsername = "root";
		String dbPassword = "rootroot";
		

		// SQL Injection Attack
		String sql = "DELETE FROM USER WHERE ID_USER = ?";
						
	    int input = 0;

		try(Scanner scan = new Scanner(System.in);){
			
			System.out.print("Enter the idUser: ");
			input = scan.nextInt();
		}
		
		System.out.println("Query: " + sql);

		try(Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
				
			PreparedStatement st = con.prepareStatement(sql);) {
			
			st.setInt(1, input);
			
			int row = st.executeUpdate();
			
			if (row >= 1) {
				System.out.println("Number of rows affected: " + row);				
			} 
			else {
			    System.out.println("User not found, idUser: " + input);	
			}
			
		} catch (SQLException e) {
			System.err.format("SQL State: %s%n%s%n", e.getSQLState(), e.getMessage());
		} 
				
	}
}
