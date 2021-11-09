package com.employee.controller;

import java.sql.SQLException;

import com.employee.bin.EmployeeBean;
import com.employee.service.impl.EmployeeServiceImpl;

public class GetAllEmployeeController {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		EmployeeBean[] empBeanArray = employeeServiceImpl.getAllEmployee();
		for (int i = 0; i < empBeanArray.length; i++) {
			EmployeeBean empBean = empBeanArray[i];
			if(empBean!=null) {
			int id = empBean.getEmId();
			
			String name = empBean.getEmpName();
			System.out.println("id = " + id);
			System.out.println("name = " + name);
			}
		}

	}

}
