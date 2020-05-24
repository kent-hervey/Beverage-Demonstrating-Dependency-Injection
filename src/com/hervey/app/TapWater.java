package com.hervey.app;

public class TapWater implements Beverage {
	
	public  TapWater() {
		System.out.println("TapWater object created");
	}

	@Override
	public boolean satisfyThirst() {
		System.out.println("TapWater satisfies thirs");
		return false;
	}

}
