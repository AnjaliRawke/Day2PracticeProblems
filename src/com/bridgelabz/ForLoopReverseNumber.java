package com.bridgelabz;

public class ForLoopReverseNumber {
	 public void Reverse() {
        	int reverse = 0;  
        	for(int i = 2345;i!=0;i=i/10)   
        	{  
        	int remainder = i % 10;  
        	reverse = reverse * 10 + remainder;  
        	 
        	System.out.println("The Reverse Of i is: " +reverse);
        	}
         }	
public static void main(String[] args) {
	ForLoopReverseNumber Obj=new ForLoopReverseNumber();
	Obj.Reverse();
	           	
         
         }
}


