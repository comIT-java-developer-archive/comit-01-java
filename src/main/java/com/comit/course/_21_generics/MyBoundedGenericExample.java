package com.comit.course._21_generics;


class MyGeneric3<T extends Number> {
	
	T data;
	
	public MyGeneric3(T data) {
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

public class MyBoundedGenericExample {

	public static void main(String[] args) {
		
		//MyGeneric3<String> obj1 = new MyGeneric3<>("ComIT");
		MyGeneric3<Integer> obj2 = new MyGeneric3<>(1);
		MyGeneric3<Double> obj3 = new MyGeneric3<>(4.27);
		
	}
}
