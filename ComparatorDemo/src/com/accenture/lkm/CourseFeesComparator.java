package com.accenture.lkm;

import java.util.Comparator;

public class CourseFeesComparator implements Comparator<Course> {

	@Override
	public int compare(Course o1, Course o2) {
		// TODO Auto-generated method stub
		return o1.getCourseFee() - o2.getCourseFee();
	}

}
