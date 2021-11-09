package com.employee.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Lala@1234");
		return conn;

	}

	public static Statement getStatement() throws SQLException, ClassNotFoundException {
		Connection conn = getConnection();
		Statement smt = conn.createStatement();
		return smt;

	}

}
