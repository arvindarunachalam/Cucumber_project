package com.program;

public class NextRiding extends Overriding_Method {

	@Override
	public void seriesName(String name) {
	 super.seriesName(name);
	}
	
	@Override
	public void seriesId(int id) {
		super.seriesId(id);
	}
	
	public static void main(String[] args) {
		
		NextRiding h = new NextRiding();
		
		
		h.seriesName("Lucifer");
		h.seriesId(01);
		
		
		
		
	}
	
	
	
	
	
	
	
}
