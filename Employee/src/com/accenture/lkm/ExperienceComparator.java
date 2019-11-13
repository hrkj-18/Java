package com.accenture.lkm;

import java.util.Comparator;

public class ExperienceComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getYearsOfExperience() - o2.getYearsOfExperience();
	}

}
