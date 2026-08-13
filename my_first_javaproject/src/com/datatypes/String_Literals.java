package com.datatypes;

//SCP Means String Constant Pool
public class String_Literals {

	public static void main(String[] args) {
		boolean ishstlfood=false;
		String st1 = "Abce";
		String st2 = "cyjcc";
		int st3 = 'A';
		char st4 = 69;
		String str = null;
		String s = new String("James");
		String s1 = new String("James");//new Object --> Heap Memory
		String s2="James";
				
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
		System.out.println(str);
		System.out.println(s.equals(s2));
		if(ishstlfood)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
		
		

	}

}
