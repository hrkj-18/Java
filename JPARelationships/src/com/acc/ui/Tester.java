package com.acc.ui;

import com.acc.bean.EmployeeBean;
import com.acc.entity.EmployeeEntity;
import com.acc.service.EmployeeService;
import com.acc.service.EmployeeServiceImpl;

public class Tester {

	public static void main(String[] args) {
		addEmp();
		deleteEmp();

	}

	private static void addEmp() {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setLocation("Bangalore");
		employeeBean.setName("Vishel");

		EmployeeService serivce = new EmployeeServiceImpl();
		int id = serivce.addEmployee(employeeBean);
		System.out.println("Employee created with id : " + id);
	}

	private static int deleteEmp() {
		return 0;

	}
}
