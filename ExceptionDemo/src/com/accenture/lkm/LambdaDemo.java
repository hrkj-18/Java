package com.accenture.lkm;

import java.util.ArrayList;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> empNames = new ArrayList<>();
		
		empNames.add("Vishal");
		empNames.add("Riya");
		empNames.add(1,"Ram");
		empNames.add(0,"Shree");
		
		System.out.println(empNames);
		
		empNames.forEach(x-> System.out.println(x));
	}

}

