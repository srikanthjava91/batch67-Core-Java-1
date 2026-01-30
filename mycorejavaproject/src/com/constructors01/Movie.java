package com.constructors01;

//Mahesh - Rajamouli 
public class Movie {
	String movieName;
	String hero;
	String heroine;
	double budget;
	String director;

	public Movie() {
		System.out.println("no arg constructor called ");
		movieName = "Production no 25";
		hero = "babu";
	}

	Movie(String director) {
		this();
		this.director = director;
	}

	Movie(Movie m2, String hero, double budget) {
		System.out.println("parameterized constructor called !!");
		this.hero = hero;
		this.budget = budget;
		this.director = m2.director;
	}

	Movie(Movie m, String heroine, String movieName) {
		this.hero = m.hero;
		this.budget = m.budget;
		this.director = m.director;
		this.heroine = heroine;
		this.movieName = movieName;
	}

	void show() {
		System.out.println("*******************");
		System.out.println("Name of the Movie : " + movieName);
		System.out.println("Hero of the Movie : " + hero);
		System.out.println("Heroine of the Movie : " + heroine);
		System.out.println("Budget of the Movie : " + budget);
		System.out.println("Director of the Movie : " + director);
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Movie m1 = new Movie();
		m1.show();

		Movie m2 = new Movie("S S Rajamouli");
		m2.show();

		Movie m3 = new Movie(m2, "Mahesh Babu", 5000000000.00);
		m3.show();

		Movie m4 = new Movie(m3, "Priyanka Chopra ", "SSMB29");
		m4.show();
	}
}
