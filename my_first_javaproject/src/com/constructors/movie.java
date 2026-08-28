package com.constructors;

public class movie {
	String Movie;
	String hero;
	String heronie;
	String director;
	String producer;
	movie(String Movie,String hero)
	{
		this.Movie = Movie;
		this.hero = hero;
	}
	
	movie(movie m,String heronie,String director)
	{
		this.Movie = m.Movie;
		this.hero = m.hero;
		this.heronie = heronie;
		this.director = director;
	}
	
	movie(movie m,String producer)
	{
		this.Movie = m.Movie;
		this.hero = m.hero;
		this.heronie = m.heronie;
		this.director =m. director;
		this.producer = producer;
	}
	public static void main(String[] args) {
		movie m = new movie("toxic","yash");
		m.show();
		
		movie m1 = new movie(m,"trisha","Dill Raju");
		m1.show();
		
		movie m2 = new movie(m,"trisha","Dill Raju");
		m2.show();
		
		movie m3 = new movie(m2,"RVG");
		m3.show();
	}
	void show()
	{
		System.out.println(Movie);
		System.out.println(hero);
		System.out.println(heronie);
		System.out.println(director);
		System.out.println(producer);
		System.out.println("-----------------");
	}
}
