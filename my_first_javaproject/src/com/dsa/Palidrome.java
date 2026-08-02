package com.dsa;

public class Palidrome {
	
	

	public static void main(String[] args) {
		int num =2233;
		
		int orginal = num;
		
		int M = 0;
		
//		for(;num > 0;num = num/10)
//		{
//			int l = num % 10;
//			reverse = (reverse*10) + l;		
//		
//		}
		
		while(num > 0)
		{
			int l = num % 10;
			M = M * 10 + l;
			num = num/10;
		}
		if(orginal == M) {
			System.out.println("Plaidrome");
		}
		else {
			System.out.println("Not Plaidrome");
		}

	}

}
