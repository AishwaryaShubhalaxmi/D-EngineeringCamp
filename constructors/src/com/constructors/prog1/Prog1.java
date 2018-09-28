package com.constructors.prog1;



class A{
	 int id; 
	 String name;
	 public A(int id,String name){
		 this.id=id;
		 this.name=name;
		 
	 }
	 void display(){
		 System.out.println("name is :" + name + " id is: " + id);
	 }
}

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A(2,"Aish");
		a.display();

	}

}
