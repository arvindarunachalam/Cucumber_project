package com.program;

public class String_Methods {

	public static void main(String[] args) {
		
	    String s = "Welcome to home";
	    String s1= "welcome to home";
	    String s2= "  ";
	    String s3= null;
	    String s4= "";
	    String s5= " hello everyone   ";
	    
	    int length = s.length();
	    System.out.println(length);
	    
	    int hashCode = s.hashCode();
		System.out.println(hashCode);
		
	    boolean equals = s.equals(s1);
	    System.out.println(equals);
	    
	    boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		boolean startsWith = s.startsWith("Welcome");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("home");
		System.out.println(endsWith);
		
		boolean contains = s.contains(s1);
		System.out.println(contains);
		
		int indexOf = s.indexOf("e");
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf("e");
		System.out.println(lastIndexOf);
		
		char charAt = s.charAt(8);
		System.out.println(charAt);
	
		String replace = s1.replace("welcome", "getout");
		System.out.println(replace);
		
		String substring = s.substring(5,12);
        System.out.println(substring);	

         boolean empty = s4.isEmpty();
		System.out.println(empty);
		
		System.out.println(s);
		
		String[] split = s.split(" ");
		for (String a : split) {
			System.out.println(a);
			
		}
		
		String trim = s5.trim();
		System.out.println(trim);
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
