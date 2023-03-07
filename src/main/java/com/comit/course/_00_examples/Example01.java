package com.comit.course._00_examples;

class Document {
	
	void print(){
		System.out.println("I am the Document");
	}
}

class Invoice extends Document {
	
	@Override
	void print(){
		System.out.println("I am an Invoice");
	}
}

class Quote extends Document {
	
	@Override
	void print(){
		System.out.println("I am an Quote");
	}
}


public class Example01 {

	public static void main(String[] args) {

		
		Invoice  obj1 = new Invoice();
		Document obj2 = new Invoice();
		
		
		Document[] docs = new Document[6];
		
		docs[0] = new Invoice(); 
		docs[1] = new Quote(); 
		docs[2] = new Quote(); 
		docs[3] = new Invoice(); 
		docs[4] = new Quote(); 
		docs[5] = new Document(); 
		
		for(Document doc : docs) {
			doc.print();
		}
		
	}

}
