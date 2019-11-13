package com.accenture.lkm;

public class EmployeeDoesNotExistException extends Exception {
	private static final long serialVersionUID = 1;
		
	public EmployeeDoesNotExistException (String message) {
		super(message);
	}
}
