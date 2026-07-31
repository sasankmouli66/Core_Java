package com.javaintro;



public class Student {
	static String CollegeName = "Goadavari University";
	int StudentId;
	String StudentName;
	int Telugu;
	int Hindi;
	int English;
	int Maths;
	int Science;
	int Totalmarks;
	double percentage;
	
	void StudentDetails()

	{
		System.out.println("StudentId : " + StudentId);
		System.out.println("StudentName : "+ StudentName);
		System.out.println("Telugu : "+ Telugu);
		System.out.println("Hindi : "+ Hindi);
		System.out.println("English : "+ English);
		System.out.println("Maths : "+ Maths);
		System.out.println("Science : "+ Science);
		
	}
	
	void totalMarks() 
	{
		 Totalmarks = Telugu + Hindi + English + Maths + Science;
		 System.out.println("Total Marks : "+ Totalmarks);
	}
	
	void Percentage()
	{
		percentage = (Totalmarks / 500.0) * 100 ;
		System.out.println("Percentage : "+ percentage);
	}
	
	public static void main(String[] args) {
		
	System.out.println(CollegeName);
	Student s1 = new Student();
	s1.StudentId = 101;
	s1.StudentName = "sunil";
	s1.Telugu = 55;
	s1.Hindi = 60;
	s1.English = 56;
	s1.Maths = 96;
	s1.Science = 88;
	s1.StudentDetails();
	s1.totalMarks();
	s1.Percentage();
	
	System.out.println("--------------------------------------------");
	
	System.out.println(CollegeName);
	Student s2 = new Student();
	s2.StudentId = 101;
	s2.StudentName = "sunil";
	s2.Telugu = 55;
	s2.Hindi = 60;
	s2.English = 56;
	s2.Maths = 96;
	s2.Science = 88;
	s2.StudentDetails();
	s2.totalMarks();
	s2.Percentage();
	

	}

}
