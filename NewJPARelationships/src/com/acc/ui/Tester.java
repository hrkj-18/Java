package com.acc.ui;

import com.acc.bean.AddressBean;
import com.acc.bean.EmployeeBean;
import com.acc.entity.AddressEntity;
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
		employeeBean.setLocation("Mumbai");
		employeeBean.setName("Harsh");
		
		AddressBean addressBean = new AddressBean();
		addressBean.setCity("Mumbai");
		addressBean.setZipcode(400080);
		
		employeeBean.setAddr(addressBean);

		EmployeeService serivce = new EmployeeServiceImpl();
		int id = serivce.addEmployee(employeeBean);
		System.out.println("Employee created with id : " + id);
	}

	private static int deleteEmp() {
		return 0;

	}
}
