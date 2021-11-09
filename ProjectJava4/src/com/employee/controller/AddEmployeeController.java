package com.employee.controller;

import java.sql.SQLException;

import com.employee.bin.EmployeeBean;
import com.employee.service.EmployeeService;
import com.employee.service.impl.EmployeeServiceImpl;

public class AddEmployeeController {
	private static EmployeeService employeeService = new EmployeeServiceImpl();
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("addEmployee Controller calls main method start");
		String name = "Ridhima";
		String gender = "Female";
		float salary = 4500f;
		EmployeeBean employeeBean = new EmployeeBean(name, gender, salary);
		employeeService.addEmployee(employeeBean);
		System.out.println("addEmployee Controller calls main method end");

	}

}
