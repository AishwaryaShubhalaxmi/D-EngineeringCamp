package com.arraylist.comparator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc= new Scanner(System.in);
     System.out.println("enter the number of students");
     int n=sc.nextInt();
     ArrayList<Student2> arr= new ArrayList<Student2>();
     for(int i=0;i<n;i++){
    	 Student2 stu= new Student2();
    	 System.out.println("enter id");
    	 int id=sc.nextInt();
    	 stu.setId(id);
    	 System.out.println("enter name");
    	 String name=sc.next();
    	 stu.setName(name);
    	 System.out.println("enter age");
    	 int age= sc.nextInt();
    	 stu.setAge(age);
    	 System.out.println("enter doj");
    	 String date=sc.next();
    	 try {
			Date doj= new SimpleDateFormat("dd/MM/yyyy").parse(date);
			stu.setDoj(doj);
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	 arr.add(stu);

     }
     
     System.out.println("Before sorting");
     for(Student2 st :arr){
    	 System.out.println(st.getId() + " " + st.getName() + " " + st.getAge() + " " + st.getDoj());
    	 
     }
     System.out.println("After sorting by name");
     Collections.sort(arr,new NameComparator());
     for(Student2 st :arr){
    	 System.out.println(st.getId() + " " + st.getName() + " " + st.getAge() + " " + st.getDoj());
    	 
     }
     System.out.println("After sorting by age");
     Collections.sort(arr,new AgeComparator());
     for(Student2 st :arr){
    	 System.out.println(st.getId() + " " + st.getName() + " " + st.getAge() + " " + st.getDoj());
    	 
     }
     
     
         
	
	}

}
