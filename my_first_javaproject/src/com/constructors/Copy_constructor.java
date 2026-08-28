package com.constructors;

public class Copy_constructor {
	String classname;
	int Sid;
	String sname;
	int marks;

	Copy_constructor(String classname,int Sid,String sname,int marks)
	{
		this.classname = classname;
		this.Sid = Sid;
		this.sname = sname;
		this.marks = marks;
	}
	
	Copy_constructor(Copy_constructor  c)
	{
		this.classname = c.classname;
		this.Sid = c.Sid;
		this.sname = c.sname;
		this.marks = c.marks;
	}

	public static void main(String[] args) {
		Copy_constructor s = new Copy_constructor("10th",101,"smith",250);
		s.show();
		
		Copy_constructor s1 = new Copy_constructor(s);
		s1.show();
	}
	void show()
	{
		System.out.println("Class Name :"+classname);
		System.out.println("sid        :"+Sid);
		System.out.println("sname      :"+sname);
		System.out.println("marks      :"+marks);
		System.out.println("=====================================");
	}
}
