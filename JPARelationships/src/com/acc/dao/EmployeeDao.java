package com.acc.dao;

import com.acc.bean.EmployeeBean;

public interface EmployeeDao {
	public int addEmployee(EmployeeBean employeeBean);

	public int deleteEmployee();
}
