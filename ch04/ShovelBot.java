package ch04;

import becker.robots.*;

public class ShovelBot extends RobotSE {
	/** Create a new rectangle planter.
	 * @param aCity			The robot's city.
	 * @param aStreet		The robot's initial street.
	 * @param anAvenue		The robot's initial avenue.
	 * @param aDir			The robot's initial direction.
	 * @param numThings		The number of things initially in the robot's backpack. */
	public ShovelBot(City aCity, int aStreet, 
			int anAvenue, Direction aDir, int numThings) {
		super(aCity, aStreet, anAvenue, aDir, numThings);
	}
	
	public void findDriveway() {
		this.turnLeft();
		while (!this.frontIsClear()) {
			this.turnRight();
			this.move();
			this.turnLeft();
		}
	}
	public void clearDriveway() {
		while (this.frontIsClear()) {
			this.move();
			if (this.canPickThing()) {
				this.pickThing();
			}
		}
		this.turnRight();
		if (this.frontIsClear()) {
			this.move();
		}
		this.turnRight();
		while (this.frontIsClear()) {
			if (this.canPickThing()) {
				this.pickThing();
			}
			this.move();
		}
		this.putAllThings();
		this.turnLeft();
	}
	public void clearSidewalk() {
		while (this.frontIsClear()) {
			if (this.canPickThing()) {
				this.pickAllThings();
			}
			this.move();
		}
		this.putAllThings();
	}
}