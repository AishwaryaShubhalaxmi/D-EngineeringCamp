package com.constructors.prog1;

class A1{
	int id; 
	String name;
	public A1(){
		this("Aish");  //this will call the second constructor
		System.out.println("Constructor 1 is running");
	}
	public A1(String name){
		this(2,"Aish"); //this will call the third constructor
		System.out.println("Constructor 2 is running");
	}
	
	public A1(int id,String name){
		System.out.println("Constructor 3 is running");
	}
}

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a= new A1();
		A1 b= new A1("Aish");
		A1 c= new A1(2,"Aish");

	}

}
