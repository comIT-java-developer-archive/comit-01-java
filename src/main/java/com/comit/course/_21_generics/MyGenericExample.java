package com.comit.course._21_generics;


/*
 * Java Generics enables types to be parameters when defining classes.
 * As of Java 5
 * 
 * E
 * K
 * V
 * N
 * T
 * S,U,V, etc
 */
class MyGeneric<T> {
	
	T data;
	
	public MyGeneric(T data) {
		super();
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}

}


public class MyGenericExample {

	
	public static void main(String[] args) {
		
		MyGeneric<String> obj1 = new MyGeneric<>("ComIT");
		System.out.println(obj1.getData());
		
		MyGeneric<Integer> obj2 = new MyGeneric<>(1);
		System.out.println(obj2.getData());
		
	}
	
}
