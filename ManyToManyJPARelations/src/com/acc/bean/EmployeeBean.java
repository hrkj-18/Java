package com.acc.bean;

import java.util.List;

public class EmployeeBean {

	private int id;
	private String name;
	private String location;
	private List<AddressBean> addrList;

	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeBean(int id, String name, String location, List<AddressBean> addrList) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.addrList = addrList;
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

	public List<AddressBean> getAddrList() {
		return addrList;
	}

	public void setAddrList(List<AddressBean> addrList) {
		this.addrList = addrList;
	}

	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", location=" + location + ", addrList=" + addrList + "]";
	}

}
