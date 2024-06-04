package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.java.oops.static_concept.Employee;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("hey");
		list.add(true);
//		list.add(new Employee("John", "Code County", "emp12", 34));
		list.add(54.6);
		list.add(null);

		System.out.println(list);

		ArrayList<Integer> listOfNum = new ArrayList<Integer>();// Generics

		listOfNum.add(23);
		listOfNum.add(23);
		listOfNum.add(2343);
		listOfNum.add(223);
		listOfNum.add(423);
		listOfNum.add(24);
		listOfNum.add(223);

		System.out.println(listOfNum);

//		1. simple for
//		for (int i = 0; i < listOfNum.size(); i++) {
//			listOfNum.add(7);
//			System.out.println(listOfNum.get(i));
//		}

//		2. for each
		for (Integer num : listOfNum) {
//			listOfNum.get(2);
			System.out.print(num + " ");
		}
		System.out.println();

//		3. using iterator
//		TODO try to iterate a collection form reverse using iterator

		Iterator<Integer> itr = listOfNum.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

//		4. streams
		listOfNum.stream().filter(num -> num % 2 != 0).forEach(System.out::println);

		boolean empty = listOfNum.isEmpty();
		System.out.println(listOfNum.contains(98));
		listOfNum.remove(0);
		listOfNum.add(0, 999);//linkedlist
		System.out.println(listOfNum);
		
		//Collections
		Collections.sort(listOfNum);
		System.out.println(listOfNum);
		
		Collections.sort(listOfNum, Collections.reverseOrder());
		System.out.println(listOfNum);
		
		Collections.reverse(listOfNum);
		System.out.println(listOfNum);

		Collections.shuffle(listOfNum);
		System.out.println(listOfNum);

	}

}
