package com.accenture.lkm;

import java.util.Comparator;

public class CourseDurationComparator implements Comparator<Course> {

	@Override
	public int compare(Course o1, Course o2) {
		// TODO Auto-generated method stub
		return o1.getCourseDuration() - o2.getCourseDuration();
	}

}
