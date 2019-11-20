package com.acc.service;

import java.util.ArrayList;
import java.util.List;

import com.acc.bean.EmployeeBean;
import com.acc.dao.EmployeeDao;
import com.acc.dao.EmployeeDaoImpl;
import com.acc.entity.EmployeeEntity;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public ArrayList<Integer> addEmployee(List<EmployeeBean> employeeBeanList) {

		EmployeeDao employeeDao = new EmployeeDaoImpl();
		ArrayList<Integer> id = employeeDao.addEmployee(employeeBeanList);
		return id;
	}

	@Override
	public int deleteEmployee() {
		return 0;
	}
}
