package com.comit.course._12_interface;


/*
 * An interface in Java is like a contract that must be accomplished by
 * the class that implements the interface. 
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
	 * The default keyword indicates that I will implement the method
	 * in the interface to avoid someone else's code
	 */
	default void doSomething2() {
		System.out.println("Doing Something 2");
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

public class InterfaceExample {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.doSomething();
		emp.doSomething2();

	}

}
