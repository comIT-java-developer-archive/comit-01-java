package com.comit.course._24_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

public class StreamExample {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(1,"HP Laptop",     25000));
		list.add(new Product(2,"Dell Laptop",   30000));
		list.add(new Product(3,"Lenovo Laptop", 28000));
		list.add(new Product(4,"Sony Laptop",   28000));
		list.add(new Product(5,"Apple Laptop",  90000));
		
		/*
		 * Create a list of prices smaller than 30000 
		 */
		List<Double> prices = new ArrayList<>();
		
		/*
		 * Imperative Programming
		 * 
		for (Product product : list) {
			
			if (product.getPrice() < 30000) {
				prices.add(product.getPrice());
			}
		}*/
		
		/*
		 * Functional Programming
		 * As of Java 8 - 2014
		 */
//		prices = list.stream().filter( p -> p.getPrice() < 30000 )
//		                    .map(p-> p.getPrice())
//		                    .collect(Collectors.toList());
//		System.out.println(prices);
		long a = list.stream().filter( p -> p.getPrice() < 30000 ).count();
		
		System.out.println(a);
		
	}
}
