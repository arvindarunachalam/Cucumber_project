package com.program;

public class overloading_program {

	public void studentDetails(int a) {
		System.out.println(a);
	}
	
	public void studentDetails (String name,String course,int register) {
		System.out.println(name+" "+course+" "+register);
	}
	
	public void studentDetails(int a,int b,int c) {
		System.out.println(a+" "+b+" "+c);
	}
	
	public static void main(String[] args) {
		
		overloading_program h = new overloading_program();
				
				h.studentDetails(7);
		        h.studentDetails("arvind", "java", 7656);
		        h.studentDetails(99, 66, 87);
		
	}
	
	
     
	
	
}
