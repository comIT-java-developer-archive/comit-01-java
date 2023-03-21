package com.comit.course._21_generics;

class MyGeneric2<T> {
	
	T data;
	
	public MyGeneric2(T data) {
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

class MyGenericUtil {
	
	 static <T> boolean compare(MyGeneric2<T> obj1, MyGeneric2<T> obj2) {
		T data1 = obj1.getData();
		T data2 = obj2.getData();
		
		return data1.equals(data2);
	}
}

public class MyGenericMethodExample {

	
	public static void main(String[] args) {
		
		MyGeneric2<String> obj1 = new MyGeneric2<>("apple");
		MyGeneric2<String> obj2 = new MyGeneric2<>("pear");
		
		//MyGenericUtil<String> util = new MyGenericUtil<>();
		
		System.out.println(MyGenericUtil.compare(obj1, obj2));
		
	}
}
