package com.bridgelabz;

public class WhileLoopReverseNumber {
            public void Reverse() {
           	int number = 123, reverse = 0;  
           	while(number != 0)   
           	{  
           	int remainder = number % 10;  
           	reverse = reverse * 10 + remainder;  
           	number = number/10;  
           	System.out.println("The Reverse Of Given Numer is: " +reverse);
           	}
            }	
public static void main(String[] args) {
	WhileLoopReverseNumber Obj=new WhileLoopReverseNumber();
	Obj.Reverse();
	           	
            
            }
}
