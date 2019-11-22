package com.accenture.lkm.service;

import java.util.Date;
import java.util.List;

import com.accenture.lkm.businessbean.CustomerBean;
import com.accenture.lkm.dao.CustomerDAO;
import com.accenture.lkm.utility.Factory;

public class CustomerServiceIMPL implements CustomerService {
	
	public Integer addCustomer(CustomerBean customer) throws Exception {

		int custID = 0;
		try {

			CustomerDAO customerDAO = Factory.createCustomerDAO();

			custID = customerDAO.addCustomer(customer);
			

		} catch (Exception exception) {
			throw exception;
		}

		return custID;

	}

	
	public CustomerBean findCustomerById(Integer customerId) throws Exception {
		CustomerBean customerBeanRet =null;
		try {
			
			CustomerDAO employeeDAO = Factory.createCustomerDAO();

			customerBeanRet = employeeDAO.findCustomerById(customerId);

			if(customerBeanRet==null){
				throw new Exception("Given CustomerId is invalid, please try with a valid CustomerId");
			}
		} catch (Exception exception) {
			throw exception;
			
		}
		return customerBeanRet;
	}


	@Override
	public CustomerBean updateCustomerBillById(CustomerBean customerBean)throws Exception{
		CustomerBean customerBeanRet =null;
		try {
			
			CustomerDAO employeeDAO = Factory.createCustomerDAO();

			customerBeanRet = employeeDAO.updateCustomerBillById(customerBean);
			if(customerBeanRet==null){
				throw new Exception("Given CustomerId is invalid, please try with a valid CustomerId");
			}
		} catch (Exception exception) {
			throw exception;
		}
		return customerBeanRet;
	}


	@Override
	public CustomerBean deleteCustomerById(Integer customerId) throws Exception {
		CustomerBean customerBeanRet =null;
		try {
			
			CustomerDAO customerDAO = Factory.createCustomerDAO();

			customerBeanRet = customerDAO.deleteCustomerById(customerId);
			
			
			if(customerBeanRet==null){
				throw new Exception("Given CustomerId is invalid, please try with a valid CustomerId");
			}
		} catch (Exception exception) {
			throw exception;
		}
		return customerBeanRet;
	}
	public List<CustomerBean> getCustomersWithinDateRange(Date lowerBound,Date upperBound) throws Exception{
		List<CustomerBean> list=null;
		try {
			CustomerDAO customerDAO = Factory.createCustomerDAO();
			
			list = customerDAO.getCustomersWithinDateRange(lowerBound,upperBound);
			
		} catch (Exception exception) {
			throw exception;
		}
		return list;
	}
	
	
	
	public Integer updateCustomerBillByName(String name, Double bill)throws Exception{
		Integer ret=null;
		try {
			CustomerDAO customerDAO = Factory.createCustomerDAO();
		
			
			ret = customerDAO.updateCustomerBillByName(name,bill);
			
		} catch (Exception exception) {
			throw exception;
		}
		return ret;
	}

}
