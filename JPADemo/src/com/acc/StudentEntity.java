package com.acc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries(
	{
	@NamedQuery(name = "selectAllStudents", query = "select s from StudentEntity s"),
	@NamedQuery(name = "selectAllStudentsNameDesc", query = "select s from StudentEntity s order by s.name DESC")
	}
)
public class StudentEntity {

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	@Column
	String name;

	@Column
	int age;

	public StudentEntity() {

	}

	public StudentEntity(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
