package com.acc.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity // JPA Mandatory
public class EmployeeEntity {

	@Id // PK
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column // Will create column with same name as the variable name
	private int id;
	@Column
	private String name;
	@Column
	private String location;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn()
	private DepartmentEntity dept;

	public EmployeeEntity() {

	}

	public EmployeeEntity(int id, String name, String location, DepartmentEntity dept) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.dept = dept;
	}

	public EmployeeEntity(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public DepartmentEntity getDept() {
		return dept;
	}

	public void setDept(DepartmentEntity dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", location=" + location + ", dept=" + dept + "]";
	}

}