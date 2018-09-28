package com.coll.list;

public class Student implements Comparable<Student> {

	private int id;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		// TODO Auto-generated constructor stub
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
	private String name;
	
	public int compareTo(Student s1){
		if(id> s1.id){
			return 1;}
			else if(id<s1.id){
				return -1;
			}
			else return 0;
		}
		
	}
	

