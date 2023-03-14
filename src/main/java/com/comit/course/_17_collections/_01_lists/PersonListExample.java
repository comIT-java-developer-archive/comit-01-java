package com.comit.course._17_collections._01_lists;

import java.util.LinkedList;
import java.util.List;

import com.comit.course._17_collections.Person;

public class PersonListExample {

	
	public static void main(String[] args) {
		
		Person[] array = new Person[10]; // Array
		
		List<Person> list = new LinkedList<>(); // ArrayList
		
		
		
		list.add(new Person("John",30)); // 0
		list.add(new Person("John",30)); // 1
		list.add(new Person("Jane",20)); // 2
		list.add(new Person("Mike",36)); // 3
		list.add(new Person("Pete",28)); // 4
		
		list.add(2,new Person("Nick",37));

		list.set(2,new Person("Lily",31));
		
		list.remove(new Person("Lily",31));
		
		//list.clear();
		for(Person p: list) {
			System.out.println(p);
		}
		
		System.out.println(list.size());
		
		//list.forEach(System.out::println);
		
		//System.out.println(list.get(2));
		
		//System.out.println( list.indexOf(new Person("Mike",36)) );
		
	}
}
