package com.accenture.lkm;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> empNames = new ArrayList<>();
		
		empNames.add("Vishal");
		empNames.add("Riya");
		empNames.add(1,"Ram");
		empNames.add(0,"Shree");
		
		System.out.println(empNames);
	}
}
