package com.acc.ui;

import com.acc.service.EmployeeService;
import com.acc.service.EmployeeServiceImpl;

public class Tester {

	public static void main(String[] args) {
		addEmp();
		deleteEmp();

	}

	private static void deleteEmp() {
		
		EmployeeService service = new EmployeeServiceImpl();
		service.addEmployee();
		
	}

	private static void addEmp() {
		// TODO Auto-generated method stub

	}

}
