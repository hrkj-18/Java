package com.accenture.lkm;

import java.util.Scanner;

public class FindEmployeeDemo {

	public static void findEmp(int index) throws EmployeeDoesNotExistException{
		String[] names = {"tom","jack","mike"};
		if(index<0 || index>2) {
			throw new EmployeeDoesNotExistException("Employee Does Not Exist");
		}
		System.out.println(names[index]);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter index [1-5] to find emp name");
		try(Scanner sc = new Scanner(System.in);){
			int index = sc.nextInt();
			try {
				findEmp(index);
			} catch (EmployeeDoesNotExistException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
