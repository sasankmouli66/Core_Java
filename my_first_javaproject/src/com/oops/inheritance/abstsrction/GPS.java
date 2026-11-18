package com.oops.inheritance.abstsrction;

public interface GPS {
	
	void navigate();
	
	void getCurrentLocation();
	
	void getDistanceCalculation(String source,String destination);
	
	void findNearestLocation(String location);
	
	void estimateDistance(int distance);

}
