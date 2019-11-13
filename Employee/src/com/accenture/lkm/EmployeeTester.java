package com.accenture.lkm;

import java.util.*;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1003, "Harsh", 1, 50034);
		Employee emp2 = new Employee(1002, "Vishel", 1, 50065);
		Employee emp3 = new Employee(1001, "Shrabbi", 0, 50012);
		Employee emp4 = new Employee(1000, "Murlox", 0, 500087);

		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);

		EmployeeService service = new EmployeeService();
		service.printEmployeeDetails(empList);

		Collections.sort(empList);
		service.printEmployeeDetails(empList);

		ExperienceComparator expComp = new ExperienceComparator();

		Collections.sort(empList, expComp);
		service.printEmployeeDetails(empList);

	}

}
