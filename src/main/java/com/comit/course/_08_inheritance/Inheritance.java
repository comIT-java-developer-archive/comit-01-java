package com.comit.course._08_inheritance;

class Person { // Parent Class
	
	String name;
	int age;
	
	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

    /*
     * In general, the toString method returns a string that 
     * "textually represents" this object. 
     */
	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

// DRY Principle - Don't Repeat Yourself (Reuse Code)
class Employee extends Person {	// Child Class
	
	int id;
	double salary;
	String position;
	
	double bonus;
	
	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	String getPosition() {
		return position;
	}

	void setPosition(String position) {
		this.position = position;
	}

	void calculateBonus(double percentage) {
		this.bonus = this.salary * percentage/100;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", position=" + position + ", bonus=" + bonus + ", name="
				+ name + ", age=" + age + "]";
	}

}

class Accountant extends Employee { // Multi-Level Inheritance
	
	
	@Override
	void calculateBonus(double percentage) {
		this.bonus = this.salary * percentage/100 + 2000;
	}
}

class Customer extends Person { // Child Class
	
}


public class Inheritance {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		
		emp1.setName("Joe");
		emp1.setAge(40);
		emp1.setId(1);
		emp1.setSalary(30000);
		emp1.setPosition("Assistant");
		
		emp1.calculateBonus(10);
		
		/*
		 * System.out.println() calls the toString() method automatically when it 
		 * receives an Object.
		 */
		System.out.println(emp1);
		
		Customer cus1 = new Customer();
		
		cus1.setName("John");
		cus1.setAge(45);
		
		/*
		 * System.out.println() calls the toString() method automatically when it 
		 * receives an Object.
		 */
		System.out.println(cus1);
		
		Accountant acc1 = new Accountant();
		
		acc1.setName("Jane");
		acc1.setAge(30);
		acc1.setId(2);
		acc1.setSalary(40000);
		acc1.setPosition("Accountant");
		
		acc1.calculateBonus(10);
		
		/*
		 * System.out.println() calls the toString() method automatically when it 
		 * receives an Object.
		 */
		System.out.println(acc1);
	}

}
