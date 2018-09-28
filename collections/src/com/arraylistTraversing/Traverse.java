package com.arraylistTraversing;

import java.util.ArrayList;
import java.util.Iterator;

public class Traverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String> arr= new ArrayList<String>();
    arr.add("one");
    arr.add("two");
    arr.add("three");
    arr.add("four");
    
    //indexed for loop
    for(int i=0;i<arr.size();i++){
    	System.out.println(arr.get(i));
    }
    
    //for-each loop
    for(String str:arr){
    	System.out.println(str);
    }
    
    //iterator
    Iterator itr=arr.iterator();
    while(itr.hasNext()){
    	System.out.println(itr.next());
    }
	}

}
