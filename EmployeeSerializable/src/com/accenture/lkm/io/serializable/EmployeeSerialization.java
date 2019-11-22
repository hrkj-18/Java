package com.accenture.lkm.io.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.Duration;
import java.time.LocalDate;

public class EmployeeSerialization {

	public static void main(String[] args) throws IOException {
		Employee e = getEmp();
		saveEmployee(e);
		readEmployee();
	}

	public static void saveEmployee(Employee e) throws IOException {
		try (FileOutputStream fout = new FileOutputStream(
				"C:\\Harsh\\Java\\EmployeeSerializable\\src\\employee\\employee.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fout);) {
			Employee.setCompanyName("Acn India");
			oos.writeObject(e);

			System.out.println("Object saved");
		}

	}

	private static Employee getEmp() {

		Employee e = new Employee();
		e.setId(100);
		e.setName("John");
		LocalDate dob = LocalDate.of(1997, 01, 01);

		e.setDob(dob);

		e.setAge(calculateAge(dob));
		// Address address=new Address();
		// e.setAddress(address);
		return e;
	}

	public static void readEmployee() {
		try (FileInputStream fin = new FileInputStream(
				"C:\\Harsh\\Java\\EmployeeSerializable\\src\\employee\\employee.dat");
				ObjectInputStream oin = new ObjectInputStream(fin);) {
			Employee e = (Employee) oin.readObject();
			System.out.println(e.toString());
			System.out.println("age: " + e.getAge());// 25 0
			System.out.println("Company: " + Employee.getCompanyName());// Accenture or AcnIndia
		} catch (IOException | ClassNotFoundException io) {
			System.out.println(io.getMessage());

		}

	}

	private static int calculateAge(LocalDate dob) {
		LocalDate today = LocalDate.now();
		Duration duration = Duration.between(dob.atStartOfDay(), today.atStartOfDay());
		return (int) Math.abs(duration.toDays());
	}

}
