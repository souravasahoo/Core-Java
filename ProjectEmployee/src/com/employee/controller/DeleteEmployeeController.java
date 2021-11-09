package com.employee.controller;

import java.sql.SQLException;
import java.sql.Statement;

import com.employee.service.impl.EmployeeServiceImpl;

public class DeleteEmployeeController {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int empid =1;
	     Statement smt =DBUtil.getStatement();
	    String query= "DELETE FROM EMPLOYEEONE WHERE empid = " +empid;
	    System.out.println(query);
	    boolean isDeleted =smt.execute(query);
	    System.out.println(isDeleted);
	}

}
