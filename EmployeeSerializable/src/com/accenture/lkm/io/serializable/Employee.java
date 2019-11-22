package com.accenture.lkm.io.serializable;

import java.io.Serializable;
import java.time.LocalDate;

/*class Address {
	public String addressLine1;
}*/

public class Employee implements Serializable {


	//private static final long serialVersionUID = 1L;
	private static final long serialVersionUID = 304003768894213441L;
	private int id;
	private String name;
	private LocalDate dob;
	private transient int age;// not serialized
	private static String companyName;// not serialized
	// private Address address;
	static {
		companyName = "Accenture";
	}
	/*
	 * public Address getAddress() { return address; }
	 * 
	 * public void setAddress(Address address) { this.address = address; }
	 */

	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}

	// setter and geter
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}

}
