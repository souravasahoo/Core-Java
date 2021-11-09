package com.employee.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		System.out.println("DBUtil getConnection method start");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Lala@1234");
		System.out.println("DBUtil getConnection method end");
		return conn;

	}

	public static Statement getStatement() throws SQLException, ClassNotFoundException {
		System.out.println("DBUtil getStatement method start");
		Connection conn = getConnection();
		Statement smt = conn.createStatement();
		System.out.println("DBUtil getStatement method end");
		return smt;

	}

}
