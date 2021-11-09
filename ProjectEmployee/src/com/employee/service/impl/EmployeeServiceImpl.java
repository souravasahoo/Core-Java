package com.employee.service.impl;

import java.sql.SQLException;

import com.employee.bin.EmployeeBean;
import com.employee.dao.impl.EmployeeDaoImpl;
import com.employee.entity.EmployeeEntity;
import com.employee.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void addEmployee(EmployeeBean employee) throws ClassNotFoundException, SQLException {
		// int id = employee.getEmId();
		String name = employee.getEmpName();
		String gender = employee.getEmpGender();
		float salary = employee.getEmpSalary();

		EmployeeDaoImpl EmployeeDaoImpl = new EmployeeDaoImpl();
		EmployeeEntity employeeEntity = new EmployeeEntity(name, gender, salary);
		EmployeeDaoImpl.addEmployee(employeeEntity);

	}

	@Override
	public void updateEmployee(EmployeeBean employeeBean) throws ClassNotFoundException, SQLException {
		int id = employeeBean.getEmId();
		String name = employeeBean.getEmpName();
		String gender = employeeBean.getEmpGender();
		float salary = employeeBean.getEmpSalary();
		System.out.println("id = " + id);

		EmployeeDaoImpl EmployeeDaoImpl = new EmployeeDaoImpl();
		EmployeeEntity employeeEntity = new EmployeeEntity(id, name, gender, salary);
		EmployeeDaoImpl.updateEmployee(employeeEntity);

	}

	@Override
	public void deleteEmployee(int empId) throws ClassNotFoundException, SQLException {
		System.out.println("empId = " + empId);
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		employeeDaoImpl.deleteEmployee(empId);

	}

	@Override
	public EmployeeBean getEmployeeById(int empId) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		EmployeeEntity empEntity = employeeDaoImpl.getEmployeeById(empId);
		EmployeeBean empBean = null;
		if( empEntity!=null) {
		int id = empEntity.getEmId();
		String name = empEntity.getEmpName();
		String gender = empEntity.getEmpGender();
		float salary = empEntity.getEmpSalary();
		empBean = new EmployeeBean(id, name, gender, salary);
		}
		return empBean;
	}

	@Override
	public EmployeeBean[] getAllEmployee() throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		EmployeeEntity[] empEntArray = employeeDaoImpl.getAllEmployee();

		EmployeeBean[] empBeanArray = new EmployeeBean[empEntArray.length];
		for (int i = 0; i < empEntArray.length; i++) {
			EmployeeEntity empent = empEntArray[i];
			if (empent != null) {
				int id = empent.getEmId();
				String name = empent.getEmpName();
				String gender = empent.getEmpGender();
				float salary = empent.getEmpSalary();
				EmployeeBean empBean = new EmployeeBean(id, name, gender, salary);
				empBeanArray[i] = empBean;
			}
		}

		return empBeanArray;
	}

}
