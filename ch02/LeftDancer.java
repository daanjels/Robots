package ch02;

import becker.robots.*;

/**
 * this dancer bots overrides the move method of it's supperclass
 * any moves within the move method have to be performed by the superclass
 * using the super. pointer
 * @author arq
 *
 */
public class LeftDancer extends RobotSE {

	public LeftDancer(City aCity, int aStreet, int anAvenue, Direction aDirection) {
		super(aCity, aStreet, anAvenue, aDirection);
	}
	public void move() {
		this.turnLeft();
		super.move(); // to make sure it doesn't use this method, creating a loop
		this.turnRight();
		super.move();
		this.turnRight();
		super.move();
		this.turnLeft();
	}
}
