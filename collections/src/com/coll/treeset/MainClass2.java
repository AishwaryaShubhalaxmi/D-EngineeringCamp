package com.coll.treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class MainClass2 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of employees");
		TreeSet<Employee> set= new TreeSet<Employee>();
		int n= sc.nextInt();
		for(int i=0;i<n;i++){
			Employee emp= new Employee();
			System.out.println("enter id");
			int id= sc.nextInt();
			emp.setId(id);
			System.out.println("enter name");
			String name= sc.next();
			emp.setName(name);
			System.out.println("enter salary");
			float salary= sc.nextFloat();
			emp.setSalary(salary);
			
			set.add(emp);
			
		}
		for(Employee e: set){
			System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
		}

	}

}
