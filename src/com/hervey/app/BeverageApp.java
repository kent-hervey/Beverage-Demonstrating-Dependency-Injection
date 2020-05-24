package com.hervey.app;

public class BeverageApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Beverage beverage = BeverageService.processBeverage();
		
		System.out.println("returned beverage object is:  " + beverage);

	}

}
