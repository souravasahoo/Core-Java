package com.employee.dao;


import java.sql.SQLException;

import com.employee.entity.EmployeeEntity;


public interface EmployeeDao {
	
	public abstract void addEmployee(EmployeeEntity employee) throws ClassNotFoundException, SQLException;
	public abstract void updateEmployee(EmployeeEntity employee) throws ClassNotFoundException, SQLException;
	public abstract void deleteEmployee(int empId) throws ClassNotFoundException, SQLException;
	public abstract EmployeeEntity getEmployeeById(int empId) throws ClassNotFoundException, SQLException;
	public abstract EmployeeEntity[] getAllEmployee() throws ClassNotFoundException, SQLException;
	
}
