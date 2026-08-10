package com.javaintro;

public class Student_Info {
	static String CollegeName = "Vcube"; 
	int studentID;
	String StudentName;
	char gender;
	String BranchName;
	
	void display()
	{
		System.out.println("College Name   = "+ CollegeName);
		System.out.println("student ID     = "+ studentID);
		System.out.println("Student Name   = "+StudentName );
		System.out.println("Gender         = "+ gender);
		System.out.println("Branch Name    = "+BranchName);
	}
	
	public static void main(String[] args) 
	{
		Student_Info s1 = new Student_Info();
		s1.studentID = 101;
		s1.StudentName = "Sai";
		s1.gender = 'M';
		s1.BranchName = "IT";
		s1.display();
		System.out.println("******************************");
		Student_Info s2 = new Student_Info();
		s2.studentID = 102;
		s2.StudentName = "mouli";
		s2.gender = 'M';
		s2.BranchName = "CSE";
		s2.display();


	}
}
