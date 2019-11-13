package com.accenture.lkm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingDemo {
	public static void main(String[] args) {
		List<String> empNames = new ArrayList<>();
		
		empNames.add("Vishal");
		empNames.add("Riya");
		empNames.add(1,"Ram");
		empNames.add(0,"Shree");
		
		System.out.println(empNames);
		
		Collections.sort(empNames);
		
		System.out.println(empNames);
		
	}
}
