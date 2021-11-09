package com.employee.service;

import java.sql.SQLException;
import java.util.List;

import com.employee.bin.EmployeeBean;

public interface EmployeeService {

	
	public abstract void addEmployee(EmployeeBean employee) throws ClassNotFoundException, SQLException;
	public abstract void updateEmployee(EmployeeBean employee) throws ClassNotFoundException, SQLException;
	public abstract void deleteEmployee(int empId)throws ClassNotFoundException, SQLException;
	public abstract EmployeeBean getEmployeeById(int empId)throws ClassNotFoundException, SQLException;
	public abstract List<EmployeeBean> getAllEmployee()throws ClassNotFoundException, SQLException;
	
	
}
