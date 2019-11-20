package com.acc.dao;

import java.util.ArrayList;
import java.util.List;

import com.acc.bean.EmployeeBean;
import com.acc.entity.EmployeeEntity;

public interface EmployeeDao {
	public ArrayList<Integer> addEmployee(List<EmployeeBean> employeeBeanList);

	public int deleteEmployee();
}
