package org.looping;

public class InnerForLoop {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=7; j++) {
				if (i==4) {
//					break;
					continue;
				}
				
				
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		}
}
