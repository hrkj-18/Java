package com.accenture.lkm;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		int a =10;
		int b = 0;
		int c= 0;
		try {
			c = a/b;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		System.out.println("c = "+c);
	}

}
