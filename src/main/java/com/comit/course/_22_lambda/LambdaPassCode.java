package com.comit.course._22_lambda;

import java.util.function.BiFunction;

public class LambdaPassCode {

	
	public static void main(String[] args) {
		
		BiFunction<Double,Double,Double> addition = (a,b) -> a + b;
		BiFunction<Double,Double,Double> subtract = (a,b) -> a - b;
		BiFunction<Double,Double,Double> multipli = (a,b) -> a * b;
		BiFunction<Double,Double,Double> division = (a,b) -> a / b;
		
		
		System.out.println( LambdaPassCode.executeOperation(addition, 6.0, 4.0));
		System.out.println( LambdaPassCode.executeOperation(subtract, 6.0, 4.0));
		System.out.println( LambdaPassCode.executeOperation(multipli, 6.0, 4.0));
		System.out.println( LambdaPassCode.executeOperation(division, 6.0, 4.0));

	}
	
	static Double executeOperation(BiFunction<Double,Double,Double> ope, Double a, Double b) {
		return ope.apply(a, b);
	}

}
