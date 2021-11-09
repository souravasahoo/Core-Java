package com.employee.bin;

public class EmployeeBean {
	private int emId;
	private String empName;
	private String empGender;
	private float empSalary;

	public EmployeeBean() {

	}

	public EmployeeBean( String empName, String empGender, float empSalary) {
		
		this.empName = empName;
		this.empGender = empGender;
		this.empSalary = empSalary;

	}
	public EmployeeBean(int emId, String empName, String empGender, float empSalary) {
		super();
		this.emId = emId;
		this.empName = empName;
		this.empGender = empGender;
		this.empSalary = empSalary;

	}

	public int getEmId() {
		return emId;
	}

	public void setEmId(int emId) {
		this.emId = emId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

}
