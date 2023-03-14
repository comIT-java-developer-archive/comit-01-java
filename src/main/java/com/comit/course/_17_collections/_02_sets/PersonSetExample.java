package com.comit.course._17_collections._02_sets;

import java.util.Set;
import java.util.TreeSet;

import com.comit.course._17_collections.Person;

public class PersonSetExample {

	public static void main(String[] args) {
		
		Set<Person> set = new TreeSet<>();
		
		set.add(new Person("John",30)); 
		set.add(new Person("John",30)); 
		set.add(new Person("Jane",20)); 
		set.add(new Person("Mike",36)); 
		set.add(new Person("Pete",28)); 
		
		
		System.out.println( set.contains(new Person("Mike",36)) );
		
		//set.remove(new Person("Pete",28));
		
		set.forEach(System.out::println);
		
		System.out.println(set.size());
	}
}
