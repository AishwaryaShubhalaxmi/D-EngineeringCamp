package com.coll.treeset;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private float salary;
	
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	/*public int compareTo(Employee e){
		if(id>e.id){
			return 1;
		}
		else if(id<e.id){
			return -1;
		}
		
		else return 0;
	}*/
	
	public int compareTo(Employee e){
	
			return this.getName().compareTo(e.getName());
		
		
	}


}
