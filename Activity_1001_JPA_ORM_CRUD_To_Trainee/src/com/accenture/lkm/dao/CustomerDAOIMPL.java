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


				
				customerRet.setBill(customerEntity.getBill());
				customerRet.setCustomerId(customerEntity.getCustomerId());
				customerRet.setCustomerName(customerEntity.getCustomerName());
				customerRet.setPurchaseDate(customerEntity.getPurchaseDate());
				
				EntityTransaction deleteCustomerTransaction = entityManager.getTransaction();

				deleteCustomerTransaction.begin();
				entityManager.remove(customerEntity);	
				deleteCustomerTransaction.commit();
				
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

	@Override
	public List<CustomerBean> getCustomersWithinDateRange(Date lowerBound,Date upperBound) throws Exception{
		List<CustomerBean> listCustomer = null;
		EntityManager entityManager = null;
		try {
			
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();	
			
			// Simple Select Query
			String getCustomersWithinDateRangeString = "select c from CustomerEntity c where c.purchaseDate BETWEEN ?1 AND ?2";
			Query getCustomersWithinDateRange = entityManager.createQuery(getCustomersWithinDateRangeString);
			
			getCustomersWithinDateRange.setParameter(1, lowerBound);
			getCustomersWithinDateRange.setParameter(2, upperBound);
			
			EntityTransaction getCustomersWithinDateRangeTransaction = entityManager.getTransaction();
			getCustomersWithinDateRangeTransaction.begin();		
			int n = getCustomersWithinDateRange.executeUpdate();
			getCustomersWithinDateRangeTransaction.commit();
			
			for () {}
			
		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
//				entityManager.close();
//			}
//		}

		return listCustomer;
	}

	@Override
	public Integer updateCustomerBillByName(String name,Double bill) throws Exception{
		Integer ret = null;
		EntityManager entityManager = null;
		try {

			EntityManagerFactory customerManagerFactory = Persistence.createEntityManagerFactory("unit1");
			entityManager = customerManagerFactory.createEntityManager(); // CRUD ops
			
			
			String updateCustomerBillByNameString = "update CustomerEntity c set c.bill = ?1 where c.customerName = ?2";
			Query updateCustomerBillByName = entityManager.createQuery(updateCustomerBillByNameString);
			
			updateCustomerBillByName.setParameter(1, bill);
			updateCustomerBillByName.setParameter(2, name);
			
			EntityTransaction updateCustomerBillByNameTransaction = entityManager.getTransaction();
			updateCustomerBillByNameTransaction.begin();		
			ret = updateCustomerBillByName.executeUpdate();
			updateCustomerBillByNameTransaction.commit();
			
		
		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return ret;
	}

}
