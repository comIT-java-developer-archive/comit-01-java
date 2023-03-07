package com.comit.course._12_interface;


/*
 * An interface in Java is like a contract that must be accomplished by
 * the class that implements the interface. 
 * 
 * We use interfaces to implements the Data Abstraction OOP.
 */
interface Income {

	/*
	 * We declare methods, we just put the method signature.
	 * We don't define the methods body.
	 * A method without a body is an abstract method.
	 * 
	 * All the interface methods are public abstract by default.
	 */
	public abstract double calculatePay(double salary, double taxes);
	
	void doSomething();
	
	/* 
	 * Java 8
	 * 
	 * Interfaces default and static methods where created as a workaround
	 * to allow us to add new methods to old interfaces without breaking
	 * someoneelse's code. 
	 * 
	 * The default keyword indicates that I will implement the method
	 * in the interface to avoid someone else's code
	 */
	default void doSomething2() {
		System.out.println("Doing Something 2");
	}

	static void doSomething3() {
		System.out.println("Doing Something 3");
	}
}

interface Hello {
}

/*
 * An Interface can extend multiple interfaces at the same time.
 * (We can only extend from one class)
 */
interface MyInterface extends Income, Hello {	
}

/* 
 * The class that implements the interface must implement the body of all the abstract methods
 * in the interface.
 */
class Employee implements Income, MyInterface {

	String name;
	int age;
	
	@Override
	public void doSomething() {
		System.out.println("Doing Something");
	}

	@Override
	public double calculatePay(double salary, double taxes) {
		return salary-taxes;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	void display() {
		System.out.println(name + " " + age);
	}
	
}

class MyClass implements Income{

	@Override
	public double calculatePay(double salary, double taxes) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	}
	
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		
		Income emp = new Employee();
		emp.doSomething();
		emp.doSomething2();
		
		((Employee)emp).display();
		
		Income.doSomething3();

	}

}
