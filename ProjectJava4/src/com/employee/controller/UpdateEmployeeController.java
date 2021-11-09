package com.employee.controller;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateEmployeeController {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int id = 3;
		String name = "Akbar";
		String gender = "male";
		float salary = 2200.00f;

		Statement smt = DBUtil.getStatement();

		String query = "update employeeone set empname = '" + name + "',empgender='" + gender + "' ,empsalary ='"
				+ salary + "' where empid = " + id;

		System.out.println(query);

		boolean isupdated = smt.execute(query);
		System.out.println(isupdated);

	}

}
