**Purpose is demonstration/example of Dependency Injection.**  The project does that, but additional work would be needed to complete the structure and capability of the application's potential as a beverage API. Examples include restructuring packages and creating a Person class to house the attributes of various beverage drinkers.

This simple demo/reference project uses Factory "type" pattern:

* BeverageApp houses the main method and entry point
* BeverageMaker creates objects of Declared Type/reference type = the Beverage Interface.  The object/run/actual type will be the specific type of beberage such as TapWater, or DrPepper, or ClubSoda
* Beverage is the interface specifying the contract all beverages must adhere
* Each specific beverage will have its own classes such as: TapWater, or DrPepper, or ClubSoda
* BeverageService manages the needs for new classes and causes the creation of proper object

It is built for extensibility and flexibility so more beverage types and more sophisticated selection criteria can easily be implemented
