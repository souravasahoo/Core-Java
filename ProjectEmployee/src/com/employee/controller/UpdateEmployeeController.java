package com.employee.controller;

import java.sql.SQLException;
import java.sql.Statement;

import com.employee.bin.EmployeeBean;
import com.employee.service.impl.EmployeeServiceImpl;

public class UpdateEmployeeController {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	int id =2;
	 String name = "Hari";
    String gender = "male";
    float  salary = 2000.00f;
    
    Statement smt =DBUtil.getStatement();
    
   String query= "update employeeone set empname = '"+name+"',empgender='"+gender+"' ,empsalary ='"+salary+"' where empid = "+id;
   
   System.out.println(query);
    
   boolean isupdated =smt.execute(query);
   System.out.println(isupdated);
}
}
