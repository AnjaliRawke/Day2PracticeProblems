package com.bridgelabz;

public class ForLoopSumNaturalNo {
    public void display() {

	
	 int sum=0;
	 
	 for(int i=1;i<=10;i++)
	 {
		 sum=sum+i;
	 }
	 
	 System.out.println("The sum of first 10 natural numbers: " + sum);
	 
}
       public static void main(String[] args) {
    	   ForLoopSumNaturalNo Obj=new ForLoopSumNaturalNo();
      	 Obj.display();
       }
       
}

