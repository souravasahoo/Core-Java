package com.employee.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.employee.controller.DBUtil;
import com.employee.dao.EmployeeDao;
import com.employee.entity.EmployeeEntity;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void addEmployee(EmployeeEntity employeeEntity) throws ClassNotFoundException, SQLException {
		System.out.println("EmployeeDaoImpl addEmployee method start");
		Connection conn = DBUtil.getConnection();
		String query = "insert into employeeone (empname,empgender,empsalary) values (?,?,?)";
		PreparedStatement psmt = conn.prepareStatement(query);
		psmt.setString(1, employeeEntity.getEmpName());
		psmt.setString(2, employeeEntity.getEmpGender());
		psmt.setFloat(3, employeeEntity.getEmpSalary());
		System.out.println(query);
		boolean isInserted = psmt.execute();
		System.out.println(isInserted);
		System.out.println("EmployeeDaoImpl addEmployee method end");

	}

	@Override
	public void updateEmployee(EmployeeEntity employeeEntity) throws ClassNotFoundException, SQLException {

		Connection conn = DBUtil.getConnection();

		String query = "update employeeone set empname = ?,empgender=? ,empsalary =? where empid =? ";

		PreparedStatement psmt = conn.prepareStatement(query);
		psmt.setString(1, employeeEntity.getEmpName());
		psmt.setString(2, employeeEntity.getEmpGender());
		psmt.setFloat(3, employeeEntity.getEmpSalary());
		psmt.setInt(4, employeeEntity.getEmId());
		System.out.println(query);

		boolean isupdated = psmt.execute();

		System.out.println(isupdated);
	}

	@Override
	public void deleteEmployee(int empId) throws ClassNotFoundException, SQLException {
		Connection conn = DBUtil.getConnection();
		String query = "DELETE FROM EPLOYEEONE where empid =? ";
		PreparedStatement psmt = conn.prepareStatement(query);
		psmt.setInt(1, empId);
		System.out.println(query);
		boolean isDeleted = psmt.execute();
		System.out.println(isDeleted);

	}

	@Override
	public EmployeeEntity getEmployeeById(int empId) throws ClassNotFoundException, SQLException {
		EmployeeEntity entity = null;
		Connection conn = DBUtil.getConnection();
		String query = "SELECT * FROM EMPLOYEEONE WHERE empid = ?";
		PreparedStatement psmt = conn.prepareStatement(query);
		psmt.setInt(1, empId);
		ResultSet rs = psmt.executeQuery();
		while (rs.next()) {
			entity = new EmployeeEntity(rs.getInt("empid"), rs.getString("empname"), rs.getString("empgender"),
					rs.getFloat("empsalary"));
		}
		return entity;
	}

	@Override
	public List<EmployeeEntity> getAllEmployee() throws ClassNotFoundException, SQLException {
		List<EmployeeEntity> empEntityArray = new ArrayList<>();

		Connection conn = DBUtil.getConnection();
		String query = "SELECT * FROM EMPLOYEEONE";
		PreparedStatement psmt = conn.prepareStatement(query);
		ResultSet rs = psmt.executeQuery(query);

		while (rs.next()) {

			EmployeeEntity entity = new EmployeeEntity(rs.getInt("empid"), rs.getString("empname"),
					rs.getString("empgender"), rs.getFloat("empsalary"));

			empEntityArray.add(entity);
		}
		return empEntityArray;
	}

}
