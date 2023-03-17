package com.comit.course._21_generics;


class MyMultipleGeneric<S,U>{
	
	S data1;
	U data2;
	
	public MyMultipleGeneric(S data1, U data2) {
		super();
		this.data1 = data1;
		this.data2 = data2;
	}

	public S getData1() {
		return data1;
	}

	public void setData1(S data1) {
		this.data1 = data1;
	}

	public U getData2() {
		return data2;
	}

	public void setData2(U data2) {
		this.data2 = data2;
	}
	
}


public class MyMultipleGenericExample {

	public static void main(String[] args) {
		
		MyMultipleGeneric<Integer,String> obj1 = new MyMultipleGeneric<>(1,"ComIT");	
		System.out.println(obj1.getData1() + " , " + obj1.getData2());

		
		MyMultipleGeneric<String, Integer> obj2 = new MyMultipleGeneric<>("ComIT",1);
		System.out.println(obj2.getData1() + " , " + obj2.getData2());
			
	}
}
