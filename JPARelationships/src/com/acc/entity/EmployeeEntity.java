package com.acc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

	public EmployeeEntity() {

	}

	public EmployeeEntity(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public EmployeeEntity(int id, String name, String location) {
		super();
		this.id = id;
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

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", location=" + location + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getLocation()=" + getLocation() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}