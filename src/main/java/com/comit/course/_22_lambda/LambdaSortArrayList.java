package com.comit.course._22_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Product{
	
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return String.format("Product [id=%s, name=%s, price=%s]", id, name, price);
	}

}

public class LambdaSortArrayList {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(1,"HP Laptop",     25000));
		list.add(new Product(2,"Dell Laptop",   30000));
		list.add(new Product(3,"Lenovo Laptop", 28000));
		list.add(new Product(4,"Sony Laptop",   28000));
		list.add(new Product(5,"Apple Laptop",  90000));
		
		//Comparator<Product> comp = (p1, p2) -> Double.compare( p1.getPrice(), p2.getPrice());
		
		/*
		 * Lambda Expressions allow us to pass code into a method.
		 */
		list.sort((p1, p2) -> Double.compare( p1.getPrice(), p2.getPrice()));
		
		list.forEach(System.out::println);
	}
}
