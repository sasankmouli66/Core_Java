//chaining constructors
package com.constructors;

public class Constructor_chaining {
	int empId;
	String name;
	double salary;
	String company;
	String place;
	
	Constructor_chaining(){
		this(9);
		System.out.println("no argsments");
	}
	
	Constructor_chaining(int empId)
	{       
		this(empId,"Mouli");
		System.out.println("one argsments ");
	}
	
	Constructor_chaining(int empId,String name)
	{       
		this(empId,name,50000);
		System.out.println("two argsments ");
	}
	
	Constructor_chaining(int empId,String name,double salary)
	{       
		this(empId,name,salary,"wipro");
		System.out.println("three argsments ");
	}
	
	Constructor_chaining(int empId,String name,double salary,String company)
	{       
		this(empId,name,salary,company,"hitech");
		System.out.println("four argsments ");
	}
	
	Constructor_chaining(int empId,String name,double salary,String company,String place)
	{       

	    this.empId = empId;
	    this.name = name;
	    this.salary = salary;
	    this.company = company;
	    this.place = place;
           
		System.out.println("five argsments ");
	}

	public static void main(String[] args) {
		Constructor_chaining c1 = new Constructor_chaining();
		c1.show();
	}
	void show()
	{
		System.out.println("Emp id  :"+empId);
		System.out.println("name    :"+name);
		System.out.println("salary  :"+salary);
		System.out.println("company :"+company);
		System.out.println("place   :"+place);
	}
}
