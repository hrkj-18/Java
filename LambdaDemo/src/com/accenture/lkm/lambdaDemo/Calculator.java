package com.accenture.lkm.lambdaDemo;

public class Calculator {

	public void calculateNumbers(Calculation cal, int a, int b) {
		cal.calculate(a, b);
	}
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		//Addition implementation of Calculation interface
		Calculation addition = (a,b) -> {System.out.println("Addition "+(a+b));};
		
		
		//Subtraction implementation of Calculation interface
		Calculation subtraction = (a,b) -> {System.out.println("Subtraction "+(a-b));};
		
		
		//Multiplication implementation of Calculation interface
		Calculation multiplication = (a,b) -> {System.out.println("Multiplication "+(a*b));};
		
		
		//Division implementation of Calculation interface
		Calculation division = (a,b) -> {System.out.println("Division "+(a/b));};
		
		calculator.calculateNumbers(addition, 10, 5);
		calculator.calculateNumbers(subtraction, 10, 5);
		calculator.calculateNumbers(multiplication, 10, 5);
		calculator.calculateNumbers(division, 10, 5);
	}

}
