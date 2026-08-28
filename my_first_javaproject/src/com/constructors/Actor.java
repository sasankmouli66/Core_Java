//Create:
//Parent class: Actor
//Child class: Son
//Parent has:
//age
//moviesCount
//Child has:
//name
package com.constructors;

class Actor1
{
	int age;
	Actor1(int age)
	{
		System.out.println("Age son");
		this.age = age;
	}
	
}
public class Actor extends Actor1{
	int countmovie;
	Actor(int age,int countmovie)
	{
		super(age);
		this.countmovie = countmovie;
	}
	public static void main(String[] args) {
		
		Actor a = new Actor(20,6);
		a.show();
		
	}
	void show()
	{
		System.out.println("Age         :"+age);
		System.out.println("count movies:"+countmovie);
		
	}
}
