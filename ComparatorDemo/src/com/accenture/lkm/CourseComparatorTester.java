package com.accenture.lkm;

import java.util.ArrayList;
import java.util.List;

public class CourseComparatorTester {

	public static void main(String[] args) {
		Course co1 = new Course(1003, "IT", 50, 50034);
		Course co2 = new Course(1002, "Computers", 60, 50065);
		Course co3 = new Course(1001, "Extc", 45, 50012);
		Course co4 = new Course(1000, "Etrx", 55, 50087);

		List<Course> coList = new ArrayList<>();
		coList.add(co1);
		coList.add(co2);
		coList.add(co3);
		coList.add(co4);

		CourseService service = new CourseService();

		service.printAllCoursesFeesSorted(coList);

		service.printAllCoursesNamesSorted(coList);

		service.printAllCoursesDurationSorted(coList);
	}

}
