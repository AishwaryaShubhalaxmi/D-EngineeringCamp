package com.hashmap.campusmind;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Camp {

	public static void main(String[] args) {
	
		HashMap<String,CampusMind> hm= new HashMap<String,CampusMind>();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of campus minds");
		int n= sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("enter mid");
			String mid=sc.next();
			CampusMind cm= new CampusMind();
			System.out.println("enter name");
			String name=sc.next();
			cm.setName(name);
			System.out.println("enter track");
			String track= sc.next();
			cm.setTrack(track);
			System.out.println("enter doj");
			String date=sc.next();
			try {
				Date doj=new SimpleDateFormat("dd/MM/yyyy").parse(date);
				cm.setDoj(doj);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			hm.put(mid, cm);
		}
          for(Map.Entry<String,CampusMind> entry:hm.entrySet()){
        	  String key= entry.getKey();
        	  CampusMind val=entry.getValue();
        	  System.out.println("mid is: " + key );
        	  System.out.println("other details are: " + val.getName() + val.getTrack() + val.getDoj());
          }
          
          Set<Map.Entry<String,CampusMind>> s= hm.entrySet();
          ArrayList<Entry<String,CampusMind>> arr= new ArrayList<Map.Entry<String,CampusMind>>(s);
          System.out.println("After sorting by doj");
         // Collections.sort(arr, new NameComparator());  //for comparing by name
        
          Collections.sort(arr,new DOJComparator());   //for comparing by doj
          for(Map.Entry<String, CampusMind> map: arr){
        	  System.out.println(map.getKey());
        	  System.out.println(map.getValue().getName() + map.getValue().getTrack() + map.getValue().getDoj());
          }
          System.out.println("employees at position 2nd to 4th after sorting: ");
          for(int i=1;i<4;i++){
        	  System.out.println(arr.get(i).getValue().getName());
          }
          }
         
	}


