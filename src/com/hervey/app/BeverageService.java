package com.hervey.app;

//Calls the method that creates the needed object

public class BeverageService {
	
	static Beverage  processBeverage() {
		Beverage beverage = BeverageMaker.pickCreateBeverage();
		return beverage;
		
		
		
	}
	
	
	

}
