package com.comit.course._21_generics;

import java.util.ArrayList;
import java.util.List;


class MyRawGeneric<T> {
	
	T data;
	
	public MyRawGeneric(T data) {
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

/*
 * A raw type is when we create an object of a generic class or interface without
 * any parameter types.
 * 
 * A issue with raw types is that Java cannot verify the data type of the value in 
 * compilation time.
 * 
 */


public class MyRawType {

	
	public static void main(String[] args) {
		
		//MyRawGeneric<Integer> obj1 = new MyRawGeneric<>(1);

		//MyRawGeneric obj2 = new MyRawGeneric("ComIT");
		
		//obj1 = obj2;
		
		//System.out.println( 1 + obj1.getData());
		
		//System.out.println( 1 + "Hello" );
		
		
		List list = new ArrayList();
		
		list.add(Integer.valueOf(2));
		list.add("ComIT");
		
		for (int i=0;i <list.size();i++) {
			Integer a = (Integer)list.get(i);
			System.out.println(a);
		}
				
	}
	
}
