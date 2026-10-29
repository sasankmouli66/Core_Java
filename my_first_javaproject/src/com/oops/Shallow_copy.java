package com.oops;

class Student implements Cloneable{
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
	@Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
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

	public static void main(String[] args) throws CloneNotSupportedException{
		
		School add = new School("Apollo School");
		Student s = new Student(1,"sai",2,add);
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.section);
		System.out.println(s.school.schoolAddress);

		Student s1 = (Student) s.clone();
		
		s1.id = 2;
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.section);
		System.out.println(s1.school.schoolAddress);
		
		Student s2 = (Student) s.clone();
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.section);
		System.out.println(s2.school.schoolAddress);
		
	}

}
