package com.employee.controller;

import java.sql.SQLException;
import java.util.List;

import com.employee.bin.EmployeeBean;
import com.employee.service.EmployeeService;
import com.employee.service.impl.EmployeeServiceImpl;

public class GetAllEmployeeController {
	private static  EmployeeService employeeService = new EmployeeServiceImpl();
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		List<EmployeeBean> beanList = employeeService.getAllEmployee();
		if (beanList != null) {
			for (EmployeeBean employeeBean : beanList) {
				if (employeeBean != null) {
					System.out.println("id = " + employeeBean.getEmId() + " name = " + employeeBean.getEmpName()
							+ " gender = " + employeeBean.getEmpGender() + " salary =" + employeeBean.getEmpSalary());
				}
			}
		}

	}

}
