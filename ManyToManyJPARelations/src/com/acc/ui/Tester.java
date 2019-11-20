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
		EmployeeBean employeeBean1 = new EmployeeBean();
		employeeBean1.setLocation("Mumbai");
		employeeBean1.setName("Harsh");
		
		EmployeeBean employeeBean2 = new EmployeeBean();
		employeeBean2.setLocation("Bangalore");
		employeeBean2.setName("Vishel");
		
		EmployeeBean employeeBean3 = new EmployeeBean();
		employeeBean3.setLocation("Adelaide");
		employeeBean3.setName("Murloxx");
		
		AddressBean addressBean1 = new AddressBean();
		addressBean1.setCity("Mumbai");
		addressBean1.setZipcode(400080);
		
		AddressBean addressBean2 = new AddressBean();
		addressBean2.setCity("Nahur");
		addressBean2.setZipcode(400079);
		
		AddressBean addressBean3 = new AddressBean();
		addressBean3.setCity("Thane");
		addressBean3.setZipcode(400081);
		
		List<AddressBean> addressBeanList1 = new ArrayList<AddressBean>();
		addressBeanList1.add(addressBean1);
		addressBeanList1.add(addressBean2);
		
		List<AddressBean> addressBeanList2 = new ArrayList<AddressBean>();
		addressBeanList2.add(addressBean2);
		addressBeanList2.add(addressBean3);
		
		List<AddressBean> addressBeanList3 = new ArrayList<AddressBean>();
		addressBeanList3.add(addressBean3);
		
		employeeBean1.setAddrList(addressBeanList1);
		employeeBean2.setAddrList(addressBeanList2);
		employeeBean3.setAddrList(addressBeanList3);
		
		List<EmployeeBean> employeeBeanList = new ArrayList<EmployeeBean>();

		EmployeeService serivce = new EmployeeServiceImpl();
		ArrayList<Integer> id = serivce.addEmployee(employeeBeanList);
		System.out.println("Employee created with id : " + id);
	}

	private static int deleteEmp() {
		return 0;

	}
}
