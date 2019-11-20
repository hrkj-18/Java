package com.acc.bean;

public class EmployeeBean {

	private int id;
	private String name;
	private String location;
	private DepartmentBean dept;

	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeBean(int id, String name, String location, DepartmentBean dept) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.dept = dept;
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

	public DepartmentBean getDept() {
		return dept;
	}

	public void setDept(DepartmentBean dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", location=" + location + ", dept=" + dept + "]";
	}

}
