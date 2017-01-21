package ch03;
import becker.robots.*;

/**
 * A robot that plants near walls
 * @author arq
 *
 */
public class Planter extends RobotSE {
	public Planter (City aCity, int aStreet, int anAvenue, Direction aDir, int numThings) {
		super (aCity, aStreet, anAvenue, Direction.NORTH, 20);
	}
	
	public void plantStuff () {
		this.turnRight();
		this.move(3);
		this.plantCorner();
		this.turnRight();
		this.move();
		this.plantCorner();
		this.turnRight();
		this.move();
		this.plantCorner();
		this.turnRight();
		this.move();
		this.plantCorner();
		this.turnLeft();
		this.move(2);
		this.turnRight();		
	}
	
	private void plantCorner() {
		this.putThing();
		this.turnRight();
		this.move();
		this.putThing();
		this.move();
		this.putThing();
		this.turnLeft();
		this.move();
		this.putThing();
		this.move();
		this.putThing();
//		this.turnRight();
//		this.move();
	}

}
