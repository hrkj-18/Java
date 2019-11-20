package com.acc.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
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

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "empadd",
		joinColumns = { 
				@JoinColumn(name = "eid") 
		},
		inverseJoinColumns = { 
				@JoinColumn(name = "aid", unique = true) 
		}
	)
	private List<AddressEntity> addrList;

	public EmployeeEntity() {

	}

	public EmployeeEntity(int id, String name, String location, List<AddressEntity> addrList) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.addrList = addrList;
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

	public List<AddressEntity> getAddrList() {
		return addrList;
	}

	public void setAddrList(List<AddressEntity> addrList) {
		this.addrList = addrList;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", location=" + location + ", addr=" + addrList + "]";
	}

}