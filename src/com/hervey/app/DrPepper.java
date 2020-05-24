package com.hervey.app;

public class DrPepper implements Beverage {
	
	public DrPepper() {
		System.out.println("Liquid Happiness created");
		
		
	}

	@Override
	public boolean satisfyThirst() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
	
	public boolean resealableContainer = true;




	@Override
	public boolean isItResealable() {
		// TODO Auto-generated method stub
		return true;
	}
	

}
