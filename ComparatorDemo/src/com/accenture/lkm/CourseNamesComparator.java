package com.accenture.lkm;

import java.util.Comparator;

public class CourseNamesComparator implements Comparator<Course> {

	@Override
	public int compare(Course o1, Course o2) {
		// TODO Auto-generated method stub
		return o1.getCourseName().compareTo(o2.getCourseName());
	}

}
