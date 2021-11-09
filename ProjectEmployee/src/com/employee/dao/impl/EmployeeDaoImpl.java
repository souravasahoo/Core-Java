package com.employee.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.employee.controller.DBUtil;
import com.employee.dao.EmployeeDao;

import com.employee.entity.EmployeeEntity;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void addEmployee(EmployeeEntity employeeEntity) throws ClassNotFoundException, SQLException {
		// int id = employeeEntity.getEmId();
		String name = employeeEntity.getEmpName();
		String gender = employeeEntity.getEmpGender();
		float salary = employeeEntity.getEmpSalary();
		Statement smt = DBUtil.getStatement();
		// insert into employeeone (empname,empgender,empsalary) values
		// ('Hari','male','2000.00')

		String query = "insert into employeeone (empname,empgender,empsalary) values ('" + name + "','" + gender + "','"
				+ salary + "')";

		System.out.println(query);

		boolean isInserted = smt.execute(query);
		System.out.println(isInserted);

	}

	@Override
	public void updateEmployee(EmployeeEntity employeeEntity) throws ClassNotFoundException, SQLException {
		int id=	employeeEntity.getEmId();
		String name=employeeEntity.getEmpName();
		String gender =employeeEntity.getEmpGender();
		float salary =employeeEntity.getEmpSalary();
		
		 Statement smt =DBUtil.getStatement();
	     // update employeeone set empname = 'Hari123',empgender='female' ,empsalary ='3000.00' where empid = 1;
	     
	    String query= "update employeeone set empname = '"+name+"',empgender='"+gender+"' ,empsalary ='"+salary+"' where empid = "+id;
	    
	    System.out.println(query);
	     
	    boolean isupdated =smt.execute(query);
	    System.out.println(isupdated);
	}

	@Override
	public void deleteEmployee(int empId) throws ClassNotFoundException, SQLException {
		System.out.println("emp id  = "+empId);
	     Statement smt =DBUtil.getStatement();
	    String query= "DELETE FROM EMPLOYEEONE WHERE empid = " +empId;
	    System.out.println(query);
	    boolean isDeleted =smt.execute(query);
	    System.out.println(isDeleted);

	}

	@Override
	public EmployeeEntity getEmployeeById(int empId) throws ClassNotFoundException, SQLException {
		EmployeeEntity entity = null;
	       Statement smt = DBUtil.getStatement();
	       String query ="SELECT * FROM EMPLOYEEONE Where empid = " + empId;
	       ResultSet rs =smt.executeQuery(query);
	       while(rs.next()){
	    	 int id = rs.getInt("empid");
	    	String name = rs.getString("empname");
	    	String gender = rs.getString("empgender");
	    	float salary =rs.getFloat("empsalary");
	    	  entity = new EmployeeEntity(id, name, gender, salary);
	       }
      return entity;
	}

	@Override
	public EmployeeEntity[] getAllEmployee() throws ClassNotFoundException, SQLException {
		EmployeeEntity[] empEntityArray = new EmployeeEntity[20];
		Statement smt = DBUtil.getStatement();
		String query = "SELECT * FROM EMPLOYEEONE";
		// excute the query using the statement
		ResultSet rs = smt.executeQuery(query);
		int i = 0;
		while (rs.next()) {
			int id = rs.getInt("empid");
//			System.out.println("dao id "+id);
			String name = rs.getString("empname");
			String gender = rs.getString("empgender");
			float salary = rs.getFloat("empsalary");
			EmployeeEntity entity = new EmployeeEntity(id, name, gender, salary);
			empEntityArray[i] = entity;
			i = i + 1;
			if (i == 19) {
				break;
			}
		}
		return empEntityArray;
	}

}
