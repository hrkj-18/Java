package com.accenture.lkm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeEntity {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	@Column
	private String empName;
	@Column
	private String location;

	
	public EmployeeEntity(String empName, String location) {
		super();
		this.empName = empName;
		this.location = location;
	}
	
	public EmployeeEntity() {

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
