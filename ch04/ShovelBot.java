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
}