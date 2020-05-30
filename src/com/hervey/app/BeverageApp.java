package com.hervey.app;

public class BeverageApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userID;
		boolean isFun;
		boolean isPortable;
		
		//simulates data from user interface for first user
		userID=5;
		isFun = true;
		isPortable = false;
		
		Beverage beverage = BeverageService.processBeverage(isFun, userID, isPortable); //use false to indicate not a fun beverage
		
		System.out.println("returned beverage object is:  " + beverage);
		System.out.println("This beverage has resealable container:    " + beverage.isItResealable());
		
		
		
		

	}

}
