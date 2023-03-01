package com.comit.course._08_inheritance;


/*
 * All classes in Java extend the Object Class
 */
class Parent extends Object {
	
	String name;
	int age;
	
	Parent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
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
	 * Overriding
	 * When we override in the Child class a method inherited from
	 * a parent class. The method() in the child class must have
	 * the same signature is in the parent class.
	 * 
	 * The signature of a method() in Java is the method declaration:
	 * return type - method name - parameters
	 * 
	 * Overriding with Overloading is a form of polymorfism.
	 */
	@Override
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + "]";
	}	
	
}

/*
 * Constructors are not inherited.
 * Children must implement their own constructor.
 * But the Child constructor must call the Parent Constructor using super() 
 */
class Child extends Parent {

	Child (String name, int age) {
		// super() refers to the immediate parent class.
		super(name, age);
	}

	@Override
	public String toString() {
		return "Child [name=" + name + ", age=" + age + "]";
	}
	
}




public class Basic {

	public static void main(String[] args) {

		Child obj = new Child("Mike",20);
		
		System.out.println(obj);
	}

}
