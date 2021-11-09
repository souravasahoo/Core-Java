package com.employee.controller;

import java.sql.SQLException;

import com.employee.bin.EmployeeBean;
import com.employee.service.impl.EmployeeServiceImpl;

public class GetEmployeeByIdController {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		int empId = 2;
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		EmployeeBean empBean = employeeServiceImpl.getEmployeeById(empId);
		if(empBean!=null) {
		int id = empBean.getEmId();
		String name = empBean.getEmpName();
		System.out.println("id = " + id);
		System.out.println("name = " + name);

	}

	}}
