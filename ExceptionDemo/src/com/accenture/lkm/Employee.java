package com.accenture.lkm;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private int yearsOfExperience;
	private double salaray;
	
	
	public Employee(int employeeId, String employeeName, int yearsOfExperience, double salaray) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.yearsOfExperience = yearsOfExperience;
		this.salaray = salaray;
	}

	

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}



	public double getSalaray() {
		return salaray;
	}

	public void setSalaray(double salaray) {
		this.salaray = salaray;
	}


	
	  @Override public String toString() { return "Employee [employeeId=" +
	  employeeId + ", employeeName=" + employeeName + ", yearsOfExperience=" +
	  yearsOfExperience + ", salaray=" + salaray + "]"; }
	 
}
