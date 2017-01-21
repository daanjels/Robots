package ch02;
import becker.robots.*;

/**
 * extending RobotSE to create a robot that leave crumbes behind
 * 
 * @author arq
 *
 */
public class TrailBot extends RobotSE {

	public TrailBot(City aCity, int aStreet, int anAvneue, Direction aDirection) {
		super(aCity, aStreet, anAvneue, aDirection, 100);
	}
	public void trailMove() {
		this.putThing();
		this.move();
	}
}
