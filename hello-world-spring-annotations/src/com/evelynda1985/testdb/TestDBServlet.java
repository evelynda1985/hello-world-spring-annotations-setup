package com.evelynda1985.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*; 


//En general this is the same process for a test your database connection
// you can just copy and paste it and update username, password, url and driver in case they are different and print out is optional.

//very important to import this --> import java.sql.*;


@WebServlet("/TestDatabase") //after run the server add this path on the end to know if your connection is sucessfull and verify in the console
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Write your database information here
		
		String user = "github";
		String pass = "github";
		String url = "jdbc:mysql://localhost:3306/sakila?useSSL=false";//put here the name of the path of database
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			PrintWriter out = response.getWriter();
			out.println("Connecting to database: " + url + "\n"); //you can put any message, it is only to verify the connection
			Class.forName(driver);
			Connection myConn = DriverManager.getConnection(url, user, pass);
			out.println("SUCCESS!!!");//you can put any message, it is only to verify the connection
			myConn.close();
			
		} catch (Exception e) {
			System.out.println("try again problem with the connection"); //you can put any message, it is only to verify the connection
			e.printStackTrace();
			throw new ServletException(e);
		}

	}

}
