package com.hervey.app;

//Calls the method that creates the needed object

public class BeverageService {
	//using this class and below method(s) allows for flexibility and extensibility
	//currently algorithms for selecing the specific beverage reside in the BeverageMaker class, but some pre-decision-making could end up in this class
	
	static boolean alcohol;
	static boolean flavoring;
	static boolean supersweet;
	static boolean carbonated;
	
	boolean nightTime = false;
	boolean teetotaler = true;
	boolean sweetTooth = false;
	boolean diabetic = true;
	
	static Beverage  processBeverage(boolean fun) { //if not fun, then cheap
		if(!fun) {
			 alcohol = false;
			 flavoring = true;
			 supersweet = false;
			 carbonated = true;
			
		}

		Beverage beverage = BeverageMaker.pickCreateBeverage(alcohol, flavoring, supersweet, carbonated);

		return beverage;
		
		
		
	}
	
	
	

}
