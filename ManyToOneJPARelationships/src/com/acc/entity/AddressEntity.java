package com.acc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // JPA Mandatory
public class AddressEntity {
	@Id // PK
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	@Column
	private int zipcode;
	@Column
	private String city;

	public AddressEntity(int id, int zipcode, String city) {
		super();
		this.id = id;
		this.zipcode = zipcode;
		this.city = city;
	}

	public AddressEntity() {

	}
	
	public AddressEntity(int zipcode, String city) {

		this.zipcode = zipcode;
		this.city = city;
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
		return "AddressEntity [id=" + id + ", zipcode=" + zipcode + ", city=" + city + "]";
	}

}
