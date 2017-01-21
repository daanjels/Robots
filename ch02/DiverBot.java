package ch02;
import becker.robots.*;

/**
 * karel takes a dive
 * @author arq
 *
 */
public class DiverBot extends RobotSE {

	public DiverBot(City aCity, int aStreet, int anAvenue, Direction aDirection) {
		super(aCity, aStreet, anAvenue, aDirection);
	}
	public void dive() {
		this.move();
		this.turnRight();
		this.move();
		this.turnRight();
		this.move();
		this.turnAround();
		this.turnAround();
		this.move();
		this.turnAround();
		this.turnAround();
		this.move();
		this.move();
		this.turnAround();		
	}
}
