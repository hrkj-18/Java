package com.accenture.lkm.io.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeReader {

	public static void main(String[] args) {
		readEmployee();

	}

	public static void readEmployee() {
		try (FileInputStream fin = new FileInputStream("C:\\Harsh\\Java\\EmployeeSerializable\\src\\employee\\employee.dat");
				ObjectInputStream oin = new ObjectInputStream(fin);) {
			Employee e = (Employee) oin.readObject();
			System.out.println(e.toString());
			System.out.println("age: " + e.getAge());// 25 0
			System.out.println("Company: " + Employee.getCompanyName());// Accenture or AcnIndia
		} catch (IOException | ClassNotFoundException io) {
			System.out.println(io.getMessage());

		}

	}
}
