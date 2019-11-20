package com.acc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StudentComplexQueryTester {

	public static void main(String[] args) {

		// Create Manager Factory and Manager
		EntityManagerFactory studentManagerFactory = Persistence.createEntityManagerFactory("unit1");
		EntityManager studentManager = studentManagerFactory.createEntityManager(); // CRUD ops

		// Select Query selecting only Name and Age
		int input = 2;
		
		String complexQueryString1 = "select s.name, s.age from StudentEntity s where s.id > ?1";
		Query complexQuery1 = studentManager.createQuery(complexQueryString1);

		complexQuery1.setParameter(1, input);
		
		// List of object type because all columns not selected
		List<Object> studentNameAgeList = (List<Object>) complexQuery1.getResultList();

		for (Object studentNameAgeRows : studentNameAgeList) {

			Object[] rows = (Object[]) studentNameAgeRows;
			System.out.println(rows[0]);
			System.out.println(rows[1]);
		}
		
		// Update
		String complexQueryString2 = "update StudentEntity s set s.name= 'Murli' where s.id = 3";
		Query complexQuery2 = studentManager.createQuery(complexQueryString2);
		
		EntityTransaction transaction1 = studentManager.getTransaction();
		transaction1.begin();		
		complexQuery2.executeUpdate();
		transaction1.commit();
		
		// Insert
//		String complexQueryString3 = "insert into StudentEntity s values(6, 21,'Riya')";
//		Query complexQuery3 = studentManager.createNativeQuery(complexQueryString3);
		
		StudentEntity student = new StudentEntity();
		student.setName("Simran");
		student.setAge(22);
		
		EntityTransaction transaction2 = studentManager.getTransaction();
		transaction2.begin();
//		complexQuery3.executeUpdate();
		studentManager.persist(student);
		transaction2.commit();
		
		// Delete
		String complexQueryString4 = "delete from StudentEntity s where s.name = 'Vishel'";
		Query complexQuery4 = studentManager.createQuery(complexQueryString4);
		
		EntityTransaction transaction3 = studentManager.getTransaction();
		transaction3.begin();		
		complexQuery4.executeUpdate();
		transaction3.commit();

		// Close the Manager and Manager Factory
		studentManager.close();
		studentManagerFactory.close();

	}

}
