package com.bridgelabz;

public class WhileLoopSumNaturalNo {
	 public void sum() {

		 int num=5;	
		 int sum=0;
		 int i=0;
		 
		 while(i<=num)
		 {
			 sum=sum+i;
			 i++;
		 }
		 
		 System.out.println("The sum of first 5 natural numbers: " + sum);
		 
	}
	       public static void main(String[] args) {
	    	   WhileLoopSumNaturalNo Obj=new WhileLoopSumNaturalNo();
	      	 Obj.sum();
	       }
	       
	}

