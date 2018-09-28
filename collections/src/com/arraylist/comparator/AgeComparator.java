package com.arraylist.comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class AgeComparator implements Comparator<Student2>{
	public int compare(Student2 st1, Student2 st2){
		if(st1.getAge()==st2.getAge())
			return 1;
		else if (st1.getAge()>st2.getAge())
			return -1;
		else return 0;
	}
	

}
