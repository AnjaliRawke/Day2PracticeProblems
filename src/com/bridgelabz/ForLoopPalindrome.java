package com.bridgelabz;

public class ForLoopPalindrome {
	public void Palindrome() {
		int num = 123 , reversedNum = 0, remainder;
		int originalNum = num;
    for ( num = 123;num!=0;num/=10) {
    	remainder = num % 10;
        reversedNum = reversedNum * 10 + remainder;
    }

    if (reversedNum==originalNum) {
      System.out.println(reversedNum + " is a Palindrome Number.");
    }
    else {
      System.out.println(reversedNum + " is not a Palindrome Number.");
    }
    
	}
public static void main(String[] args) {
	ForLoopPalindrome Obj=new ForLoopPalindrome();
	Obj.Palindrome();
}
		
}


