package com.dsa;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 54551544;
		
		int temp = 0;
		
		for(;num >0;num = num/10)
		{
			int c = num % 10;
			temp = (temp * 10) + c;
			
		}
//	=======================WHILE lOOP=================	
//		while(num > 0)
//		{
//			int l = num % 10;
//			temp = (temp * 10) + l;
//			
//			num = num/10;
//			
//			
//		}
		System.out.println(temp);
	}

}
