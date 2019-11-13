package com.accenture.lkm;

import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1000,"Harsh",1,50000);
		Employee emp2 = new Employee(1001,"Vishel",1,50000);
		Employee emp3 = new Employee(1002,"Shrabbi",0,50000);
		Employee emp4 = new Employee(1003,"Murlox",0,50000);
		
		List<Employee> empList = new ArrayList<>(); 
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		EmployeeService service = new EmployeeService();
		
		service.printEmployeeDetails(empList);
		
	}

}
