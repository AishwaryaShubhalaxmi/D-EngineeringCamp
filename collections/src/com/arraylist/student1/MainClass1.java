package com.arraylist.student1;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Students> arr= new ArrayList<Students>();
        Students s1= new Students(1,"Aish",40);
        Students s2= new Students(2,"Aishu",50);
        Students s3= new Students(3,"Asish",60);
        
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        //using for each loop
        for(Students s:arr){
        	System.out.println(s.id + " " + s.name + " " + s.marks);
        }
         
        //using iterator
        Iterator itr = arr.iterator();
        while(itr.hasNext()){
        	Students st= (Students)itr.next();
        	System.out.println(st.id + " " + st.name + " " + st.marks);
        }
        
        //using indexed for loop
        for(int i=0;i<arr.size();i++){
        	System.out.println(arr.get(i).id +" " + arr.get(i).name + " " + arr.get(i).marks);
        }

	}

}
