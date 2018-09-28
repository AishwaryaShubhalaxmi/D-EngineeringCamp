package com.coll.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class MainClass {

	public static void main(String[] args){
		ArrayList<Student> arr= new ArrayList<Student>();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no. of students");
		int n= sc.nextInt();
		for(int i=0;i<n;i++){
			Student st= new Student();
			System.out.println("enter name");
			st.setName(sc.next());
			System.out.println("enter id");
			st.setId(sc.nextInt());
			arr.add(st);
		}
		//printing elements of list using for each loop
		for(Student s:arr){
			System.out.print(s.getName() + " " + s.getId());
			System.out.println();
		}
		//printing the elements of list using for loop
		for(int i=0;i< arr.size();i++){
			System.out.println(arr.get(i).getName() + " " +  arr.get(i).getId());
		}
		System.out.println();
		Set<Student> set = new HashSet<Student>(arr);
		//printing the elements of hashset using foreach loop
		for(Student stu:set){
			System.out.print(stu.getName() + " " + stu.getId());
			System.out.println();
		}
		//printing the elements of hashset using iterator
		Iterator itr= set.iterator();
		while(itr.hasNext()){
			Student st1= (Student)itr.next();
			System.out.println(st1.getName() + " " + st1.getId());
		}
		//printing the elements of treeset
		Set<Student> tset= new TreeSet<Student>(arr);
		for(Student st2: tset){
			System.out.println(st2.getName() + " " + st2.getId());
		}
		
	}
}
