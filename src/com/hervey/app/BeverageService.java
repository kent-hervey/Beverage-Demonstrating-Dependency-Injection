package com.hervey.app;

import com.hervey.app.Beverage;
import com.hervey.app.BeverageMaker;

//Calls the method that creates the needed object

public class BeverageService {
	// using this class and below method(s) allows for flexibility and extensibility
	// algorithms for selecting the specific beverage reside in the BeverageMaker
	// class, this service provides logic for selection

	static boolean alcohol;
	static boolean flavoring;
	static boolean supersweet;
	static boolean carbonated;

	static Beverage processBeverage(boolean fun, int userID, boolean isPortable) { // if not fun, then cheap
		// below simulates results of calling service to determine user's attributes
		//to be updated
		boolean nightTime = false;
		boolean teatotaler = true;
		boolean sweetTooth = true;
		boolean diabetic = false;
		Beverage beverage = null;

		if (!fun) {
			beverage = BeverageMaker.pickCreateBeverage(false, false, false, false); // alcohol, flavoring, supersweet,
																						// carbonated

		}

		else {
			if (!nightTime && teatotaler && !diabetic && !sweetTooth) {
				beverage = BeverageMaker.pickCreateBeverage(false, true, false, true);
			}
			else {
				beverage = BeverageMaker.pickCreateBeverage(false, false, false, true);
			}
			//add more conditions here

		}

		if (isPortable) {
			if (!beverage.isItResealable()) {
				BeverageMaker.giveMeTapWater();
			}
		}

		return beverage;

	}

}
