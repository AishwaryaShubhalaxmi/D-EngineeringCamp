package com.hm.entity;

import java.util.Date;

public class CampusMind {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public CampusMind(String name, float marks, Date date) {
		super();
		this.name = name;
		this.marks = marks;
		this.date = date;
	}
	public CampusMind() {
		// TODO Auto-generated constructor stub
	}
	private float marks;
	private Date date;
}
