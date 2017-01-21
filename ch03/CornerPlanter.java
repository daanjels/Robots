package ch03;
import becker.robots.*;

/**
 * A robot that plants near walls
 * @author arq
 *
 */
public class CornerPlanter extends RobotSE {
	public CornerPlanter (City aCity, int aStreet, int anAvenue, Direction aDir, int numThings) {
		super (aCity, aStreet, anAvenue, aDir, numThings);
	}
	
	public void plantCorner() {
		this.putThing();
		this.move();
		this.putThing();
		this.move();
		this.putThing();
		this.turnLeft();
		this.move();
		this.putThing();
		this.move();
		this.putThing();
	}

}
