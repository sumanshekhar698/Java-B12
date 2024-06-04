package com.java.oops.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetExample {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>() {
			{
				add(5);
				add(57);
				add(2);
				add(5);
				add(5);
				add(15);
				add(2);
			}
		};
		
		System.out.println(list);
		HashSet<Integer> set = new HashSet<Integer>();
				
		for (Integer num: list) {
			set.add(num);
		}
		
		System.out.println(set);
		Set<Integer> collect = list.stream().collect(Collectors.toSet());
		System.out.println(collect);
		
		System.out.println(collect.contains(2));
		

	}

}
