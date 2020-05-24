package com.hervey.app;

public class ClubSoda implements Beverage {

	public ClubSoda() {
		System.out.println("Club Soda created");
	}

	@Override
	public boolean satisfyThirst() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean resealableContainer = false;
	
	
}
