package com.arraylist.comparator;

import java.util.Comparator;

  public class NameComparator implements Comparator<Student2> {
	
	public int compare(Student2 st1, Student2 st2){
		return (st1.getName().compareTo(st2.getName()));
	}

}
