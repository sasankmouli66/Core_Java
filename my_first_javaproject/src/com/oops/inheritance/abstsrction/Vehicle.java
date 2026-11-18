package com.oops.inheritance.abstsrction;

public abstract class Vehicle implements GPS{

	Vehicle(){
		System.out.println("Vehicle No args Constructor !!");
	}
	
	public void move() {
		System.out.println("Car move Four Wheels");
	}
	
	@Override
	public void navigate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCurrentLocation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDistanceCalculation(String source, String destination) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findNearestLocation(String location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void estimateDistance(int distance) {
		// TODO Auto-generated method stub
		
	}

}
