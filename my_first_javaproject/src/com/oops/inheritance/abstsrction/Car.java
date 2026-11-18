package com.oops.inheritance.abstsrction;

public class Car extends Vehicle{

	Car(){
		System.out.println("Car No args Constructor");
	}
	
	Car(String brand){
		System.out.println("Car brand Name");
	}
	
	@Override
	public void navigate() {
		// TODO Auto-generated method stub
		
	}
	
	public void move() {
		System.out.println("Car Can move four Wheels");
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
