package com.acc.dao;

import com.acc.bean.EmployeeBean;
import com.acc.entity.EmployeeEntity;

public interface EmployeeDao {
	public int addEmployee(EmployeeBean employeeBean);

	public int deleteEmployee();
}
