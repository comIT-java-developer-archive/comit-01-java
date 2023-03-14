package com.comit.course._17_collections;

import java.util.Objects;

public class Person implements Comparable<Person>{
	
	int id;
	String name;
	int age;
		
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	/* 
	 * Java uses the equals method() to compare Person objects.
	 * If the equals() method is not overridden then Java will
	 * use the memory address.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name); // <------
	}

	@Override
	public int compareTo(Person o) {
		return Integer.valueOf(this.age).compareTo(o.getAge());
	}

	@Override
	public String toString() {
		return String.format("Person [name=%s, age=%s]", name, age);
	}




}
