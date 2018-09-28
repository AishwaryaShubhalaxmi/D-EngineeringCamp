package com.arraylist.comparator;

import java.util.Date;


public class Student2 {
	private int id;
	private String name;
	private Date doj;
	private int age;
	public Student2(int id, String name, Date doj, int age) {
		super();
		this.id = id;
		this.name = name;
		this.doj = doj;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Student2(){
		
	}
	
	

}
