package com.constructors.prog2;

public class Calculate {

	public static void main(String[] args) {
		
     Calculator cal= new Calculator(20,30);
     int sum1=cal.add(10);
     System.out.println(sum1);
     Calculator cal1= new Calculator(20,30);
     float sum3=cal1.add(20);
     System.out.println(sum3);
     Calculator cal2=new Calculator();
     float sum4=cal2.multiply(10,20);
     System.out.println(sum4);
	}

}
