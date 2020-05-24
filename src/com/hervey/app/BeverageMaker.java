package com.hervey.app;

public class BeverageMaker {
	
	public static Beverage pickCreateBeverage(boolean alcohol, boolean flavoring, boolean supersweet, boolean carbonated) {
		Beverage beverage;
		if(!alcohol && !flavoring && !supersweet && carbonated) {
			beverage = new TapWater();
		}
		else {
			beverage = new ErrorBeverage();
		}
		
		
		return beverage;
		
		
	
	}
	

}
