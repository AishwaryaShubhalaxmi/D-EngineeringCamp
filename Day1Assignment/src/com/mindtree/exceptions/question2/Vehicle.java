package com.mindtree.exceptions.question2;

public class Vehicle {
	
	private int currentSpeed;
	private int maximumSpeed;
	
	public Vehicle() { }
	
	public Vehicle(int current, int maximum){
		
		currentSpeed = current;
		maximumSpeed = maximum;
		
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public int getMaximumSpeed() {
		return maximumSpeed;
	}

	public void setMaximumSpeed(int maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}
	
	public int increaseSpeed(int speed) throws SpeedMoreThanMaxSpeedException {
		try{
		
		if((currentSpeed + speed) > maximumSpeed){
			throw new SpeedMoreThanMaxSpeedException("Speed is more than maximum speed");
		}
	
		return currentSpeed + speed;
		}finally{
			
		}
}
}

