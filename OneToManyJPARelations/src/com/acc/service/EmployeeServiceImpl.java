package com.acc.service;

import com.acc.bean.EmployeeBean;
import com.acc.dao.EmployeeDao;
import com.acc.dao.EmployeeDaoImpl;
import com.acc.entity.EmployeeEntity;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public int addEmployee(EmployeeBean employeeBean) {

		EmployeeDao employeeDao = new EmployeeDaoImpl();
		int id = employeeDao.addEmployee(employeeBean);
		return id;
	}

	@Override
	public int deleteEmployee() {
		return 0;
	}
}
