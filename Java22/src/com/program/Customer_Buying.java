package com.program;

public class Customer_Buying implements bakery {

	@Override
	public void chips() {
		System.out.println("lays");
		}

	@Override
	public void drinks() {
		System.out.println("pepsi");
		}

	@Override
	public void cake() {
		System.out.println("velvet");
		}

	@Override
	public void sweet() {
		System.out.println("milksweet");
		}
  public static void main(String[] args) {
		
	  Customer_Buying u = new Customer_Buying();
	  u.chips();
	  u.drinks();
	  u.cake();
	  u.sweet();
	  
	  
	}
	
	
}
