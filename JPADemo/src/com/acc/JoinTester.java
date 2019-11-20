package com.acc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JoinTester {

	public static void main(String[] args) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("unit1");
		EntityManager manager = managerFactory.createEntityManager(); // CRUD ops

		// Simple Join Query
		String joinQueryString = "select emp, st from EmployeeEntity emp, StudentEntity st where emp.id = st.id";
		// String joinQueryString = "select emp from EmployeeEntity emp";
		Query joinQuery = manager.createQuery(joinQueryString);
		
		// List of StudentEntity type
		List<Object> resultList = (List<Object>) joinQuery.getResultList();

		for (Object result : resultList) {
			Object[] rows = (Object[]) result;
			System.out.println(rows[0]);
			System.out.println(rows[1]);
		
		}
	}

}
