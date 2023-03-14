package com.comit.course._17_collections._03_maps;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import com.comit.course._17_collections.Person;

public class PersonMapExample {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>(); // ArrayList
		
		list.add(new Person(2,"John",30)); 
		list.add(new Person(4,"Omar",30)); 
		list.add(new Person(7,"Jane",20)); 
		list.add(new Person(3,"Mike",36)); 
		list.add(new Person(5,"Pete",28)); 
		list.add(new Person(10,"Lily",25)); 
		
		for(Person p: list) {			
			if (p.getId()==5) {
				//System.out.println(p);
				break;
			}
		}
		
		/*
		 * Map are useful when we need to search by a key.
		 */
		Map<Integer,Person> map = new Hashtable<>();
		
		map.put(2, new Person(2,"John",30));
		map.put(4, new Person(4,"Omar",30));
		map.put(7, new Person(7,"Jane",20));
		map.put(3, new Person(3,"Mike",36));
		map.put(5, new Person(5,"Pete",28));
		map.put(10, new Person(10,"Lily",25));
		
		System.out.println(map.get(5));
	}
	
	void hello() {
		Map<Integer,Person> map = new Hashtable<>();
		
		map.put(2, new Person(2,"John",30));
		map.put(4, new Person(4,"Omar",30));
		map.put(7, new Person(7,"Jane",20));
		map.put(3, new Person(3,"Mike",36));
		map.put(5, new Person(5,"Pete",28));
		map.put(10, new Person(10,"Lily",25));
		
		System.out.println(map.get(5));	
	}

}
