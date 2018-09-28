package com.hm.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.hm.service.ServiceImpl;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		System.out.println("enter the  number of values to be entered");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("enter key");
			int key =sc.nextInt();
			System.out.println("enter value");
			String value=sc.next();
			hm.put(key, value);
		}
		/*for(Map.Entry<Integer,String> hm1: hm.entrySet()){
			System.out.println("key is " + hm1.getKey());
			System.out.println("value is " + hm1.getValue());
			
		}*/
		System.out.println("Before sorting: ");
		Iterator<Map.Entry<Integer, String>> itr= hm.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<Integer, String> entry=itr.next();
			System.out.println("key is " +  entry.getKey());
			System.out.println("value is " + entry.getValue());
		}
		
		System.out.println("After sorting by keys: ");
		ArrayList<Integer> arr= new ArrayList<Integer>(hm.keySet());
		Collections.sort(arr);
	    for(int x:arr){
	    	System.out.println("key is" + x);
	    	System.out.println("value is" + hm.get(x));
	    }
	    
	 System.out.println("After sorting by values:");
	 Set<Map.Entry<Integer,String>> set= hm.entrySet();
	 ArrayList<Map.Entry<Integer, String>> arr1= new ArrayList<Map.Entry<Integer,String>>(set);
	
	 
	 
}
}
