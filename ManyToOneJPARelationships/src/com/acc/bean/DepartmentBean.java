package com.acc.bean;

public class DepartmentBean {
	private int id;
	private String name;

	public DepartmentBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DepartmentBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "DepartmentBean [id=" + id + ", name=" + name + "]";
	}

}
