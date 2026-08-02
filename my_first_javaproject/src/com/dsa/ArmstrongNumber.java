package com.dsa;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 10;
		//int orginal = num;
		int sum = 0;
		
		for(;num > 0;num = num/10 )
		{
			int t = num % 10;
			sum = sum + (t*t*t);
			
			//System.out.println(sum);
		}
		System.out.println(sum);
	}

}
