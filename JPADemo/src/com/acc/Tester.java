package com.acc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Tester {

	public static void main(String[] args) {
		EntityManagerFactory managerfactory = Persistence.createEntityManagerFactory("unit1");

		EntityManager manager = managerfactory.createEntityManager(); // CRUD ops
//
//		// transaction mandatory for all DML
//		EntityTransaction transaction = manager.getTransaction();
//
//		// insert
//		transaction.begin();
//			EmployeeEntity e1 = new EmployeeEntity(5, "Emp1", "loc1");
//			manager.persist(e1);
//		transaction.commit();
//
//		// find
//		EmployeeEntity obj = manager.find(EmployeeEntity.class, 1);
//		System.out.println(obj);
//
//		// delete
//		EntityTransaction et3 = manager.getTransaction();
//		EmployeeEntity e3 = manager.find(EmployeeEntity.class, 5);
//		et3.begin();
//		if (e3 != null) {
//			manager.remove(e3);
//		}
//		et3.commit();

		// update
		EntityTransaction et4 = manager.getTransaction();
		EmployeeEntity e6 = new EmployeeEntity(6,"Emp66","Loc66");
		//EmployeeEntity e4 = manager.find(EmployeeEntity.class, 5);
		et4.begin();
		if (e6 != null) {
			
			EmployeeEntity e6copy = manager.merge(e6);
			e6copy.setName("Emp423423");
		}
		et4.commit();

		manager.close();
		managerfactory.close();
	}

}
