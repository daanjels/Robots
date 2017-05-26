package ch02;

import becker.robots.*;

/**	A new kind of robot that can turn around, turn right and move forward three intersections
 * at a time
 * @author arq 2016
 */

public class ExperimentRobot extends Robot {
	//	list of attributes
	//	list of constructors
	/**	Construct a new ExperimentRobot
	 * 
	 * @param aCity			The city in which the robot will be located
	 * @param aStreet		The robot's initial street
	 * @param anAvenue		The robot's initial avenue
	 * @param aDirection	The robot's initial direction
	 */
	public ExperimentRobot(City aCity, int aStreet, int anAvenue, Direction aDirection) {
		super(aCity, aStreet, anAvenue, aDirection);
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
