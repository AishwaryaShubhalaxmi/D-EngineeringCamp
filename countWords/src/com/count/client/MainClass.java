package com.count.client;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sentence");
		String sentence=sc.nextLine();
		String[] arr=sentence.split("\\W");
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
}
}