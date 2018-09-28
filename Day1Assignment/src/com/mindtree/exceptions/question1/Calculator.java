package com.mindtree.exceptions.question1;

public class Calculator {
	
	
	public static int add(int number1, int number2){
		
		return number1+number2;
	}
	
	public static int subtract(int number1, int number2){
		
		
		return number1-number2;
	}
	
	public static int multiply(int number1, int number2){
		
		
		return number1*number2;
	}
	
	public static double divide(int number1, int number2){
		try{
		if(number2 ==0){
			throw new ArithmeticException();
		}
		}catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");
		}
	     return number1/number2;
	}

}
