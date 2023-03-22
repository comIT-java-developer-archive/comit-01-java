package com.comit.course._22_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaPrintOutArrayList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("John");
		list.add("Jane");
		list.add("Mike");
		list.add("Pete");

		/*
	    for (String str : list) {
			System.out.println(str);
		}*/
	    
	    //Consumer con = n -> System.out.println(n);
		
	    list.forEach(n -> System.out.println(n));
	    
	    list.forEach(System.out::println);
	    
	}
}
