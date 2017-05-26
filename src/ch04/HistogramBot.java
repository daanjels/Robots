package ch04;

import becker.robots.*;

public class HistogramBot extends RobotSE {
	/** Create a robot that distributes piled up objects vertically into columns
	 * @param aChart		The robot's 'city'.
	 * @param aColumn		The robot's initial row.
	 * @param aRow			The robot's initial column.
	 * @param aDir			The robot's initial direction.
	 * @param numThings		The number of things initially in the robot's backpack. */
	public HistogramBot(City aChart, int aColumn, 
			int aRow, Direction aDir, int numThings) {
		super(aChart, aColumn, aRow, aDir, numThings);
	}
	
	public void findPile() {
		while (!this.canPickThing()) {
			this.move();
		}
		this.pickAllThings();
	}

	public void distributeThings() {
		if (this.countThingsInBackpack() > 1) {
			this.turnLeft();
			this.putThing();
			while (this.countThingsInBackpack() > 0) {
				this.move();
				this.putThing();
			}
			this.turnAround();
			while (this.getStreet() < 9) {
				this.move();
			}
			this.turnLeft();
		} else {
			this.putThing();
		}
	}
}