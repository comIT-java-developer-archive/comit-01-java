package com.comit.course._17_collections._02_sets;

import java.util.Set;
import java.util.TreeSet;

public class StringSetExample {


	public static void main(String[] args) {
		
		/*
		 * Sets don't allow duplicates.
		 * Sets don't keep the insertion order.
		 */
		// Set<String> set = new HashSet<>(); // Doesn't keep the insertion order.
		// Set<String> set = new LinkedHashSet<>(); // Keeps the insertion order.
		//                                            Uses a HashSet and a List
		Set<String> set = new TreeSet<>(); // Sorts the elements.
		
		set.add("John");
		set.add("John");
		set.add("Jane");
		set.add("Mike");
		set.add("Pete");
		
		// set.remove("Mike");
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains("Mike"));
		
	}
}
