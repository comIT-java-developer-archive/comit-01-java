package com.comit.course._14_enum;

/*
 * An enum is a special class that represents a group of constants.
 */
enum Size {
	SMALL, MEDIUM, LARGE
}

class Glass {
	
	/*
	 * small = 1
	 * medium = 2
	 * large = 3  
	 */
	/*
	static final int SMALL = 1;
	static final int MEDIUM = 2;
	static final int LARGE = 3;
	*/
	
	Size size;
	
	void setSize(Size size) {
		this.size = size;
	}
	
	void print() {
		System.out.println("Size is " + this.size);
	}
	
}


public class EnumExample {

	public static void main(String[] args) {

		Glass obj = new Glass();
		obj.setSize(Size.LARGE);
		obj.print();
		
	}

}
