package com.hervey.app;

public class ErrorBeverage implements Beverage {
	//tapwater is free and comes with no container...just water and whatever minerals came from the
	
	public  ErrorBeverage() {
		System.out.println("Reached in error; errorBeverage created");
	}

	@Override
	public boolean satisfyThirst() {
		System.out.println("TapWater satisfies thirs");
		return false;
	}

	public boolean resealableContainer = false;

	@Override
	public boolean isItResealable() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
