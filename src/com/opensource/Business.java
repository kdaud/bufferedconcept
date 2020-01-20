package com.opensource;


public class Business {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		Equity equity = new Equity();
		Bank bg = null;
		System.out.println(bg instanceof Bank);
		
		System.out.println(equity instanceof Equity);
		System.out.println(bank instanceof Bank);
		System.out.println("oops--------------oops");
		System.out.println(equity instanceof Bank);
		
		Equity obj = (Equity) new Bank();
		obj.setName("Barclays");
		System.out.println(obj.getName());
	}
	
}
