package ch05;

import becker.robots.*;

public class EscapeBot extends RobotSE {
	public EscapeBot(City aCity, int aStreet, int anAvenue, Direction aDir, int numThings) {
		super(aCity, aStreet, anAvenue, aDir, numThings);
	}

	public void escape() {
		// go to a wall first
		while (this.frontIsClear()) {
			this.move();
		}
		// you are at a wall, now go around the room looking for the exit
		// start with this wall
		this.turnLeft();
		do {
			if (!this.frontIsClear()) {
				this.turnLeft();
			}
			this.move();			
		} while (this.rightIsBlocked());
		this.move();
	}
	
	public boolean rightIsBlocked() {
		this.turnRight();
		if (this.frontIsClear()) {
			return false;
		} else {
			this.turnLeft();
			return true;
		}
	}
}