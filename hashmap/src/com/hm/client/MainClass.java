package com.hm.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.hm.entity.CampusMind;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Integer,CampusMind> hm= new HashMap<Integer,CampusMind>();
       Scanner sc= new Scanner(System.in);
       System.out.println("enter number of minds");
       int n= sc.nextInt();
       for(int i=0;i<n;i++){
    	   CampusMind cm= new CampusMind();
    	   System.out.println("enter mid");
    	   int mid= sc.nextInt();
    	   System.out.println("enter name");
    	   cm.setName(sc.next());
    	   System.out.println("enter marks");
    	   cm.setMarks(sc.nextFloat());
    	   System.out.println("enter date");
    	   String date=sc.next();
    	   try {
			Date dt=new SimpleDateFormat("dd/MM/yyyy").parse(date);
			cm.setDate(dt);
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	   hm.put(mid,cm);
     }
       for(Map.Entry<Integer,CampusMind> hm1:hm.entrySet()){
    	   System.out.println(hm1.getKey());
    	   System.out.println(hm1.getValue().getName() + " " + hm1.getValue().getMarks() + " " + hm1.getValue().getDate());
       }
       //Adding elements of hashmap into treemap
         TreeMap<Integer, CampusMind> tmap= new TreeMap<Integer, CampusMind>(hm);
         for(Map.Entry<Integer,CampusMind> hm2:tmap.entrySet()){
      	   System.out.println(hm2.getKey());
      	   System.out.println(hm2.getValue().getName() + " " + hm2.getValue().getMarks() + " " + hm2.getValue().getDate());
         }
         
       //Adding elements of hashmap into linkedhashmap
         LinkedHashMap<Integer, CampusMind> lhmap= new LinkedHashMap<Integer, CampusMind>();
         lhmap.putAll(hm);
         
	}

}
