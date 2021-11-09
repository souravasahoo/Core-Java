package com.employee.controller;

import java.sql.SQLException;

import com.employee.bin.EmployeeBean;
import com.employee.service.EmployeeService;
import com.employee.service.impl.EmployeeServiceImpl;

public class GetEmployeeByIdController {
	private static  EmployeeService employeeService = new EmployeeServiceImpl();
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		int empId = 2;
		EmployeeBean empBean = employeeService.getEmployeeById(empId);
		if (empBean != null) {
			System.out.println("id = " + empBean.getEmId());
			System.out.println("name = " + empBean.getEmpName());
			System.out.println("gender = " + empBean.getEmpGender());
			System.out.println("salary = " + empBean.getEmpSalary());

		}
	}
}
