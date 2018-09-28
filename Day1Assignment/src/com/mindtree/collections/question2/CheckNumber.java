package com.mindtree.collections.question2;

import java.util.ArrayList;
import java.util.List;

/**
 * Check Number
 * 
 */
public class CheckNumber {

	/**
	 * Checks if the given numbers are valid Integer numbers or decimal numbers
	 * 
	 * @param input, a String array of numbers
	 *            
	 * @return  List, a list of string values such as ‘valid Integer number', 'Valid Decimal number' if the numbers are valid 
	 *          and 'Invalid Integer number', 'Invalid Decimal number' if the numbers are invalid 
	 *     
	 */
	public List<String> isNumberValid(String[] input) {
		ArrayList<String> list =new ArrayList<String>();
		if(input!=null)
		{
			for(int i=0;i<input.length;i++){
				int d=0, in=0;
				try{
					double b=Double.parseDouble(input[i]);
					d=1;
					double a=(int) b;
					if(a==b){
						in=1;
						d=0;
					}
				}
				catch(NumberFormatException e){
					d=0;
					in=0;
				}
				
				if(d==0 && in==0){
					list.add("Invalid");
				}
				else if(d==0 && in!=0){
					list.add("Integer");
				}
				else if(in==0 && d==1){
					list.add("Decimal");
				}
			}
		}
		
		else
		{
			list.add("Invalid");
		}
		for(String ob:list){
			System.out.println(ob);
		}
		return list;
	}
}

