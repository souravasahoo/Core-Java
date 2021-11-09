package com.employee.controller;

import java.sql.SQLException;

import com.employee.bin.EmployeeBean;
import com.employee.service.impl.EmployeeServiceImpl;

public class AddEmployeeController {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		String name = "Haris";
		String gender = "Female";
		float salary = 5000f;

		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		EmployeeBean employeeBean = new EmployeeBean(name, gender, salary);
		employeeServiceImpl.addEmployee(employeeBean);

	}
}
