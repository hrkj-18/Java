package com.accenture.lkm;

import java.util.*;

public class EmployeeService {
	public void printEmployeeDetails(List<Employee> employeeList) {
		employeeList.forEach(employee -> System.out.println(employee));
	}

}
