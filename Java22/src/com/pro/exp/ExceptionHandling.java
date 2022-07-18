
package com.pro.exp;

public class ExceptionHandling {
            
	 public static void main(String[] args) throws Exception {
		
		 int a=50;
		 
		 try {
			 
			 System.out.println(a/0);
			
		} catch (Exception e) {
           e.printStackTrace();
		}
//		 finally {
//			System.out.println("hai im a human");
//		}
		 //throw
		 
		 for (int i = 0; i <=8; i++) {
			 if (i==8) {
				 
				 throw new Exception();
				
			}
			 
			 System.out.println(i);
			
		}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
	
	
	
	
}
