package com.accenture.lkm;

import java.util.Collections;
import java.util.List;

public class CourseService {
	public void printAllCoursesFeesSorted(List<Course> courseList) {
		CourseFeesComparator fees = new CourseFeesComparator();
		Collections.sort(courseList, fees);
		courseList.forEach(course -> System.out.println(course));
	}

	public void printAllCoursesNamesSorted(List<Course> courseList) {
		CourseNamesComparator names = new CourseNamesComparator();
		Collections.sort(courseList, names);
		courseList.forEach(course -> System.out.println(course));
	}

	public void printAllCoursesDurationSorted(List<Course> courseList) {
		CourseDurationComparator duration = new CourseDurationComparator();
		Collections.sort(courseList, duration);
		courseList.forEach(course -> System.out.println(course));
	}
}
