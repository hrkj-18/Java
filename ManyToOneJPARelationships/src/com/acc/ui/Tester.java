package com.acc.ui;

import java.util.ArrayList;
import java.util.List;

import com.acc.bean.AddressBean;
import com.acc.bean.DepartmentBean;
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
		EmployeeBean employeeBean1 = new EmployeeBean();
		employeeBean1.setLocation("Mumbai");
		employeeBean1.setName("Harsh");
		
		EmployeeBean employeeBean2 = new EmployeeBean();
		employeeBean2.setLocation("Mumbai");
		employeeBean2.setName("Vishel");
		
		EmployeeBean employeeBean3 = new EmployeeBean();
		employeeBean3.setLocation("Mumbai");
		employeeBean3.setName("Murloxx");
		
		DepartmentBean deptBean = new DepartmentBean();
		deptBean.setName("IT");
		
		employeeBean1.setDept(deptBean);
		employeeBean2.setDept(deptBean);
		employeeBean3.setDept(deptBean);
		
		List<EmployeeBean> employeeBeanList = new ArrayList<EmployeeBean>();
		employeeBeanList.add(employeeBean1);
		employeeBeanList.add(employeeBean2);
		employeeBeanList.add(employeeBean3);
		
		
		EmployeeService serivce = new EmployeeServiceImpl();
		int id = serivce.addEmployee(employeeBean);
		System.out.println("Employee created with id : " + id);
	}

	private static int deleteEmp() {
		return 0;

	}
}
