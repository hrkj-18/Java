package com.acc.bean;

public class EmployeeBean {

	private int id;
	private String name;
	private String location;

	public EmployeeBean(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public EmployeeBean() {

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
		return "EmployeeBean [id=" + id + ", name=" + name + ", location=" + location + "]";
	}

}
