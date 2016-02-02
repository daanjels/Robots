package ch02;

import becker.robots.*;

public class ExperimentRobot extends Robot {
	//	list of attributes
	//	list of constructors
	public ExperimentRobot(City aCity, int aStreet, int anAvenue, Direction aDirection) {
		super(aCity, aStreet, anAvenue, aDirection);
		// TODO Auto-generated constructor stub
	}
	//	list of services
	
	//	turn this robot around
	public void turnAround() {
		this.turnLeft();
		this.turnLeft();
	}
	//	move this robot forward 3 times
	public void move3() {
		this.move();
		this.move();
		this.move();
	}
	//	turn this robot around and the left
	public void turnRight() {
		this.turnAround();
		this.turnLeft();
	}

}
