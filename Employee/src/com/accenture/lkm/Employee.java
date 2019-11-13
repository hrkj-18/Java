package com.accenture.lkm;

public class Employee implements Comparable<Employee> {

	private int employeeId;
	private String employeeName;
	private int yearsOfExperience;
	private double salary;

	public Employee(int employeeId, String employeeName, int yearsOfExperience, double salaray) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.yearsOfExperience = yearsOfExperience;
		this.salary = salaray;
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
		return salary;
	}

	public void setSalaray(double salaray) {
		this.salary = salaray;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", yearsOfExperience="
				+ yearsOfExperience + ", salary=" + salary + "]";
	}

	/*
	 * @Override public int compareTo(Employee o) { // TODO Auto-generated method
	 * stub return this.employeeId - o.employeeId; }
	 */

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if (this.salary > o.salary) {
			return 1;
		} else if (this.salary < o.salary) {
			return -1;
		} else {
			return 0;
		}
	}

}
