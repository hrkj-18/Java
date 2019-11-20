package com.acc.ui;

import java.util.ArrayList;
import java.util.List;

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
		
		AddressBean addressBean1 = new AddressBean();
		addressBean1.setCity("Mumbai");
		addressBean1.setZipcode(400080);
		
		AddressBean addressBean2 = new AddressBean();
		addressBean2.setCity("Nahur");
		addressBean2.setZipcode(400079);
		
		List<AddressBean> addressBeanList = new ArrayList<AddressBean>();
		addressBeanList.add(addressBean1);
		addressBeanList.add(addressBean2);
		
		employeeBean.setAddrList(addressBeanList);

		EmployeeService serivce = new EmployeeServiceImpl();
		int id = serivce.addEmployee(employeeBean);
		System.out.println("Employee created with id : " + id);
	}

	private static int deleteEmp() {
		return 0;

	}
}
