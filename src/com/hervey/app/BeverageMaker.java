package com.hervey.app;

public class BeverageMaker {

	
	/**<pickCreateBeverage>
	 * uses parameters to pick a beverage
	 * @param alcohol
	 * @param flavoring
	 * @param supersweet
	 * @param carbonated
	 * @return
	 */
	public static Beverage pickCreateBeverage(boolean alcohol, boolean flavoring, boolean supersweet,
			boolean carbonated) {
		Beverage beverage;

		if (!alcohol && !flavoring && !supersweet && !carbonated) {
			beverage = new TapWater();
		}

		else if (!alcohol && flavoring && !supersweet && carbonated) {
			if(BeverageService.isPepsiOnSale) {
				beverage = new Pepsi();
			}
			else {
				beverage = new DrPepper();
			}
		}

		else if (!alcohol && !flavoring && !supersweet && carbonated) {
			beverage = new ClubSoda();
		}

		else {

			beverage = new ErrorBeverage();

		}

		return beverage;

	}

	public static Beverage giveMeTapWater() {
		Beverage beverage = new TapWater();
		return beverage;
		
	}

}
