package com.comit.course._21_generics;


interface MyGenericInterface<T>{
	
	T getData();
}

class MyGenericImplementation<T> implements MyGenericInterface<T>{

	T data;
	
	public MyGenericImplementation(T data) {
		super();
		this.data = data;
	}

	@Override
	public T getData() {
		return this.data;
	}
		
}

public class MyGenericInterfaceExample {

	public static void main(String[] args) {
		
		MyGenericInterface<String> obj = new MyGenericImplementation<>("ComIT");
		
		System.out.println(obj.getData());
	}
}
