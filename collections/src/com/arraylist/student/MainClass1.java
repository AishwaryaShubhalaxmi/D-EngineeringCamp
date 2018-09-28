package com.arraylist.student;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the number of students");
      ArrayList<Student> arr= new ArrayList<Student>();
      int n= sc.nextInt();
      for(int i=0;i<n;i++){
    	  Student s= new Student();
    	  System.out.println("enter id");
    	  int id=sc.nextInt();
    	  s.setId(id);
    	  System.out.println("enter name");
    	  String name=sc.next();
    	  s.setName(name);
    	  System.out.println("enter marks");
    	  float marks=sc.nextFloat();
    	  s.setMarks(marks);
    	  
    	 arr.add(s);
      }
      for(Student s:arr){
    	  System.out.println(s.getId() + s.getName() + s.getMarks());
      }
	}

}
