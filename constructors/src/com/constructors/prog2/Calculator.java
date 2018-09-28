package com.constructors.prog2;

public class Calculator {
	int a;
	int b;
	float c;
	float d;
	public Calculator(){
		
	}
	public Calculator(int a, int b){
		this.a=a;
		this.b=b;
	}
	public Calculator(float c,float d){
		this.c=c;
		this.d=d;
	}
	int add(int i){
		int sum= a+b+i;
		return sum;
	}
	float add(float f){
		float sum2= c+d +f;
		return sum2;
	}
	float multiply(double d1,double d2){
		float mul= (float)(d1*d2);
		return mul;
	}
	

}
