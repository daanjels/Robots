package ch02;
import becker.robots.*;

/**
 * 
 * @author arq
 *
 */
public class SoccerBot extends RobotSE {
	public SoccerBot(City aCity, int aStreet, int anAvenue, Direction aDirection) {
		super(aCity, aStreet, anAvenue, aDirection);
	}
	public void advance() {
		this.pickThing();
		this.move(2);
		this.putThing();
	}
	public void advanceLeft() {
		this.pickThing();
		this.turnLeft();
		this.move();
		this.turnRight();
		this.move(2);
		this.putThing();
	}
	public void advanceRight() {
		this.pickThing();
		this.move(2);
		this.turnRight();
		this.move();
		this.turnLeft();
		this.putThing();
	}

}
