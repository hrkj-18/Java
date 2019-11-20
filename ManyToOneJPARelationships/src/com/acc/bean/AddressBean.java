package com.acc.bean;

public class AddressBean {

	private int id;
	private int zipcode;
	private String city;

	public AddressBean(int id, int zipcode, String city) {
		super();
		this.id = id;
		this.zipcode = zipcode;
		this.city = city;
	}

	public AddressBean() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "AddressBean [id=" + id + ", zipcode=" + zipcode + ", city=" + city + "]";
	}

}
