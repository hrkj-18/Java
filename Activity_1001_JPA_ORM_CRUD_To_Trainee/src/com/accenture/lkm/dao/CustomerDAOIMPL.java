package com.accenture.lkm.dao;

import java.util.*;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.accenture.lkm.businessbean.CustomerBean;
import com.accenture.lkm.entity.CustomerEntity;
import com.accenture.lkm.utility.JPAUtility;

public class CustomerDAOIMPL implements CustomerDAO {
	
	public Integer addCustomer(CustomerBean customer) throws Exception {
		// TODO Auto-generated method stub
		Integer customerID = 0;
		EntityManager entityManager = null;
		try {
						
			EntityManagerFactory customerManagerFactory = Persistence.createEntityManagerFactory("unit1");
			entityManager = customerManagerFactory.createEntityManager(); // CRUD ops

			// Transfer Bean values in to Entity
			// code

			CustomerEntity customerEntity = new CustomerEntity();
			customerEntity.setCustomerId(customer.getCustomerId());
			customerEntity.setCustomerName(customer.getCustomerName());
			customerEntity.setBill(customer.getBill());
			customerEntity.setPurchaseDate(customer.getPurchaseDate());

			EntityTransaction addCustomerTransaction = entityManager.getTransaction();

			addCustomerTransaction.begin();

			entityManager.persist(customerEntity);

			customerID = customerEntity.getCustomerId();

			addCustomerTransaction.commit();

			// Close the Manager and Manager Factory
			entityManager.close();
			customerManagerFactory.close();
			
			
			
		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return customerID;
	}

	public CustomerBean findCustomerById(Integer customerId) throws Exception {
		CustomerBean customer = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();

			CustomerEntity customerEntity = (CustomerEntity) entityManager.find(CustomerEntity.class, customerId);

			if (customerEntity != null) {
				customer = new CustomerBean();
				customer.setBill(customerEntity.getBill());
				customer.setCustomerId(customerEntity.getCustomerId());
				customer.setCustomerName(customerEntity.getCustomerName());
				customer.setPurchaseDate(customer.getPurchaseDate());
			}

		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return customer;
	}

	public CustomerBean updateCustomerBillById(CustomerBean customerBean) throws Exception {
		CustomerBean customerRet = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();

			CustomerEntity customerEntity = (CustomerEntity) entityManager.find(CustomerEntity.class, customerBean.getCustomerId());

			if (customerEntity != null) {
				
				entityManager.getTransaction().begin();
					customerEntity.setBill(customerBean.getBill());
				entityManager.getTransaction().commit();
				customerRet = new CustomerBean();
				customerRet.setBill(customerEntity.getBill());
				customerRet.setCustomerId(customerEntity.getCustomerId());
				customerRet.setCustomerName(customerEntity.getCustomerName());
				customerRet.setPurchaseDate(customerRet.getPurchaseDate());
			}

		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return customerRet;
	}

	public CustomerBean deleteCustomerById(Integer customerId) throws Exception {
		CustomerBean customerRet = null;
		EntityManager entityManager = null;
		try {
			
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();

			CustomerEntity customerEntity = (CustomerEntity) entityManager.find(CustomerEntity.class, customerId);
			customerRet = findCustomerById(customerId);
			
			if(customerEntity != null) {

				EntityTransaction deleteCustomerTransaction = entityManager.getTransaction();

				deleteCustomerTransaction.begin();

				entityManager.remove(customerEntity);

				deleteCustomerTransaction.commit();
				System.out.println("-------------");
			}

			// Close the Manager and Manager Factory
			entityManager.close();
			entityManagerFactory.close();
			
			
		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return customerRet;
	}

	@Override
	public List<CustomerBean> getCustomersWithinDateRange(Date lowerBound,Date upperBound) throws Exception{
		List<CustomerBean> listCustomer = null;
		EntityManager entityManager = null;
//		try {
//			
//			
//			EntityManagerFactory customerManagerFactory = Persistence.createEntityManagerFactory("unit1");
//			entityManager = customerManagerFactory.createEntityManager(); // CRUD ops
//			
//			// Simple Select Query
//			String selectQueryString = "select ";
//			Query selectQuery = studentManager.createQuery(selectQueryString);
//
//			// List of StudentEntity type
//			List<StudentEntity> studentList = (List<StudentEntity>) selectQuery.getResultList();
//
//			for (StudentEntity student : studentList) {
//				System.out.println(student);
//			}
//			
//			entityManager.close();
//			customerManagerFactory.close();
//			
//		} catch (Exception exception) {
//
//			throw exception;
//		} finally {
//			if (entityManager != null) {
//				entityManager.close();
//			}
//		}

		return listCustomer;
	}

	@Override
	public Integer updateCustomerBillByName(String name,Double bill) throws Exception{
		Integer ret = null;
		EntityManager entityManager = null;
//		try {
//
//			EntityManagerFactory customerManagerFactory = Persistence.createEntityManagerFactory("unit1");
//			entityManager = customerManagerFactory.createEntityManager(); // CRUD ops
//			
//			String updateCustomerBillByNameString = "update Customer c set c.bill = bill where c.name = name";
//			Query updateCustomerBillByName = entityManager.createQuery(updateCustomerBillByNameString);
//			
//			EntityTransaction updateCustomerBillByNameTransaction = entityManager.getTransaction();
//			updateCustomerBillByNameTransaction.begin();		
//			updateCustomerBillByName.executeUpdate();
//			updateCustomerBillByNameTransaction.commit();
//			
//			entityManager.close();
//			customerManagerFactory.close();
//		
//		} catch (Exception exception) {
//
//			throw exception;
//		} finally {
//			if (entityManager != null) {
//				entityManager.close();
//			}
//		}

		return ret;
	}

}
