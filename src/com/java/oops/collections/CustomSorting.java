package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomSorting {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(3, "Sam"));
		list.add(new Student(65, "Samy"));
		list.add(new Student(2, "Sam"));
		list.add(new Student(23, "Samantha"));
		list.add(new Student(93, "Ravi"));
		list.add(new Student(43, "Anthony"));
		list.add(new Student(356, "Aman"));

		list.forEach(System.out::println);
		Collections.sort(list, (s1, s2) -> {
			return s1.name.compareTo(s2.name);
		});//comparing
		
		
		System.out.println();
		list.forEach(System.out::println);//Multi Factor Sorting

	}

}

//Merge Sort nLogn
//Bubble SOrt Optimized
//Quick Sort

class NameSorter implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}

}
