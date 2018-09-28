package com.hashmap.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<Integer,String> hm= new HashMap<Integer,String>();
    hm.put(5, "red");
    hm.put(3, "yellow");
    hm.put(4, "pink");
    hm.put(2, "green");
    hm.put(1, "black");
    
    ArrayList<Integer> arr= new ArrayList<Integer>(hm.keySet());
    Collections.sort(arr);
    for(int x:arr){
    	System.out.println("key: " + x );
    	System.out.println("value: " + hm.get(x));
    }
    
	}

}
