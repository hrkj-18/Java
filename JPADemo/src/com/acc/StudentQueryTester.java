package com.acc;

import javax.persistence.Query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentQueryTester {

	public static void main(String[] args) {

		// Create Manager Factory and Manager
		EntityManagerFactory studentManagerFactory = Persistence.createEntityManagerFactory("unit1");
		EntityManager studentManager = studentManagerFactory.createEntityManager(); // CRUD ops

		// Simple Select Query
		String selectQueryString = "select s from StudentEntity s where s.age = 22";
		Query selectQuery = studentManager.createQuery(selectQueryString);

		// List of StudentEntity type
		List<StudentEntity> studentList = (List<StudentEntity>) selectQuery.getResultList();

		for (StudentEntity student : studentList) {
			System.out.println(student);
		}

		// Select Query selecting only Name and Age
		String selectNameAndAgeQueryString = "select s.name, s.age from StudentEntity s where s.age = 22";
		Query selectNameAndAgeQuery = studentManager.createQuery(selectNameAndAgeQueryString);

		// List of object type because all columns not selected
		List<Object> studentNameAgeList = (List<Object>) selectNameAndAgeQuery.getResultList();

		for (Object studentNameAgeRows : studentNameAgeList) {

			Object[] rows = (Object[]) studentNameAgeRows;
			System.out.println(rows[0]);
			System.out.println(rows[1]);
		}

		String selectOnlyIdQueryString = "select s.id from StudentEntity s where s.age = 22";
		Query selectOnlyIdQuery = studentManager.createQuery(selectOnlyIdQueryString);

		List<Object> studentIdList = (List<Object>) selectOnlyIdQuery.getResultList();

		for (Object studentId : studentIdList) {
			System.out.println(studentId);
		}
		
		String selectFuncQueryString = "select UPPER(s.name), LOWER(s.name), SUBSTRING(s.name, 1,3) from StudentEntity s";
		Query selectFuncQuery = studentManager.createQuery(selectFuncQueryString);

		// List of StudentEntity type
		List<Object> studentFuncList = (List<Object>) selectFuncQuery.getResultList();

		for (Object student : studentFuncList) {
			Object[] rows = (Object[]) student;
			System.out.println(rows[0]);
			System.out.println(rows[1]);
			System.out.println(rows[2]);	
		}
		
		String selectLessThanAvgAgeQueryString = "select s.name from StudentEntity s where s.id <= (select avg(s.id) from StudentEntity s)";
		Query selectLessThanAvgAgeQuery = studentManager.createQuery(selectLessThanAvgAgeQueryString);

		// List of StudentEntity type
		List<String> studentLessThanAvgAgeList = (List<String>) selectLessThanAvgAgeQuery.getResultList();

		for (String student : studentLessThanAvgAgeList) {
			System.out.println(student);
		}
		
		Query selectNamedQuery = studentManager.createNamedQuery("selectAllStudents");

		// List of StudentEntity type
		List<StudentEntity> studentNamedList = (List<StudentEntity>) selectNamedQuery.getResultList();

		for (StudentEntity student : studentNamedList) {
			System.out.println(student);
		}
		
		
		Query selectAllStudentsNameDesc = studentManager.createNamedQuery("selectAllStudentsNameDesc");

		// List of StudentEntity type
		List<StudentEntity> studentNamedDescList = (List<StudentEntity>) selectAllStudentsNameDesc.getResultList();

		for (StudentEntity student : studentNamedDescList) {
			System.out.println(student);
		}
		
		Query idQueryDesc = studentManager.createNamedQuery("idQueryDesc");

		// List of StudentEntity type
		List<Object> studentIdNamedDescList = (List<Object>) idQueryDesc.getResultList();

		for (Object student : studentIdNamedDescList) {
			System.out.println(student);
		}

		// Close the Manager and Manager Factory
		studentManager.close();
		studentManagerFactory.close();

	}

}
