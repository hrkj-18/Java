package com.acc.service;

import com.acc.bean.EmployeeBean;
import com.acc.entity.EmployeeEntity;

public interface EmployeeService {

	public int addEmployee(EmployeeBean employeeBean);

	public int deleteEmployee();
}
