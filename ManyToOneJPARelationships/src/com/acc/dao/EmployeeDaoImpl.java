package com.acc.dao;

import java.util.ArrayList;
import java.util.List;
import com.acc.bean.DepartmentBean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.acc.bean.AddressBean;
import com.acc.bean.EmployeeBean;
import com.acc.entity.AddressEntity;
import com.acc.entity.DepartmentEntity;
import com.acc.entity.EmployeeEntity;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public int addEmployee(EmployeeBean employeeBean) {
		EntityManagerFactory employeeManagerFactory = Persistence.createEntityManagerFactory("unit1");
		EntityManager employeeManager = employeeManagerFactory.createEntityManager(); // CRUD ops

		// Transfer Bean values in to Entity
		// code

		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setName(employeeBean.getName());
		employeeEntity.setLocation(employeeBean.getLocation());

		AddressBean addressBean = employeeBean.getAddr();
		AddressEntity addressEntity = new AddressEntity();
		addressEntity.setCity(addressBean.getCity());
		addressEntity.setZipcode(addressBean.getZipcode());
		
		employeeEntity.setAddr(addressEntity);

		EntityTransaction addEmployeeTransaction = employeeManager.getTransaction();

		addEmployeeTransaction.begin();

		employeeManager.persist(employeeEntity);

		int id = employeeEntity.getId();

		addEmployeeTransaction.commit();

		addEmployeeTransaction.commit();

		// Close the Manager and Manager Factory
		employeeManager.close();
		employeeManagerFactory.close();
		return id;
	}

	@Override
	public int deleteEmployee() {
		// TODO Auto-generated method stub
		return 0;
	}

}
