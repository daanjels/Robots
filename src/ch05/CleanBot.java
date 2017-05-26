package ch05;

import becker.robots.*;

public class CleanBot extends RobotSE {
	public CleanBot(City aCity, int aStreet, int anAvenue, Direction aDirection, int numThings) {
		super(aCity, aStreet, anAvenue, aDirection, numThings);
	}
	
	public void cleanRoom() {
		this.cleanRow();
		while (this.frontIsClear()) {// as long as we can go further south do so
			this.move();
			if (this.getAvenue() > 0) {// if we are in the east, turn to the west
				this.turnRight();//
			} else {// if we are in the west (first avenue), turn to the east
				this.turnLeft();
			}
			this.cleanRow();
		}
		if (this.getAvenue() > 0) {
			this.turnRight();
			while (this.frontIsClear()) {
				this.move();
			}
			this.turnRight();
		} else {
			this.turnLeft();
			this.turnLeft();
		}
		while (this.frontIsClear()) {
			this.move();
		}
	}
	
	public void cleanRow() {
		if (this.canPickThing()) {// if anything on the start intersection, pick it all up
			this.pickAllThings();
		}
		while (this.frontIsClear()) {// go as far you can
			this.move();
			if (this.canPickThing()) {// pick up anything you find
				this.pickAllThings();
			}
		}
		if (this.getDirection() == Direction.EAST) {// make sure to face south, we started in the north
			this.turnRight();
		} else {
			this.turnLeft();
		}
	}
}
