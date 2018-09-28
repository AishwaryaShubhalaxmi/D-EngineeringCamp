package com.reverseword.client;

import java.util.ArrayList;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc= new Scanner(System.in);
     System.out.println("enter a string");
     String s= sc.nextLine();
     String[] str= s.split(" ");
     ArrayList<String> arr= new ArrayList<String>();
     for(int i=0;i<str.length;i++){
    	 arr.add(str[i]);
     }
     System.out.println("Before reversing: ");
     for(String s1: arr){
    	 System.out.print(s1 + " ");
     }
    System.out.println("After reversing: ");
    StringBuilder sb= new StringBuilder();
    for(int i= str.length-1;i>=0;i--){
    	sb.append(str[i]);
    
    }
    System.out.println(sb.toString().trim());
    
     
   /* ArrayList<String> arr1= new ArrayList<String>();
    for(int j=str.length-1;j>=0;j--){
    	arr1.add(str[j]);
    }
    for(String s2:arr1){
    	System.out.println(s2 + " ");
    }*/
     
	}
	
		

	

}
