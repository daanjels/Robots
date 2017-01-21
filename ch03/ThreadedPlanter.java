package ch03;
import becker.robots.*;

/**
 * A robot that plants near walls
 * @author arq
 *
 */
public class ThreadedPlanter extends RobotSE implements Runnable {
	public ThreadedPlanter (City aCity, int aStreet, int anAvenue, Direction aDir, int numThings) {
		super (aCity, aStreet, anAvenue, aDir, numThings);
	}
	
	public void run() {
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
