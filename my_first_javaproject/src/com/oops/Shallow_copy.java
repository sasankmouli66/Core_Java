package com.oops;

class Student{
	int id;
	String name;
	int section;
	School school;
	public Student(int id,String name,int section,School school) {
		super();
		this.id = id;
		this.name = name;
		this.section = section;
		this.school = school;
		
	}
}

class School{
	String schoolAddress;
	public School(String schoolAddress){
		super();
		this.schoolAddress = schoolAddress;
	}
	
}


public class Shallow_copy {

	public static void main(String[] args) {
		
		School add = new School("Apollo School");
		Student s = new Student(1,"sai",2,add);
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.section);
		System.out.println(s.school.schoolAddress);

		
	}

}
