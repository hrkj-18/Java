package com.acc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentTester {

	public static void main(String[] args) {
		
		// Create Manager Factory and Manager
		EntityManagerFactory studentManagerFactory = Persistence.createEntityManagerFactory("unit1");
		EntityManager studentManager = studentManagerFactory.createEntityManager(); // CRUD ops

		// Create the Student
		StudentEntity student1 = new StudentEntity();
		student1.setName("Harsh");
		student1.setAge(22);
		
		// Create Transaction
		EntityTransaction transaction1 = studentManager.getTransaction();
		transaction1.begin();
		studentManager.persist(student1);
		transaction1.commit();

		// Close the Manager and Manager Factory
		studentManager.close();
		studentManagerFactory.close();

	}

}
