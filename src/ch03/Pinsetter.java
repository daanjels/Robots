package ch03;
import becker.robots.*;

/** 
 * Robot that sets the pins in a bowling alley
 * @author arq
 *
 */
public class Pinsetter extends RobotSE {
	public Pinsetter (City aCity, int aStreet, int anAvenue, Direction aDirection, int numThings) {
		super(aCity, aStreet, anAvenue, aDirection, numThings);
	}
	
	public void setPins() {
		this.move();
		this.pickAndLeft();
		this.pickAndLeft();
		this.pickAndLeft();
		this.pickAndRight();
		this.turnRight();
		this.pickAndRight();
		this.pickAndRight();
		this.pickAndLeft();
		this.pickAndLeft();
		this.pickAndTurn();
		this.pickAndLeft();
		this.move();
		this.turnLeft();
		this.move(4);
		this.turnAround();
	}
	private void pickAndLeft() {
		this.move();
		this.putThing();
		this.turnLeft();
		this.move();
		this.turnRight();
	}
	private void pickAndRight() {
		this.move();
		this.putThing();
		this.turnRight();
		this.move();
		this.turnLeft();
	}
	private void pickAndTurn() {
		this.move();
		this.putThing();
		this.turnAround();
		this.move();
	}
}