Factory type pattern
	*BeverageApp houses the main method and entry point
	*BeverageMaker creates objects of Declared Type/reference type = the Beverage Interface.  The object/run/actual type will be the specific type of beberage such as TapWater, or DrPepper, or ClubSoda
	*Beverage is the interface specifying the contract all beverages must adhere
	*Each specific beverage will have its own classes such as: TapWater, or DrPepper, or ClubSoda
	*BeverageService manages the needs for new classes and causes the creation of   

