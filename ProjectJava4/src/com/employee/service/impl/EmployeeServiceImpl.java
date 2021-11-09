package com.employee.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.employee.bin.EmployeeBean;
import com.employee.dao.EmployeeDao;
import com.employee.dao.impl.EmployeeDaoImpl;
import com.employee.entity.EmployeeEntity;
import com.employee.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
//	private EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
	private EmployeeDao employeeDao = new EmployeeDaoImpl();

	@Override
	public void addEmployee(EmployeeBean employee) throws ClassNotFoundException, SQLException {
System.out.println("EmployeeServiceImpl addEmployee method start");
		EmployeeEntity employeeEntity = new EmployeeEntity(employee.getEmpName(), employee.getEmpGender(),
				employee.getEmpSalary());
		employeeDao.addEmployee(employeeEntity);
		System.out.println("EmployeeServiceImpl addEmployee method end");

	}

	@Override
	public void updateEmployee(EmployeeBean employeeBean) throws ClassNotFoundException, SQLException {

		EmployeeEntity employeeEntity = new EmployeeEntity(employeeBean.getEmId(), employeeBean.getEmpName(),
				employeeBean.getEmpGender(), employeeBean.getEmpSalary());
		employeeDao.updateEmployee(employeeEntity);

	}

	@Override
	public void deleteEmployee(int empId) throws ClassNotFoundException, SQLException {
		employeeDao.deleteEmployee(empId);

	}

	@Override
	public EmployeeBean getEmployeeById(int empId) throws ClassNotFoundException, SQLException {
		EmployeeEntity empEntity = employeeDao.getEmployeeById(empId);
		EmployeeBean empBean = null;
		if (empEntity != null) {

			empBean = new EmployeeBean(empEntity.getEmId(), empEntity.getEmpName(), empEntity.getEmpGender(),
					empEntity.getEmpSalary());
		}
		return empBean;
	}

	@Override
	public List<EmployeeBean> getAllEmployee() throws ClassNotFoundException, SQLException {
		List<EmployeeEntity> empEntArray = employeeDao.getAllEmployee();

		List<EmployeeBean> empBeanArray = new ArrayList<>();
		for (int i = 0; i < empEntArray.size(); i++) {
			EmployeeEntity empent = empEntArray.get(i);
			EmployeeBean empBean = new EmployeeBean(empent.getEmId(), empent.getEmpName(), empent.getEmpGender(),
					empent.getEmpSalary());
			empBeanArray.add(empBean);
		}

		return empBeanArray;
	}

}
