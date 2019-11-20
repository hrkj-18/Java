package com.acc.service;

import java.util.ArrayList;
import java.util.List;

import com.acc.bean.EmployeeBean;
import com.acc.entity.EmployeeEntity;

public interface EmployeeService {

	public ArrayList<Integer> addEmployee(List<EmployeeBean> employeeBeanList);

	public int deleteEmployee();
}
