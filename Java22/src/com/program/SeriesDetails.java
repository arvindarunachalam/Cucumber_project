package com.program;

public class SeriesDetails {
	
	public SeriesDetails() {
		System.out.println("series");
	}
	public SeriesDetails(String name) {
		System.out.println(name);
	}

	public SeriesDetails(int id) {
		System.out.println(id);
		
	}
	public SeriesDetails(float salary) {
		System.out.println(salary);
	}

	public static void main(String[] args) {
		
		SeriesDetails h = new SeriesDetails();
		SeriesDetails h1 = new SeriesDetails("lucifer");
		SeriesDetails h2 = new SeriesDetails(8989);
		SeriesDetails h3 = new SeriesDetails(5600000);
		
		
	}
	
	
	
	
	
	
	
	
	
}
