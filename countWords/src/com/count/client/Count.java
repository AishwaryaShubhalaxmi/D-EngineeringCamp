package com.count.client;

public class Count {
	
public void countwords(String text){
	String[] arr=text.split("\\W");
	String word="";
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+ " ");
	}
     int count=1;
     for(int i=0;i<arr.length;i++){
    	 for(int j=i+1;j<arr.length;j++){
    	 if(arr[i].equalsIgnoreCase(arr[j])){
    		 count++;
    		 word=arr[i];
    		     	     
    	 }
    	 while(count>1){
	    	 System.out.println(word + " " + count);
	     }	 

     }
        
	}
}

}
