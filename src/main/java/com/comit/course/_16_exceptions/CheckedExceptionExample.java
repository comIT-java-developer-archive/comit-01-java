package com.comit.course._16_exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Checked Exception doesn't inherit from RuntimeException as UnChecked exceptions do.
 * 
 * With Checked Exceptions:
 * 
 * 1. Handle the Exception.
 * 2. Throw the Exception up to the caller.
 */
public class CheckedExceptionExample {


	void process() {
		
		BufferedReader file = null;
		try {
			file = File.open("testfile.txt",true);
			
			
			
			String line = null;
			
			while((line= File.read(file))!=null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Dear User, the file doesn't exist!");
			
		} catch (IOException e) {
			System.out.println("Dear User, error while reading the file");
			e.printStackTrace();
			
		} finally {
			System.out.println("The finally block is always executed");
			File.close(file);
		}
	
	}
	
	public static void main(String[] args)  {
		
		CheckedExceptionExample obj = new CheckedExceptionExample();
		obj.process();
		
	}
	


}
