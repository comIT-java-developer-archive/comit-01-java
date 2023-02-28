package com.comit.course._06_oop;

/*
 * 
 * Book Pages 89 - 103
 * A Class is construction map or blueprint for creating objects.
 * 
 * A class has three types of elements.
 * 
 * 1. Attributes
 * 2. Constructors
 * 3. Methods
 */
class Employee {
	
	/* 
	 * Attributes - Fields - Properties - Instance Variables 
	 * Variables inside the class.  
	 */	
	int id;
	String name;
	double salary;
	String position;
	
	/*
	 * A Constructor is a special method that is used to
	 * initialize objects. The constructor is called automatically when 
	 * we create an object.
	 * 
	 * A Constructor has the same name of the Class and returns nothing
	 * 
	 * types
	 * 1. Default - Is created by Java when you don't have a constructor.
	 * 2. Parameterized
	 */
	
	Employee(){
		/* Default Constructor created by Java automatically for us
		 * when we don't have any constructor
		 */
	}
	
	Employee(int id, String name, double salary, String position) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.position = position;
	}

	/*
	 * Method is a block of code that runs when it is called.
	 * 
	 * return type - method name - parameters - block of code
	 */
	
	/*
	 * To follow the encapsulation OOP concept we should use 
	 * getters and setters.
	 */
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
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

	void display() { /* method declaration - method signature */
		/*method's body*/		
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(position);
	}
	
	double bonusEmployee(double percentage) {
		/* CamelCase is the convention for naming variables, methods and Classes */	
		double empBonusCompany = (salary * percentage)/100;
		
		return empBonusCompany;
	}


}


public class MyClass {

	public static void main(String[] args) {

		/*
		 * new keyword allocates memory for the object.
		 */
		Employee emp1 = new Employee(); /* Create an object called emp1 from class Employee */
		
		emp1.id = 1020; /* Breaking the OOP Encapsulation Concept */
		emp1.name = "John"; /* Should not access objects attributes directly from other classes */
		emp1.salary = 80000;
		emp1.position = "Manager";
		
		emp1.display();
		
		double bonus = emp1.bonusEmployee(10);
		System.out.println("bonus: " + bonus);
			
		/*
		 * Create emp2 from class Employee
		 */
		
		Employee emp2 = new Employee();
		
		emp2.setId(1030);
		emp2.setName("Jane");
		emp2.setSalary(100000);
		emp2.setPosition("Director");
		
		emp2.display();
		bonus = emp2.bonusEmployee(8);
		System.out.println("bonus: " + bonus);
			
		/*
		 * Create emp3 using a parameterized constructor.
		 */
		Employee emp3 = new Employee(1040,"Mike",90000,"General Accountant");
		
		emp3.display();
		bonus = emp3.bonusEmployee(9);
		System.out.println("bonus: " + bonus);
		
	}

}
