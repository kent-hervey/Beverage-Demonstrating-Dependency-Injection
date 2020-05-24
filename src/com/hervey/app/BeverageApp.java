package com.hervey.app;

public class BeverageApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Beverage beverage = BeverageService.processBeverage(false); //use false to indicate not a fun beverage
		
		System.out.println("returned beverage object is:  " + beverage);
		System.out.println("This beverage has resealable container:    " + beverage.isItResealable());

	}

}
