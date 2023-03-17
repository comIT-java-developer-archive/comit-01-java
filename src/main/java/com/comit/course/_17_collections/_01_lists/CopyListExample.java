package com.comit.course._17_collections._01_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyListExample {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("John");
		list1.add("Jane");
		list1.add("Pete");
		list1.add("Mike");
		list1.add("Lily");
		
		
		ArrayList<String> list2 = (ArrayList<String>) list1.clone();
		
		list1.set(2, "Hello");
		
		System.out.println(list2);
		/*System.out.println(list1.size());
		
		
		for(String str: list1) {
			list2.add(str);
		}
		
		list1.clear();
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list2.size());*/
		
		List<Integer> listInt = new ArrayList<>();
		
		
	}

}
